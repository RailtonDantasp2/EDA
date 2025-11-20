import java.util.Arrays;

public class RadixSort1 {
    public static void main(String[] args) {
        int[] teste = new int[] { 0, 191, 2, 3, 1, 1, 3, 4, 54, 53, 2, 4, 32, 43, 5, 5, 3, 23, 2, 4, 1983392 };
        System.out.println(Arrays.toString(teste));
        radixSort(teste);
    }

    public static void radixSort(int[] v) {
        int maior = getMax(v);
        int quantDigit = ("" + maior).length();

        for (int i = 1; i <= quantDigit; i++) {
            sort(v, i);
        }
    }

    public static void sort(int[] v, int exp) {
        int[] orded = new int[v.length];
        int[] freq = new int[10];

        int digit;
        for (int i = 0; i < v.length; i++) {
            digit = (int) (v[i] % Math.pow(10, exp));
            digit = (int) (digit / Math.pow(10, exp - 1));
            freq[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            freq[i] += freq[i - 1];
        }

        for (int i = v.length - 1; i >= 0; i--) {
            digit = (int) (v[i] % Math.pow(10, exp));
            digit = (int) (digit / Math.pow(10, exp - 1));

            orded[freq[digit] - 1] = v[i];
            freq[digit]--;
        }

        for (int i = 0; i < orded.length; i++) {
            v[i] = orded[i];
        }
    }

    public static int getMax(int[] v) {
        int maior = v[0];
        for (int num : v) {
            if (maior < num) {
                maior = num;
            }
        }
        return maior;
    }
}
