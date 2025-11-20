import java.util.*;
public class EstatisticaOrdem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] arrInt = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        int pivot = arrInt[0];
        int j = arrInt.length - 1;
        int i = 1;

        while(i <= j){
            while(i <= j && arrInt[i] <= pivot){
                i++;
            }
            while(i <= j && arrInt[j] > pivot){
                j--;
            }
            if (i < j) {
                swap(arrInt,i,j);
            }
        }
        swap(arrInt,0,j);
        System.out.println(j + 1);
        
    }

    public static void swap(int[] a, int p1, int p2){
        int aux = a[p1];
        a[p1] = a[p2];
        a[p2] = aux;
    }
}

