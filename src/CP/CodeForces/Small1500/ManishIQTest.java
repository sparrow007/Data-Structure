package CP.CodeForces.Small1500;

import java.util.Scanner;

public class ManishIQTest {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int size=scanner.nextInt();
            int[] arr=new int[size];
            int even=0;
            int odd=0;
            for(int i=0;i<size;i++){
                arr[i]=scanner.nextInt();
            }

            for (int i=0;i<arr.length;i++){

                if((arr[i])%2==0)
                    even+=i+1;
                else
                    odd+=i+1;

            }
            if(even<odd)
                System.out.println(even);
            else
                System.out.println(odd);

        }

}
