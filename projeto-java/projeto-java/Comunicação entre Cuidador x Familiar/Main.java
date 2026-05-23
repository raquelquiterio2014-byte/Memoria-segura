import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ComunicacaoService comunicacao = new ComunicacaoService();

        Usuario cuidador = new Usuario("Ana", "Cuidador");
        Usuario familiar = new Usuario("Carlos", "Familiar");

        int opcao;

        do {
            System.out.println("\n=========== COMUNICAÇÃO ===========");
            System.out.println("1 - Enviar mensagem (Cuidador)");
            System.out.println("2 - Enviar mensagem (Familiar)");
            System.out.println("3 - Ver mensagens");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o recado: ");
                    String msg1 = sc.nextLine();
                    comunicacao.enviarMensagem(cuidador, msg1);
                    System.out.println("Mensagem enviada!");
                    break;

                case 2:
                    System.out.print("Digite o recado: ");
                    String msg2 = sc.nextLine();
                    comunicacao.enviarMensagem(familiar, msg2);
                    System.out.println("Mensagem enviada!");
                    break;

                case 3:
                    comunicacao.listarMensagens();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        sc.close();
    }
