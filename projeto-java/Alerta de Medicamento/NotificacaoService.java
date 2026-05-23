public class NotificacaoService {

    public static void enviarMensagem(
            Usuario usuario,
            Medicamento medicamento,
            String tempo
    ) {

        System.out.println("\n==========================");

        System.out.println("ALERTA DE MEDICAMENTO");

        System.out.println("==========================");

        System.out.println(
                "Destinatário: "
                        + usuario.getNome()
        );

        System.out.println(
                "Tipo: "
                        + usuario.getTipoUsuario()
        );

        System.out.println(
                "Medicamento: "
                        + medicamento.getNome()
        );

        System.out.println(
                "Dosagem: "
                        + medicamento.getDosagem()
        );

        System.out.println(
                "Horário: "
                        + medicamento.getHorario()
        );

        System.out.println(
                "Faltam "
                        + tempo
        );
    }
}