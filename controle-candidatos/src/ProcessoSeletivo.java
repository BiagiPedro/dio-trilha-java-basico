import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        String[] candidatos = { "Marcia", "Pedro", "Marco", "Laura", "Gabriel" };

        imprimirSelecao(candidatos);
        processarCandidatos(candidatos);
    }

    static void imprimirSelecao(String[] candidatos) {
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato " + candidatos[i] + " está na posição " + (i + 1));
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        if (2000.0 > salarioPretendido) {
            System.out.println("Ligar para candidato");
            realizarLigacoes();
        } else if (2000.0 == salarioPretendido) {
            System.out.println("Ligar para candidato com contra-proposta");
            realizarLigacoes();
        } else {
            System.out.println("Aguardando o resultado dos demais");
        }
    }

    static void processarCandidatos(String[] candidatos) {
        for (String candidato : candidatos) {
            double salarioPretendido = gerarSalarioAleatorio();
            System.out.println("Candidato " + candidato + " pretende um salário de R$ " + salarioPretendido);
            analisarCandidato(salarioPretendido);
        }
    }

    static double gerarSalarioAleatorio() {
        // Gera um salário aleatório entre R$1500.0 e R$2500.0
        return ThreadLocalRandom.current().nextDouble(1500.0, 2500.0);
    }

    static void realizarLigacoes() {
        boolean atendeu = false;
        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            System.out.println("Tentativa de ligação " + tentativa);
            atendeu = tentarContato();
            if (atendeu) {
                System.out.println("PARABÉNS, VOCÊ FOI CONTRATADO");
                break;
            }
        }
        if (!atendeu) {
            System.out.println("Não foi possível contatar o candidato após 3 tentativas.");
        }
    }

    static boolean tentarContato() {
        // Gera um valor booleano aleatório: true (atendeu) ou false (não atendeu)
        return ThreadLocalRandom.current().nextBoolean();
    }
}
