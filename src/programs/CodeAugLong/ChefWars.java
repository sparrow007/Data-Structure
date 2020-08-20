package programs.CodeAugLong;

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefWars
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int sqrt = (int) Math.ceil(Math.sqrt(test));
        System.out.println(sqrt);
        int []p = {1,9, 7, 6};


        ArrayList<Integer>list = new ArrayList<>();


        Arrays.sort(p);

//        for(int i = 0; i < test; i++) {
//            int darth = scanner.nextInt();
//            int stab = scanner.nextInt();
//
//            while(stab > 0) {
//                darth -= stab;
//                stab /= 2;
//            }
//            System.out.println(darth);
//            if(darth != 0) {
//                System.out.println(0);
//            }else {
//                System.out.println(1);
//            }
//        }
    }
}

