
public class Quest5 {

    /*  (leetcode - 724. Find Pivot Index) Dada uma matriz de
        números inteiros, calcule o índice pivô dessa matriz. O índice
        pivô é o índice onde a soma de todos os números estritamente à
        esquerda do índice é igual à soma de todos os números
        estritamente à direita do índice. Se o índice estiver na borda
        esquerda da matriz, a soma esquerda será 0 porque não há
        elementos à esquerda. Isso também se aplica à borda direita da
        matriz. Retorna o índice de pivô mais à esquerda. Se tal índice
        não existir, retorne -1. */

    public static void main(String[] args) {
        int[] matriz = {7, 8, 5, 9, 6};
        int indicePivot = acharIndicePivot(matriz);

        System.out.println("O índice pivot é: " + indicePivot);
    }
    public static int acharIndicePivot(int[] nums) {
        int somaTotal = 0;
        int somaEsquerda = 0;

        for (int num : nums) {
            somaTotal += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (somaEsquerda == somaTotal - somaEsquerda - nums[i]) {
                return i;
            }
            somaEsquerda += nums[i];
        }

        return -1;
            }
        }
