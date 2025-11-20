import java.util.Arrays;

public class MergeSortInverso {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 2, 2, 2, 2, 4, 4, 4, 10, 10, 10, 5, 6, 1, 7, 8, 9, 10, 11 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        arr = new int[] { 10, 90, 9, 1, -3, -1, -10, -99, 28, 9019 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        arr = new int[] { 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int meio = (fim + ini) / 2;
            sort(v, ini, meio);
            sort(v, meio + 1, fim);
            merge(v, ini, fim);
        }
    }

    public static void merge(int[] v, int ini, int fim) {
        int[] sup = new int[fim - ini + 1];
        int intervalo = fim - ini;

        for (int i = 0; i <= intervalo; i++) {
            sup[i] = v[ini + i];
        }

        int meio = intervalo / 2;
        int k = ini;
        int i = 0;
        int j = meio + 1;

        while (i <= meio && j <= intervalo) {
            if (sup[i] >= sup[j]) {
                v[k++] = sup[i++];
            } else {
                v[k++] = sup[j++];
            }
        }

        while (i <= meio) {
            v[k++] = sup[i++];
        }
    }
}
