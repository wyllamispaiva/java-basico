
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

    }

    static void imprimirSelecionados() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA" };
        System.out.println("Imprimindo uma lista de candidatos , informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("o candidato de Nª" + (indice + 1) + "é" + candidatos[indice]);

        }
        System.out.println("Forma abreviada de interação for each");
        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi "+candidato);
        }
    }

    static void selecaoCandidatos() {
        // Array com a lista de candidatos

        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("o candidato" + candidato + "Solicitou esse valor de Salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato" + candidato + "foi selesionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");

        } else if (salarioBase == salarioPretendido)
            System.out.println("Ligar com contra proposta");
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");

        }
    }
}
