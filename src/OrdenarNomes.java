import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNomes {

    public static void main(String[] args) {
        // Chama o método para ordenar os nomes
        OrdenarNomes1();

        // Chama o método para separar por gênero
        SepararPorGenero.separarPorGenero();
    }

    private static void OrdenarNomes1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes das pessoas separados por vírgula: ");
        String entrada = scanner.nextLine();

        // Separando os nomes usando a vírgula como delimitador
        String[] nomesArray = entrada.split(",");

        // Criando uma lista para armazenar os nomes
        ArrayList<String> nomesList = new ArrayList<>();

        // Adicionando os nomes à lista com trim() para remover espaços extras
        for (String nome : nomesArray) {
            nomesList.add(nome.trim());
        }

        // Ordenando a lista de nomes em ordem alfabética
        Collections.sort(nomesList);

        // Imprimindo os nomes ordenados
        System.out.println("\nNomes ordenados:");
        for (String nome : nomesList) {
            System.out.println(nome);
        }
    }
}
