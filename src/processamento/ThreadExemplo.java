package processamento;

/**
 *
 * @author Guilherme Gomes
 */
public class ThreadExemplo {

    public static void main(String[] args) {
        GeradorPDF gerar = new GeradorPDF();
        BarraDeCarregamento barra = new BarraDeCarregamento(gerar);

        gerar.start();
        barra.start();
    }
}

class GeradorPDF extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Iniciar geração de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("PDF gerado!");
    }
}

class BarraDeCarregamento extends Thread {

    private final Thread iniciarGeradorPDF;

    public BarraDeCarregamento(Thread iniciarGeradorPDF) {
        this.iniciarGeradorPDF = iniciarGeradorPDF;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            if (!iniciarGeradorPDF.isAlive()) {
                break;
            }

            System.out.println("Loading...");
        }
    }
}
