import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Quest4 {

        /* Faça um programa que recebe o nome de 3 candidatos e inicia
        uma votação (10 votos). Para votar, o eleitor deve escrever o
        nome do candidato. Caso o eleitor vote em um nome que não existe,
        deverá ser contabilizado um voto nulo. Ao final da votação, mostre
        o vencedor da eleição com a porcentagem.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] candidatosArray = new String[3];
        System.out.println("Informe os nomes dos 3 candidatos:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Candidato %d: ", i + 1);
            candidatosArray[i] = scanner.nextLine();
        }

        Map<String, Integer> candidatos = new HashMap<>();
        for (String candidato : candidatosArray) {
            candidatos.put(candidato, 0);
        }

        System.out.println("\nVotação (Digite o nome do candidato para votar):");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Voto %d: ", i + 1);
            String voto = scanner.nextLine();

            if (candidatos.containsKey(voto)) {
                candidatos.put(voto, candidatos.get(voto) + 1);
            } else {
                System.out.println("Voto nulo.");
            }
        }

        String vencedor = null;
        int maxVotos = 0;
        for (Map.Entry<String, Integer> entry : candidatos.entrySet()) {
            String nomeCandidato = entry.getKey();
            int votos = entry.getValue();

            if (votos > maxVotos) {
                maxVotos = votos;
                vencedor = nomeCandidato;
            }
        }

        double porcentagemVencedor = (double) maxVotos / 10 * 100;

        System.out.println("\nResultado da eleição:");
        for (Map.Entry<String, Integer> entry : candidatos.entrySet()) {
            String nomeCandidato = entry.getKey();
            int votos = entry.getValue();
            double porcentagem = (double) votos / 10 * 100;

            System.out.printf("%s: %d votos (%.2f%%)\n", nomeCandidato, votos, porcentagem);
        }

        System.out.printf("\nVencedor: %s com %.2f%% dos votos.\n", vencedor, porcentagemVencedor);
    }
}