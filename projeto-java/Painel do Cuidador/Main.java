public class Main {

    public static void main(String[] args) {

        Usuario idoso = new Usuario("Maria", "Idoso");

        PainelCuidadorService painel = new PainelCuidadorService(idoso);

        // dados simulados
        painel.addMedicamento(new Medicamento("Remédio pressão", "08:00"));
        painel.addMedicamento(new Medicamento("Vitamina", "12:00"));

        painel.addTarefa(new Tarefa("Café da manhã"));
        painel.addTarefa(new Tarefa("Caminhada"));

        painel.addConsulta(new Consulta("Cardiologista", "20/04"));

        painel.addAlerta(new Alerta("Esqueceu medicação às 08:00"));

        painel.addOcorrencia(new Ocorrencia("Apresentou confusão mental"));
        painel.addOcorrencia(new Ocorrencia("Não quis se alimentar"));

        // exibir painel
        painel.exibirPainel();
    }
}



