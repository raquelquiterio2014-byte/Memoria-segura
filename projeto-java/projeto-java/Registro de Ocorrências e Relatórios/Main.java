import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do paciente: ");
        String nome = sc.nextLine();

        Usuario paciente = new Usuario(nome);

        System.out.print("Data (ex: 15/04/2026): ");
        String data = sc.nextLine();

        RegistroDiario registro = new RegistroDiario(paciente, data);

        System.out.print("Medicação: ");
        registro.setMedicacao(sc.nextLine());

        System.out.print("Alimentação: ");
        registro.setAlimentacao(sc.nextLine());

        System.out.print("Sono: ");
        registro.setSono(sc.nextLine());

        System.out.print("Consultas: ");
        registro.setConsultas(sc.nextLine());

        System.out.print("Evolução observada: ");
        registro.setEvolucao(sc.nextLine());

        // tarefas
        System.out.print("Quantas tarefas concluídas? ");
        int qtdTarefas = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdTarefas; i++) {
            System.out.print("Tarefa: ");
            registro.adicionarTarefa(sc.nextLine());
        }

        // esquecimentos
        System.out.print("Quantos episódios de esquecimento? ");
        int qtdEsq = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdEsq; i++) {
            System.out.print("Descreva: ");
            registro.adicionarEsquecimento(sc.nextLine());
        }

        // ocorrências
        System.out.print("Quantas ocorrências? ");
        int qtdOcor = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdOcor; i++) {
            System.out.print("Ocorrência: ");
            String desc = sc.nextLine();
            registro.adicionarOcorrencia(new Ocorrencia(desc));
        }

        // 📄 gerar relatório
        registro.gerarRelatorio();

        sc.close();
    }
}