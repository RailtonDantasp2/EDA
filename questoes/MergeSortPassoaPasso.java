import java.util.*;

public class MergeSortPassoaPasso {
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
        int intervalo = right - left;

        int[] suporte = new int[intervalo + 1];
        for (int i = 0; i <= intervalo; i++) {
            suporte[i] = v[left + i];
        }
        System.out.println(Arrays.toString(suporte));
        if (left < right) {
            int meio = (left + right) / 2;
            sort(v, left, meio);
            sort(v, meio + 1, right);
            merge(v, left, right);

            for (int i = 0; i <= intervalo; i++) {
                suporte[i] = v[left + i];
            }
            System.out.println(Arrays.toString(suporte));
        }
    }

    public static void merge(int[] v, int left, int right) {
        int intervalo = right - left;
        int[] suporte = new int[intervalo + 1];
        for (int i = 0; i <= intervalo; i++) {
            suporte[i] = v[left + i];
        }
        int meio = intervalo / 2;
        int i = 0;
        int j = meio + 1;
        int k = left;

        while (i <= meio && j <= intervalo) {
            if (suporte[i] <= suporte[j]) {
                v[k++] = suporte[i++];
            } else {
                v[k++] = suporte[j++];
            }
        }

        while (i <= meio) {
            v[k++] = suporte[i++];
        }
    }
}
