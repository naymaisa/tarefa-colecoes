import java.util.ArrayList;
import java.util.Scanner;

public class SepararPorGenero {

    public static void separarPorGenero() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> grupoMasculino = new ArrayList<>();
        ArrayList<String> grupoFeminino = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome e o sexo da pessoa (nome-sexo), ou digite 'sair' para terminar:");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = entrada.split("-");

            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    grupoMasculino.add(nome);
                } else if (sexo.equals("F")) {
                    grupoFeminino.add(nome);
                } else {
                    System.out.println("Sexo inválido! Por favor, digite 'M' para masculino ou 'F' para feminino.");
                }
            } else {
                System.out.println("Entrada inválida! Por favor, use o formato 'nome-sexo'.");
            }
        }

        System.out.println("\nGrupo Masculino:");
        for (String nome : grupoMasculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : grupoFeminino) {
            System.out.println(nome);
        }
    }
}
