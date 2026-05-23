import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PainelIdosoService painel = new PainelIdosoService();

        // dados de exemplo
        painel.addMedicamento(new Medicamento("Remédio pressão", "08:00"));
        painel.addMedicamento(new Medicamento("Vitamina", "12:00"));

        painel.addRotina(new Rotina("Café da manhã", "08:00"));
        painel.addRotina(new Rotina("Caminhada", "09:00"));

        int opcao;

        do {
            System.out.println("\n======= PAINEL DO IDOSO =======");
            System.out.println("1 - Meus remédios");
            System.out.println("2 - Minha rotina");
            System.out.println("3 - Concluir atividade");
            System.out.println("4 - Chamar ajuda");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    painel.mostrarMedicamentos();
                    break;

                case 2:
                    painel.mostrarRotina();
                    break;

                case 3:
                    System.out.print("Digite o ID da atividade: ");
                    int id = sc.nextInt();
                    painel.concluirRotina(id);
                    break;

                case 4:
                    painel.chamarAjuda();
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