public class Quest3 {

        /* Dado um array nums. Definimos uma soma
        acumulada de um array como nums[i] =
        soma(nums[0]…nums[i]), ou seja, cada elemento deve ser a
        soma de todos os elementos anteriores e o atual. Por fim,
        retorne a array com as somas. */
        public static void main(String[] args) {

            int[] nums = {1, 2, 3, 4};

            int[] resultado = calcularSomaAcumulada(nums);


            for (int num : resultado) {
                System.out.print(num + " ");
            }
        }

    public static int[] calcularSomaAcumulada(int[] nums) {
        int comprimento = nums.length;

        if (comprimento == 0) {
            return new int[0];
        }

        int[] somaAcumulada = new int[comprimento];
        somaAcumulada[0] = nums[0];

        for (int i = 1; i < comprimento; i++) {
            somaAcumulada[i] = somaAcumulada[i - 1] + nums[i];
        }

        return somaAcumulada;
    }
}

