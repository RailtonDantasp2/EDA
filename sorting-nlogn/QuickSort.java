import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 2, 2, 2, 2, 4, 4, 4, 10, 10, 10, 5, 6, 1, 7, 8, 9, 10, 11 };
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
        int i = ini + 1;
        int j = fim;
        int pivot = v[ini];

        while (i <= j) {

            while (i <= j && v[i] <= pivot) {
                i++;
            }

            while (i <= j && v[j] > pivot) {
                j--;
            }

            if (i < j) {
                swap(v, i, j);
            }
        }
        swap(v, ini, j);
        return j;
    }

    public static void swap(int[] v, int p1, int p2) {
        int aux = v[p1];
        v[p1] = v[p2];
        v[p2] = aux;
    }
}
