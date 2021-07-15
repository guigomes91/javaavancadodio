package principal;

import java.util.function.Function;

/**
 *
 * @author Guilherme Gomes
 */
public class Funcao {
    public static void main(String[] args) {
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiro = string -> Integer.valueOf(string);
        
        System.out.println(retornarNomeAoContrario.apply("Guilherme"));
        System.out.println(converterStringParaInteiro.apply("20"));
    }
}
