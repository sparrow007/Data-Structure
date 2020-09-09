package CP.CodeForces.Small1500;

import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.IntStream;


public class IQTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
            arr[i] = scanner.nextInt();


        long num = IntStream.of(arr).filter(c -> c %2 == 0).count();

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (evenCount > 1) break;
            if (oddCount > 1) break;

            if (arr[i] % 2 == 0) evenCount++;
            else oddCount++;

        }

        boolean isOdd = oddCount < evenCount;

        for (int i = 0; i < length; i++) {

            if (arr[i] % 2 != 0 && isOdd) {
                System.out.println(i+1);
                break;
            }else if (arr[i]%2 == 0 && !isOdd){
                System.out.println(i+1);
                break;
            }

        }


    }

}
