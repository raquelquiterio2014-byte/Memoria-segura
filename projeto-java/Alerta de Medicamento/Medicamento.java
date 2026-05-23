public class Medicamento {

    private String nome;

    private String dosagem;

    private String horario;

    public Medicamento(
            String nome,
            String dosagem,
            String horario
    ) {

        this.nome = nome;
        this.dosagem = dosagem;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public String getHorario() {
        return horario;
    }
}