public class Atividade {

    private String descricao;
    private String horario;
    private String observacao;
    private StatusAtividade status;

    public Atividade(String descricao, String horario, String observacao) {
    this.descricao = descricao;
    this.horario = horario;
    this.observacao = observacao;
    this.status = StatusAtividade.PENDENTE;
}

public void concluir() {
    status = StatusAtividade.CONCLUIDA;
}

public void pendente() {
    status = StatusAtividade.PENDENTE;
}

public void exibir() {
    String simbolo = (status == StatusAtividade.CONCLUIDA) ? "✔" : "⏰";

    System.out.println("\n-----------------------------");
    System.out.println("Horário: " + horario);
    System.out.println("Atividade: " + descricao);
    System.out.println("Observação: " + observacao);
    System.out.println("Status: " + simbolo + " " + status);
}
}