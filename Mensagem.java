import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem {

    private Usuario remetente;
    private String conteudo;
    private LocalDateTime dataHora;

    public Mensagem(Usuario remetente, String conteudo) {
        this.remetente = remetente;
        this.conteudo = conteudo;
        this.dataHora = LocalDateTime.now();
    }

    public void exibir() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("[" + dataHora.format(formato) + "]");
        System.out.println(remetente.getTipo() + ": " + remetente.getNome());
        System.out.println("Mensagem: " + conteudo);
        System.out.println("-----------------------------------");
    }
}