import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();


        System.out.println("====================================");
        System.out.println("   SISTEMA DE CUIDADOS AO IDOSO   ");
        System.out.println("====================================");
        System.out.println("Bem-vindo ao sistema!\n");

        int opcao;

        do {

            System.out.println("\n=========== MENU PRINCIPAL ===========");
            System.out.println("1 - 📝 Cadastro do Usuário");
            System.out.println("2 - 📋 Listar Usuários");
            System.out.println("3 - ❌ Sair do Sistema");
            System.out.println("=====================================");
            System.out.print("Escolha uma opção: ");


            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();

                System.out.print("Telefone: ");
                String telefone = sc.nextLine();

                System.out.print("Tipo (Idoso/Cuidador/Familiar): ");
                String tipo = sc.nextLine();

                Usuario u = new Usuario(nome, idade, telefone, tipo);
                listaUsuarios.add(u);

                System.out.println("Usuário cadastrado!");

            } else if (opcao == 2) {

                for (Usuario u : listaUsuarios) {
                    u.exibirDados();
                }

            }

        } while (opcao != 3);

        sc.close();
    }

    public static class Usuario {
        private String nome;
        private int idade;
        private String telefone;
        private String tipoUsuario;

        public Usuario(String nome, int idade, String telefone, String tipoUsuario) {
            this.nome = nome;
            this.idade = idade;
            this.telefone = telefone;
            this.tipoUsuario = tipoUsuario;
        }

        public void exibirDados() {
            System.out.println("\n=== DADOS DO USUÁRIO ===");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Telefone: " + telefone);
            System.out.println("Tipo: " + tipoUsuario);
        }
    }
}
