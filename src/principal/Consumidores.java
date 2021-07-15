package principal;

import java.util.function.Consumer;

/**
 *
 * @author Guilherme Gomes
 */
public class Consumidores {
    public static void main(String[] args) {
        
        Consumer<String> imprimirFrase = System.out::println;
        
        //Consumer<String> imprimirFrase = frase -> System.out.println(frase);
        imprimirFrase.accept("Hello World");
    }
}
