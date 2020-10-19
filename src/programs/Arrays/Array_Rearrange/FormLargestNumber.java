package programs.Arrays.Array_Rearrange;

import java.util.*;

public class FormLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.nextLine();

        String[] arr = new String[n];

        for (int i = 0;i < n; i++) arr[i] = scanner.nextLine();

        System.out.println(printLargest(arr));
    }

   static String printLargest(String[] arr) {

       Vector<String> out = new Vector<>();

       for (String element : arr) out.add(element);
       Collections.sort(out, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               String XY = o1 + o2;
               String YX = o2 + o1;

               return XY.compareTo(YX) > 0 ? -1 : 1;
           }
       });

       Arrays.sort(arr, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               String XY = o1 + o2;
               String YX = o2 + o1;
               return XY.compareTo(YX) > 0 ? -1 : 1;
           }
       });

       for (String element : arr) System.out.print(element + " ");
       System.out.println();
    return   out.toString();
    }

}
