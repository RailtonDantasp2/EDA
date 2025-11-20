import java.util.*;
public class LomutoUltimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] arrInt = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        int pivot = arrInt[arrInt.length - 1];
        int i = arrInt.length - 1;
        for(int j = arr.length - 2; j >= 0; j--){
            if(arrInt[j] >= pivot){
                i--;
                swap(arrInt,j,i);
                System.out.println(Arrays.toString(arrInt));
            }
        }
        swap(arrInt,arrInt.length - 1,i);
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrInt));
    }
    
    public static void swap(int[] v, int p1, int p2){
        int aux = v[p1];
        v[p1] = v[p2];
        v[p2] = aux;
    }
}

