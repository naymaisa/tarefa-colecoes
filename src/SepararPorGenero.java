import java.util.ArrayList;
import java.util.Scanner;

public class SepararPorGenero {

    // Método estático para separar por gênero
    public static void separarPorGenero() {
        Scanner scanner = new Scanner(System.in);

        // Criando listas para armazenar os nomes de cada grupo
        ArrayList<String> grupoMasculino = new ArrayList<>();
        ArrayList<String> grupoFeminino = new ArrayList<>();

        // Leitura dos dados até o usuário digitar "sair"
        while (true) {
            System.out.println("Digite o nome e o sexo da pessoa (nome-sexo), ou digite 'sair' para terminar:");
            String entrada = scanner.nextLine();

            // Condição para encerrar o loop se o usuário digitar 'sair'
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            // Separando o nome e o sexo com base no traço "-"
            String[] partes = entrada.split("-");

            // Verificando se a entrada foi no formato correto
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                // Verificando o sexo e adicionando ao grupo correspondente
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

        // Exibindo os resultados
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
