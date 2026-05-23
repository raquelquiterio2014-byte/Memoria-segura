import java.util.ArrayList;

public class ComunicacaoService {

    private ArrayList<Mensagem> mensagens;

    public ComunicacaoService() {
        mensagens = new ArrayList<>();
    }

    // enviar mensagem
    public void enviarMensagem(Usuario remetente, String texto) {
        Mensagem msg = new Mensagem(remetente, texto);
        mensagens.add(msg);
    }

    // listar mensagens
    public void listarMensagens() {

        System.out.println("\n=====================================");
        System.out.println("      COMUNICAÇÃO CUIDADOR/FAMÍLIA");
        System.out.println("=====================================");

        if (mensagens.isEmpty()) {
            System.out.println("Nenhuma mensagem registrada.");
        } else {
            for (Mensagem m : mensagens) {
                m.exibir();
            }
        }
    }
}