import java.util.Arrays;
import java.util.Scanner;

public class PlacasDeCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(",");
        radixSort(arr);
        String out = Arrays.toString(arr);
        System.out.println(out.substring(1, out.length() - 1));
    }

    public static void radixSort(String[] v) {
        for (int i = 7; i >= 4; i--) {
            sort(v, i);
        }
    }

    public static void sort(String[] v, int i) {
        int[] freq = new int[10];
        String[] orded = new String[v.length];
        int digit;
        for (int j = 0; j < v.length; j++) {
            String str = v[j];
            digit = Integer.parseInt("" + str.charAt(i));
            freq[digit]++;
        }
        for (int j = 1; j < freq.length; j++)
            freq[j] += freq[j - 1];

        for (int j = v.length - 1; j >= 0; j--) {
            String str = v[j];
            digit = Integer.parseInt("" + str.charAt(i));
            orded[freq[digit] - 1] = v[j];
            freq[digit]--;
        }
        for (int j = 0; j < v.length; j++) {
            v[j] = orded[j];
        }
    }
}
