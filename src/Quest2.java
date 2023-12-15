public class Quest2 {


     /* Dado uma array turma onde cada um dos seus elementos é
        uma array com as notas de cada um dos alunos, calcule e
        mostre a média de cada aluno e a média da turma.*/

    public static void main(String[] args) {

        double[][] turma = {
                {8, 9, 7.5, 8.5},
                {9.2, 8.8, 7.8, 9.5},
                {8.5, 9.5, 8.8, 9.2}
        };

        calcularMedias(turma);
    }

    public static void calcularMedias(double[][] turma) {
        int Alunos = turma.length;
        int Notas = turma[0].length;

        double[] mediasAlunos = new double[Alunos];
        double mediaTurma = 0;


        for (int i = 0; i < Alunos; i++) {
            double somaNotasAluno = 0;

            for (int j = 0; j < Notas; j++) {
                somaNotasAluno += turma[i][j];
            }

            mediasAlunos[i] = (double) somaNotasAluno / Notas;
        }


        for (int i = 0; i < Alunos; i++) {
            mediaTurma += mediasAlunos[i];
        }
        mediaTurma /= Alunos;


        for (int i = 0; i < Alunos; i++) {
            System.out.printf("Média do aluno %d: %.2f\n", i + 1, mediasAlunos[i]);
        }


        System.out.printf("Média da turma: %.2f\n", mediaTurma);
    }
}

