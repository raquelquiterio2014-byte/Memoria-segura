import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class AgendadorMedicamento {

    private Medicamento medicamento;

    private List<Usuario> usuarios;

    public AgendadorMedicamento(
            Medicamento medicamento,
            List<Usuario> usuarios
    ) {

        this.medicamento = medicamento;
        this.usuarios = usuarios;
    }

    public void iniciarAlertas() {

        agendar(30);

        agendar(20);

        agendar(10);

        agendar(0);
    }

    private void agendar(
            int minutosAntes
    ) {

        try {

            LocalTime horario =
                    LocalTime.parse(
                            medicamento.getHorario()
                    );

            LocalDateTime agora =
                    LocalDateTime.now();

            LocalDateTime alerta =
                    LocalDateTime.of(
                            agora.toLocalDate(),
                            horario
                    ).minusMinutes(minutosAntes);

            long delay =
                    Duration.between(
                            agora,
                            alerta
                    ).toMillis();

            if (delay < 0) {

                delay = 0;
            }

            Timer timer = new Timer();

            timer.schedule(
                    new TimerTask() {

                        @Override
                        public void run() {

                            for (
                                    Usuario usuario
                                    : usuarios
                            ) {

                                NotificacaoService
                                        .enviarMensagem(
                                                usuario,
                                                medicamento,
                                                minutosAntes
                                                        + " minutos"
                                        );
                            }
                        }
                    },
                    delay
            );

        } catch (Exception e) {

            System.out.println(
                    "Erro: "
                            + e.getMessage()
            );
        }
    }
