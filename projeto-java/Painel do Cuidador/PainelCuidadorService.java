import java.util.ArrayList;

public class PainelCuidadorService {

    private Usuario idoso;

    private ArrayList<Medicamento> medicamentos;
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Consulta> consultas;
    private ArrayList<Ocorrencia> ocorrencias;
    private ArrayList<Alerta> alertas;

    public PainelCuidadorService(Usuario idoso) {
        this.idoso = idoso;

        medicamentos = new ArrayList<>();
        tarefas = new ArrayList<>();
        consultas = new ArrayList<>();
        ocorrencias = new ArrayList<>();
        alertas = new ArrayList<>();
    }

    // ADICIONAR DADOS
    public void addMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public void addTarefa(Tarefa t) {
        tarefas.add(t);
    }

    public void addConsulta(Consulta c) {
        consultas.add(c);
    }

    public void addOcorrencia(Ocorrencia o) {
        ocorrencias.add(o);
    }

    public void addAlerta(Alerta a) {
        alertas.add(a);
    }

    // 📊 VISÃO GERAL (PAINEL)
    public void exibirPainel() {

        System.out.println("\n=====================================");
        System.out.println("        PAINEL DO CUIDADOR");
        System.out.println("=====================================");

        System.out.println("Idoso em acompanhamento: " + idoso.getNome());

        System.out.println("\n--- Medicamentos do Dia ---");
        for (Medicamento m : medicamentos) {
            m.exibir();
        }

        System.out.println("\n--- Tarefas Pendentes ---");
        for (Tarefa t : tarefas) {
            if (!t.isConcluida()) {
                t.exibir();
            }
        }

        System.out.println("\n--- Próximas Consultas ---");
        for (Consulta c : consultas) {
            c.exibir();
        }

        System.out.println("\n--- Alertas Recentes ---");
        for (Alerta a : alertas) {
            a.exibir();
        }

        System.out.println("\n--- Ocorrências ---");
        for (Ocorrencia o : ocorrencias) {
            o.exibir();
        }

        System.out.println("\n=====================================");
    }
}