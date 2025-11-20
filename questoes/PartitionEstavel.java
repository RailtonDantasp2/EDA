import java.util.*;

public class PartitionEstavel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] arrInt = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        partition(arrInt, 0, arrInt.length - 1);
    }

    public static void partition(int[] v, int ini, int fim) {
        int idxPivot = ini;

        for (int i = ini + 1; i <= fim; i++) {
            if (v[i] <= v[idxPivot]) {
                int j = i;
                while (j > idxPivot) {
                    int aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                    j--;
                }
                idxPivot++;
            }
        }
        System.out.println(Arrays.toString(v));
    }
}
