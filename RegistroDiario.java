import java.util.ArrayList;

public class RegistroDiario {

    private Usuario usuario;
    private String data;

    private String medicacao;
    private String alimentacao;
    private String sono;
    private String consultas;
    private String evolucao;

    private ArrayList<String> tarefasConcluidas;
    private ArrayList<String> episodiosEsquecimento;
    private ArrayList<Ocorrencia> ocorrencias;

    public RegistroDiario(Usuario usuario, String data) {
        this.usuario = usuario;
        this.data = data;

        tarefasConcluidas = new ArrayList<>();
        episodiosEsquecimento = new ArrayList<>();
        ocorrencias = new ArrayList<>();
    }

    // setters
    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public void setSono(String sono) {
        this.sono = sono;
    }

    public void setConsultas(String consultas) {
        this.consultas = consultas;
    }

    public void setEvolucao(String evolucao) {
        this.evolucao = evolucao;
    }

    public void adicionarTarefa(String tarefa) {
        tarefasConcluidas.add(tarefa);
    }

    public void adicionarEsquecimento(String e) {
        episodiosEsquecimento.add(e);
    }

    public void adicionarOcorrencia(Ocorrencia o) {
        ocorrencias.add(o);
    }

    // 📄 RELATÓRIO COMPLETO
    public void gerarRelatorio() {

        System.out.println("\n=====================================");
        System.out.println("        RELATÓRIO DIÁRIO");
        System.out.println("=====================================");

        System.out.println("Paciente: " + usuario.getNome());
        System.out.println("Data: " + data);

        System.out.println("\n--- Medicação ---");
        System.out.println(medicacao);

        System.out.println("\n--- Alimentação ---");
        System.out.println(alimentacao);

        System.out.println("\n--- Sono ---");
        System.out.println(sono);

        System.out.println("\n--- Consultas ---");
        System.out.println(consultas);

        System.out.println("\n--- Evolução Observada ---");
        System.out.println(evolucao);

        System.out.println("\n--- Tarefas Concluídas ---");
        for (String t : tarefasConcluidas) {
            System.out.println("- " + t);
        }

        System.out.println("\n--- Episódios de Esquecimento ---");
        for (String e : episodiosEsquecimento) {
            System.out.println("- " + e);
        }

        System.out.println("\n--- Ocorrências ---");
        for (Ocorrencia o : ocorrencias) {
            System.out.println("- " + o.getDescricao());
        }

        System.out.println("\n=====================================");
    }
}