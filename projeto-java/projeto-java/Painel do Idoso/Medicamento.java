public class Medicamento {

    private String nome;
    private String horario;

    public Medicamento(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public void exibir() {
        System.out.println("- " + nome + " às " + horario);
    }
}