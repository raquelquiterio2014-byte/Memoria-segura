public class Usuario {

    private String nome;

    private String telefone;

    private String tipoUsuario;

    public Usuario(
            String nome,
            String telefone,
            String tipoUsuario
    ) {

        this.nome = nome;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
