import java.util.Arrays;

public class QuickSortLomuto {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                2, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4, 10, 10, 10, 5, 6, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
                4, 4, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                10, 10, 10, 10, 11 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        arr = new int[] { 10, 90, 9, 1, -3, -1, -10, -99, 28, 9019 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        arr = new int[] { 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int idx = partition(v, ini, fim);
            quickSort(v, ini, idx - 1);
            quickSort(v, idx + 1, fim);
        }
    }

    public static int partition(int[] v, int ini, int fim) {
        int pivot = v[ini];
        int i = ini;

        for (int j = ini + 1; j <= fim; j++) {
            if (v[j] < pivot) {
                i++;
                swap(v, i, j);
            }
        }
        swap(v, ini, i);
        return i;
    }

    public static void swap(int[] v, int p1, int p2) {
        int aux = v[p1];
        v[p1] = v[p2];
        v[p2] = aux;
    }
}
