import java.util.*;

public class QuickSortMediana {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(30) + 1;
        }
        System.out.println(Arrays.toString(numeros));
        quickSort(numeros, 0, numeros.length - 1);
        System.out.println(Arrays.toString(numeros));
    }

    public static void quickSort(int[] v, int ini, int fim) {
        if (ini >= fim)
            return;

        int meio = partition(v, ini, fim);
        quickSort(v, ini, meio - 1);
        quickSort(v, meio + 1, fim);
    }

    public static int partition(int[] v, int ini, int fim) {
        int idx = mediana3(v, ini, fim);
        swap(v, ini, idx);
        int pivot = v[ini];

        int i = ini + 1;
        int j = fim;
        while (i <= j) {

            while (i <= j && v[i] <= pivot)
                i++;

            while (i <= j && v[j] > pivot)
                j--;

            if (i < j) {
                swap(v, i, j);
            }
        }
        swap(v, ini, j);
        return j;
    }

    public static int mediana3(int[] v, int ini, int fim) {
        int meio = (ini + fim) / 2;
        int[] arrSorted = new int[] { v[ini], v[meio], v[fim] };
        Arrays.sort(arrSorted);
        if (arrSorted[1] == v[meio])
            return meio;
        if (arrSorted[1] == v[ini])
            return ini;
        return fim;
    }

    public static void swap(int[] v, int p1, int p2) {
        int aux = v[p1];
        v[p1] = v[p2];
        v[p2] = aux;
    }
}
