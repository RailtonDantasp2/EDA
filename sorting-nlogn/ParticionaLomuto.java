import java.util.*;

public class ParticionaLomuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] arrInt = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        lomuto(arrInt, 0, arrInt.length - 1);
        System.out.println(Arrays.toString(arrInt));
    }

    public static void lomuto(int[] v, int ini, int fim) {
        int i = ini;
        int pivot = v[ini];

        for (int j = ini + 1; j <= fim; j++) {
            if (v[j] <= pivot) {
                i++;
                swap(v, j, i);
                System.out.println(Arrays.toString(v));
            }
        }
        swap(v, i, ini);
        System.out.println(Arrays.toString(v));
    }

    public static void swap(int[] v, int p1, int p2) {
        int aux = v[p1];
        v[p1] = v[p2];
        v[p2] = aux;
    }
}
