 public class Usuario {

    private String nome;
    private String tipo; // Cuidador ou Familiar

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