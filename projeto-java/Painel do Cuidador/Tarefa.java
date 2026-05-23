public class Tarefa {

    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    public void exibir() {
        String status = concluida ? "✔" : "PENDENTE";
        System.out.println("- " + descricao + " [" + status + "]");
    }
}