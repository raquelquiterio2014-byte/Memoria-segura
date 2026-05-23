public class Ocorrencia {

    private String descricao;

    public Ocorrencia(String descricao) {
        this.descricao = descricao;
    }

    public void exibir() {
        System.out.println("- " + descricao);
    }
}