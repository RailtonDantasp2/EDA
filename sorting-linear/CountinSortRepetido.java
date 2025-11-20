import java.util.Arrays;

public class CountinSortRepetido {
    public static void main(String[] args) {
        int[] A = new int[] { 1, 7, 2, 6, 4, 5, 9, 14, 19, 18 };
        int[] freq = new int[maior(A)];

        for (int i = 0; i < A.length; i++) {
            freq[A[i] - 1]++;
        }

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        int[] orded = new int[A.length];

        for (int i = 0; i < orded.length; i++) {
            orded[freq[A[i] - 1] - 1] = A[i];
            freq[A[i] - 1]--;
        }
        System.out.println(Arrays.toString(orded));
    }

    public static int maior(int[] v) {
        int maior = v[0];
        for (int i : v) {
            if (i > maior)
                maior = i;
        }
        return maior;
    }
}
