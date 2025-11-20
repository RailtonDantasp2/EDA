import java.util.Arrays;

public class RadixSortUltimo {
    public static void main(String[] args) {
        int[] arr = new int[] { 8373527, 9283738, 1424, 1, 536241, 289376217 };

        int digits = ("" + getMax(arr)).length();

        for (int i = 1; i <= digits; i++) {
            radix(arr, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void radix(int[] v, int exp) {
        int[] orded = new int[v.length];
        int[] freq = new int[10];

        for (int i = 0; i < v.length; i++) {
            int digit = (int) (v[i] % Math.pow(10, exp));
            digit = (int) (digit / Math.pow(10, exp - 1));
            freq[digit]++;
        }

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }
        for (int i = v.length - 1; i >= 0; i--) {
            int digit = (int) (v[i] % Math.pow(10, exp));
            digit = (int) (digit / Math.pow(10, exp - 1));
            orded[freq[digit] - 1] = v[i];
            freq[digit]--;
        }

        for (int i = 0; i < v.length; i++) {
            v[i] = orded[i];
        }

    }

    public static int getMax(int[] v) {
        int maior = v[0];

        for (int num : v) {
            if (num > maior)
                maior = num;
        }
        return maior;
    }
}
