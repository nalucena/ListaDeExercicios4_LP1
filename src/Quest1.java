import java.util.Arrays;

public class Quest1 {

    /* Dado duas arrays A e B, escreva uma função que faça a
       concatenação das arrays de forma alternada. Obs: Ambas as
       arrays sempre serão do mesmo tamanho e não nulas.*/

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] resultado = concatenarAlternado(array1, array2);

        System.out.println(Arrays.toString(resultado));
    }

    public static int[] concatenarAlternado(int[] array1, int[] array2) {
        int tamanho = array1.length * 2;
        int[] resultado = new int[tamanho];

        for (int i = 0, j = 0; i < tamanho; i += 2, j++) {
            resultado[i] = array1[j];
            resultado[i + 1] = array2[j];
        }

        return resultado;
    }
}
