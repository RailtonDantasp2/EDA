import java.util.Arrays;

public class RadixSort3 {
    public static void main(String[] args) {
        int[] teste = new int[] { 13, 1, 4567, 13, 9, 84994, 2342567, 1234, 89, 10, 11, 15, 1678 };
        System.out.println(Arrays.toString(teste));
        radixSort(teste);
    }

    public static void radixSort(int[] v) {
        int maior = getMax(v);
        int quantDigit = ("" + maior).length();
        int incremento = 0;
        if (quantDigit % 3 == 1)
            incremento = 2;
        if (quantDigit % 3 == 2)
            incremento = 1;

        for (int i = 3; i <= quantDigit + incremento; i += 3) {
            sort(v, i);
            System.out.println(Arrays.toString(v));
        }
    }

    public static void sort(int[] v, int exp) {
        int[] orded = new int[v.length];
        int[] freq = new int[1000];

        int digit;
        for (int i = 0; i < v.length; i++) {
            digit = (int) (v[i] % Math.pow(10, exp));
            digit = (int) (digit / Math.pow(10, exp - 3));
            freq[digit]++;
        }

        for (int i = 1; i < 1000; i++) {
            freq[i] += freq[i - 1];
        }

        for (int i = v.length - 1; i >= 0; i--) {
            digit = (int) (v[i] % Math.pow(10, exp));
            digit = (int) (digit / Math.pow(10, exp - 3));

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
