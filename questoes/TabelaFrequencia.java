import java.util.*;

public class TabelaFrequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] arrInt = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        int maior = arrInt[0];
        for (int num : arrInt) {
            if (num > maior)
                maior = num;
        }
        int[] sup = new int[maior + 1];
        boolean[] idxs = new boolean[maior + 1];

        for (int num : arrInt)
            sup[num]++;
        String out = "";
        for (int i = 0; i < arrInt.length; i++) {
            if (sup[arrInt[i]] > 0 && !idxs[arrInt[i]]) {
                idxs[arrInt[i]] = true;
                if (out.length() > 0)
                    out += " ";
                out += "" + arrInt[i] + "," + "" + sup[arrInt[i]];
            }
        }
        System.out.println(out);

    }
}
