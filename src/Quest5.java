
public class Quest5 {

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
