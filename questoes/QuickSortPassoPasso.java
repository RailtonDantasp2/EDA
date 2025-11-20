import java.util.*;

public class QuickSortPassoPasso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        int[] arrInt = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        sort(arrInt, 0, arrInt.length - 1);
    }

    public static void sort(int[] v, int left, int right) {

        if (left < right) {
            int idx = partition(v, left, right);
            System.out.println(Arrays.toString(v).replace("]", "").replace("[", "").replace(",", ""));
            sort(v, left, idx - 1);
            sort(v, idx + 1, right);
        }
    }

    public static int partition(int[] v, int left, int right) {
        int pivot = v[left];
        int i = left + 1;
        int j = right;

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
        swap(v, left, j);

        return j;
    }

    public static void swap(int[] v, int p1, int p2) {
        int aux = v[p1];
        v[p1] = v[p2];
        v[p2] = aux;
    }
}
