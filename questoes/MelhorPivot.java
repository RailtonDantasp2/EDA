import java.util.*;
public class MelhorPivot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        String[] nums = sc.nextLine().split(" ");
        int[] arrInt = new int[arr.length];
        int a = 0;
        int b = 0;
        for(int i = 0; i < arr.length; i++){
            arrInt[i] = Integer.parseInt(arr[i]);
            if(i == 0){
                a = Integer.parseInt(nums[i]);
            }
            
            if(i == 1){
                b = Integer.parseInt(nums[i]);
            }
        }
        int menoresA = 0;
        int menoresB = 0;
        int maioresA = 0;
        int maioresB = 0;
    
        for(int i = 0; i < arr.length; i++){
            if (arrInt[i] < arrInt[a]) {
                menoresA++;
            }
            if (arrInt[i] > arrInt[a]) {
                maioresA++;
            }
            if (arrInt[i] > arrInt[b]) {
                maioresB++;
            }
            if (arrInt[i] < arrInt[b]) {
                menoresB++;
            }
        }
        int difA = Math.abs(maioresA - menoresA); 
        int difB = Math.abs(maioresB - menoresB); 

        if(difA <= difB) System.out.println(a);
        else System.out.println(b);

          
          
        }     
    }         

         
