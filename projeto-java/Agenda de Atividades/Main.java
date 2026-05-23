import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Atividade> lista = new ArrayList<>();

        int opcao;

        System.out.println("=====================================");
        System.out.println("   AGENDA DE ATIVIDADES DIÁRIAS   ");
        System.out.println("=====================================");

        do {

            System.out.println("\n=========== MENU ===========");
            System.out.println("1 - Cadastrar atividade");
            System.out.println("2 - Listar atividades");
            System.out.println("3 - Marcar atividade como concluída");
            System.out.println("4 - Marcar atividade como pendente");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\n=== NOVA ATIVIDADE ===");

                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();

                    System.out.print("Horário (ex: 08:00): ");
                    String hora = sc.nextLine();

                    System.out.print("Observação: ");
                    String obs = sc.nextLine();

                    Atividade nova = new Atividade(desc, hora, obs);
                    lista.add(nova);

                    int idGerado = lista.size() - 1;

                    System.out.println("\nAtividade cadastrada com sucesso!");
                    System.out.println("ID: " + idGerado + " | " + desc + " às " + hora);

                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhuma atividade cadastrada.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println("\nID: " + i);
                            lista.get(i).exibir();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID da atividade: ");
                    int idConcluir = sc.nextInt();

                    if (idConcluir >= 0 && idConcluir < lista.size()) {
                        lista.get(idConcluir).concluir();
                        System.out.println("Atividade concluída!");
                    } else {
                        System.out.println("ID inválido!");
                    }
                    break;

                case 4:
                    System.out.print("Digite o ID da atividade: ");
                    int idPendente = sc.nextInt();

                    if (idPendente >= 0 && idPendente < lista.size()) {
                        lista.get(idPendente).pendente();
                        System.out.println("Atividade marcada como pendente!");
                    } else {
                        System.out.println("ID inválido!");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}