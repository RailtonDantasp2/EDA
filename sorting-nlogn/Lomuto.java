import java.util.Arrays;

public class Lomuto {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 1, 3, 5, 4, 8, 9 };
        System.out.println(Arrays.toString(arr));
        lomuto(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void lomuto(int[] v, int ini, int fim) {
        int pivot = v[ini];

        int j = ini;

        for (int i = ini + 1; i <= fim; i++) {
            if (v[i] < pivot) {
                j++;
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
            }
        }

        int aux = v[ini];
        v[ini] = v[j];
        v[j] = aux;
    }
}
