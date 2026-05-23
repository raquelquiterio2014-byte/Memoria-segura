public class Alerta {

    private String mensagem;

    public Alerta(String mensagem) {
        this.mensagem = mensagem;
    }

    public void exibir() {
        System.out.println("- " + mensagem);
    }
}