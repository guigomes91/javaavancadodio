package principal;

import java.util.function.Supplier;

/**
 *
 * @author Guilherme Gomes
 */
public class Suplidores {
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
        
        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa2.get());
    }
}

class Pessoa {
    private final String nome;
    private final Integer idade;

    public Pessoa() {
        nome = "Guilherme";
        idade = 30;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + '}';
    }
}