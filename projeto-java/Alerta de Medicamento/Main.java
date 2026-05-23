import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Cadastro medicamento
        System.out.println("=== CADASTRO DE MEDICAMENTO ===");

        System.out.print("Medicamento: ");
        String nomeMedicamento =
                scanner.nextLine();

        System.out.print("Dosagem: ");
        String dosagem =
                scanner.nextLine();

        System.out.print("Horário (HH:mm): ");
        String horario =
                scanner.nextLine();

        Medicamento medicamento =
                new Medicamento(
                        nomeMedicamento,
                        dosagem,
                        horario
                );

        // Cadastro idoso
        System.out.println("\n=== CADASTRO DO IDOSO ===");

        System.out.print("Nome: ");
        String nomeIdoso =
                scanner.nextLine();

        System.out.print("Telefone: ");
        String telefoneIdoso =
                scanner.nextLine();

        Usuario idoso =
                new Usuario(
                        nomeIdoso,
                        telefoneIdoso,
                        "Idoso"
                );

        // Cadastro cuidador
        System.out.println("\n=== CADASTRO DO CUIDADOR ===");

        System.out.print("Nome: ");
        String nomeCuidador =
                scanner.nextLine();

        System.out.print("Telefone: ");
        String telefoneCuidador =
                scanner.nextLine();

        Usuario cuidador =
                new Usuario(
                        nomeCuidador,
                        telefoneCuidador,
                        "Cuidador"
                );

        // Cadastro familiar
        System.out.println("\n=== CADASTRO DO FAMILIAR ===");

        System.out.print("Nome: ");
        String nomeFamiliar =
                scanner.nextLine();

        System.out.print("Telefone: ");
        String telefoneFamiliar =
                scanner.nextLine();

        Usuario familiar =
                new Usuario(
                        nomeFamiliar,
                        telefoneFamiliar,
                        "Familiar"
                );

        // Lista usuários
        List<Usuario> usuarios =
                new ArrayList<>();

        usuarios.add(idoso);

        usuarios.add(cuidador);

        usuarios.add(familiar);

        // Inicializa alertas
        AgendadorMedicamento agendador =
                new AgendadorMedicamento(
                        medicamento,
                        usuarios
                );

        agendador.iniciarAlertas();

        // Sistema fica aguardando silenciosamente
        System.out.println(
                "\nSistema monitorando horários..."
        );
    }
