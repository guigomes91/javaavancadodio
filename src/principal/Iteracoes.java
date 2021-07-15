package principal;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Guilherme Gomes
 */
public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Guilherme", "Joao", "Jose", "Paulo", "Pedro", "Lucas"};
        Integer[] numeros = {1, 2, 3, 4, 5, 6};
        
        /*imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
        imprimirODobroDeCadaItemDaLista(numeros);*/
        
        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de Projetos");
        profissoes.add("Gerente de Qualidade");
        
        profissoes
                .stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }
    
    public static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImprimir = "";
        
        for(int i = 0; i < nomes.length; i++) {
            if(nomes[i].equals("Guilherme")) {
               nomesParaImprimir += " " + nomes[i];
            }
        }
        
        System.out.println("Nomes do For: " + nomesParaImprimir);
        
        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Guilherme"))
                .collect(Collectors.joining());
                
        System.out.println("Nomes da Stream: " + nomesParaImprimirDaStream);
    }
    
    public static void imprimirTodosNomes(String... nomes) {
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimindo pelo For Each -> " + nome));
    }
    
    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros) {
        Stream.of(numeros).map(numero -> numero * 2).forEach(System.out::println);
    }
}
