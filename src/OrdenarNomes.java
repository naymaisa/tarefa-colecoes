import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNomes {

    public static void main(String[] args) {
        OrdenarNomes1();
        SepararPorGenero.separarPorGenero();
    }

    private static void OrdenarNomes1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes das pessoas separados por vírgula: ");
        String entrada = scanner.nextLine();

        String[] nomesArray = entrada.split(",");

        ArrayList<String> nomesList = new ArrayList<>();

        for (String nome : nomesArray) {
            nomesList.add(nome.trim());
        }

        Collections.sort(nomesList);

        System.out.println("\nNomes ordenados:");
        for (String nome : nomesList) {
            System.out.println(nome);
        }
    }
}
