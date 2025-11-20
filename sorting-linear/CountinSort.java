import java.util.Arrays;

public class CountinSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 5, 34, 56, 7, 1, 23, 91, 90, 3 };

        boolean[] sup = new boolean[maior(arr)];
        for (int num : arr) {
            sup[num - 1] = true;
        }
        int[] orded = new int[arr.length];
        int j = 0;
        for (int i = 0; i < sup.length; i++) {
            if (sup[i]) {
                orded[j] = i + 1;
                j++;
            }
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
