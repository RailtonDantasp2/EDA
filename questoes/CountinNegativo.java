import java.util.Arrays;
import java.util.Scanner;

public class CountinNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] arrInt = new int[arr.length];
        int maior = sc.nextInt();
        int menor = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        int[] contagem = new int[maior - menor + 1];
        for (int i = 0; i < arrInt.length; i++) {
            contagem[arrInt[i] + Math.abs(menor)]++;
            System.out.println(Arrays.toString(contagem));
        }
        for (int i = 1; i < contagem.length; i++) {
            contagem[i] += contagem[i - 1];
        }
        System.out.println("Cumulativa do vetor de contagem - " + Arrays.toString(contagem));

        int[] orded = new int[arrInt.length];

        for (int i = arrInt.length - 1; i >= 0; i--) {
            orded[contagem[arrInt[i] + Math.abs(menor)] - 1] = arrInt[i];
            contagem[arrInt[i] + Math.abs(menor)]--;
        }

        System.out.println(Arrays.toString(contagem));
        System.out.println(Arrays.toString(orded));
    }
}
