package CP.CodeForces.Chef;

import java.util.Scanner;

public class SubString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        scanner.nextLine();

        while(test--> 0) {

            String a = scanner.nextLine();
            String b = scanner.nextLine();


            char[] first_a = a.toCharArray();

            char[] first_b = b.toCharArray();


            int start = 0;
            int end = 0;

            String ind = "";

            int operations = 0;
            while(!a.equals(b) && (start < a.length() ||  end >= 0)) {


                char first_start;
                char second_sstart;
                if (start < a.length()) {
                     first_start = first_a[start];
                     second_sstart = first_b[start];
                }

                char first_end;
                char second_end;
                if (end >= 0) {
                   first_end = first_a[end];
                     second_end = first_b[end];
                }

//
//                if(first_start == second_sstart) {
//                    start++;
//                }else {
//                    if (first_a[start] == '0') {
//                        first_a[start] = '1';
//                    }else {
//                        first_a[start] = '0';
//                    }
//                }
//
//
//
//                if(first_end == second_end) {
//                    end--;
//                }else {
//                    if (first_a[end] == '0') {
//                        first_a[end] = '1';
//                    }else {
//                        first_a[end] = '0';
//                    }
//                }
//
//                operations++;

            }

            System.out.println(operations);


        }
    }
}
