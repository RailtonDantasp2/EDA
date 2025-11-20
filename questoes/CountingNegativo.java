import java.util.Arrays;

public class CountingNegativo {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 4, 22, 3, 1, 5, 6, 7 };
        int menor = arr[0];
        int maior = arr[0];

        for (int num : arr) {
            if (num < menor)
                menor = num;
            if (num > maior)
                maior = num;
        }

        int[] frequencia = new int[maior - menor + 1];
        for (int i = 0; i < arr.length; i++) {
            frequencia[arr[i] + Math.abs(menor)]++;
        }

        for (int i = 1; i < frequencia.length; i++) {
            frequencia[i] += frequencia[i - 1];
        }

        int[] orded = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            orded[frequencia[arr[i] + Math.abs(menor)] - 1] = arr[i];
            frequencia[arr[i] + Math.abs(menor)]--;
        }
        System.out.println(Arrays.toString(orded));

    }
}
