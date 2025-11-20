import java.util.Arrays;
import java.util.Scanner;

public class RadixSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int digits = sc.nextInt();
        int[] arrInt = new int[arr.length];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 2; i <= digits + digits % 2; i += 2) {
            sort(arrInt, i);
            System.out.println(Arrays.toString(arrInt));
        }
    }

    public static void sort(int[] v, int exp) {
        int[] orded = new int[v.length];
        int[] freq = new int[100];
        int digit;
        for (int i = 0; i < v.length; i++) {
            digit = (int) (v[i] % Math.pow(10, exp));
            digit = (int) (digit / Math.pow(10, exp - 2));
            freq[digit]++;
        }

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        for (int i = v.length - 1; i >= 0; i--) {
            digit = (int) (v[i] % Math.pow(10, exp));
            digit = (int) (digit / Math.pow(10, exp - 2));

            orded[freq[digit] - 1] = v[i];
            freq[digit]--;
        }

        for (int i = 0; i < v.length; i++) {
            v[i] = orded[i];
        }
    }
}
