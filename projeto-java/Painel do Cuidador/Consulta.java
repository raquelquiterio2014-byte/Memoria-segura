public class Consulta {

    private String descricao;
    private String data;

    public Consulta(String descricao, String data) {
        this.descricao = descricao;
        this.data = data;
    }

    public void exibir() {
        System.out.println("- " + descricao + " (" + data + ")");
    }
}