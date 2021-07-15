package principal;

import java.util.function.Predicate;

/**
 *
 * @author Guilherme Gomes
 */
public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Gui"));
    }
}
