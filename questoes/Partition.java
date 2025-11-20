import java.util.*;
public class Partition{

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String[] arr = sc.nextLine().split(" ");
       int[] arrInt = new int[arr.length];
       
       for(int i = 0; i < arr.length; i++){
           arrInt[i] = Integer.parseInt(arr[i]);
       }

       int pivot = arrInt[0];

       int i = 0;
       for(int j = 1; j < arrInt.length; j++){
       	  if(arrInt[j] <= pivot){
	     i++;
	     swap(arrInt,i,j);
	  }
       }
       swap(arrInt,0,i);

       System.out.println(Arrays.toString(arrInt));
    }

    public static void swap(int[] v, int p1, int p2){
       int aux = v[p1];
       v[p1] = v[p2];
       v[p2] = aux;
       
    }
}
