import java.util.ArrayList;

public class PainelIdosoService {

    private ArrayList<Medicamento> medicamentos;
    private ArrayList<Rotina> rotinas;

    public PainelIdosoService() {
        medicamentos = new ArrayList<>();
        rotinas = new ArrayList<>();
    }

    // adicionar dados
    public void addMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public void addRotina(Rotina r) {
        rotinas.add(r);
    }

    // exibir medicamentos
    public void mostrarMedicamentos() {
        System.out.println("\n=== MEUS REMÉDIOS ===");

        if (medicamentos.isEmpty()) {
            System.out.println("Nenhum medicamento cadastrado.");
        } else {
            for (Medicamento m : medicamentos) {
                m.exibir();
            }
        }
    }

    // exibir rotina
    public void mostrarRotina() {
        System.out.println("\n=== MINHA ROTINA ===");

        if (rotinas.isEmpty()) {
            System.out.println("Nenhuma atividade cadastrada.");
        } else {
            for (int i = 0; i < rotinas.size(); i++) {
                rotinas.get(i).exibir(i);
            }
        }
    }

    // concluir tarefa
    public void concluirRotina(int id) {
        if (id >= 0 && id < rotinas.size()) {
            rotinas.get(id).concluir();
            System.out.println("Atividade concluída!");
        } else {
            System.out.println("ID inválido!");
        }
    }

    // 🆘 CHAMAR AJUDA
    public void chamarAjuda() {
        System.out.println("\n🚨 AJUDA SOLICITADA!");
        System.out.println("Um cuidador será notificado.");
    }
}