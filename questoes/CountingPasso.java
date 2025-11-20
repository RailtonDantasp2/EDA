import java.util.Arrays;
import java.util.Scanner;

public class CountingPasso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] arrInt = new int[arr.length];
        int a = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        int[] contagem = new int[a + 1];
        for (int i = 0; i < arrInt.length; i++) {
            contagem[arrInt[i]]++;
            String out = Arrays.toString(contagem);
            System.out.println(out.substring(1, out.length() - 1).replace(",", ""));
        }
        for (int i = 1; i < contagem.length; i++) {
            contagem[i] += contagem[i - 1];
        }
        String out = Arrays.toString(contagem);
        System.out.println("Cumulativa do vetor de contagem - " + out.substring(1, out.length() - 1).replace(",", ""));
        int[] orded = new int[arrInt.length];
        for (int i = arrInt.length - 1; i >= 0; i--) {
            orded[contagem[arrInt[i]] - 1] = arrInt[i];
            contagem[arrInt[i]]--;
        }
        out = Arrays.toString(contagem);
        System.out.println(out.substring(1, out.length() - 1).replace(",", ""));
        out = Arrays.toString(orded);
        System.out.println(out.substring(1, out.length() - 1).replace(",", ""));

    }
}
