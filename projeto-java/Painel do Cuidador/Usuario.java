public class Usuario {

    private String nome;
    private String tipo; // Idoso, Cuidador, etc.

    public Usuario(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}