public class Rotina {

    private String atividade;
    private String horario;
    private boolean concluida;

    public Rotina(String atividade, String horario) {
        this.atividade = atividade;
        this.horario = horario;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
    }

    public void exibir(int id) {
        String status = concluida ? "✔ Concluída" : "Pendente";

        System.out.println("ID: " + id);
        System.out.println("Atividade: " + atividade);
        System.out.println("Horário: " + horario);
        System.out.println("Status: " + status);
        System.out.println("---------------------------");
    }
}