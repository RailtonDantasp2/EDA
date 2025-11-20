public class QuickSelect {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 4, 2, 6, 7, 0, 1, 10 };
        int out = quickSelect(arr, 0, arr.length - 1, 5);
        System.out.println(out);

    }

    public static int quickSelect(int[] v, int ini, int fim, int k) {
        int p = partition(v, ini, fim);
        swap(v, ini, p);

        if (k - 1 == p)
            return v[p];
        if (k - 1 < p)
            return quickSelect(v, ini, p - 1, k);

        return quickSelect(v, p + 1, fim, k);
    }

    public static int partition(int[] v, int ini, int fim) {
        int pivot = v[ini];

        int i = ini + 1;
        int j = fim;

        while (i <= j) {
            while (i <= j && v[i] <= pivot) {
                i++;
            }
            while (i <= j && v[j] > pivot) {
                j--;
            }

            if (i < j)
                swap(v, i, j);
        }
        return j;
    }

    public static void swap(int[] v, int ini, int fim) {
        int aux = v[ini];
        v[ini] = v[fim];
        v[fim] = aux;
    }
}
