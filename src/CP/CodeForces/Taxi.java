package CP.CodeForces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Taxi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] groups = new int[length];

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(1, 0);
        hashMap.put(2, 0);
        hashMap.put(3, 0);
        hashMap.put(4, 0);

        for (int i = 0; i < length; i++) {
            groups[i] = scanner.nextInt();
            int data = hashMap.get(groups[i]);
            hashMap.put(groups[i], data + 1);
        }

        int taxiNumber = 0;

        int oneCount = hashMap.get(1);
        int twoCount = hashMap.get(2);
        int threeCount = hashMap.get(3);
        int fourCount = hashMap.get(4);

        System.out.println(oneCount);
        System.out.println(twoCount);
        System.out.println(threeCount);
        System.out.println(fourCount);

        if(threeCount != 0) {
            int oneTreeTaxi = oneCount + threeCount * 3;
            taxiNumber = oneTreeTaxi % 4 != 0 ? (oneTreeTaxi / 4 + 1) : oneTreeTaxi / 4;
        }else {
            int oneTwoTaxi = oneCount + twoCount * 2;
            taxiNumber = oneTwoTaxi % 4 != 0 ? (oneTwoTaxi / 4 + 1) : oneTwoTaxi / 4;
            twoCount = 0;
        }

        if(twoCount != 0)
            taxiNumber += twoCount*2 % 4 != 0 ? (twoCount*2/ 4 + 1) : twoCount*2 / 4;

        if(fourCount != 0)
            taxiNumber += fourCount;

        System.out.println(taxiNumber);

    }

  /*  void solve() throws Exception {
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 0);
        hm.put(2, 0);
        hm.put(3, 0);
        hm.put(4, 0);
        int n = hp.nextInt();
        for(int i = 0; i < n; i++)
        {
            int k = hp.nextInt();
            hm.put(k, hm.get(k) + 1);
        }
        int count = 0;
        count += hm.get(4);
        //hp.println("test for 4s -" +count);

        int threes = hm.get(3);
        int ones = hm.get(1);


        if(threes >= ones){
            count += threes;
            ones = 0;
        }

        else
        {
            ones -= threes;
            count += threes;
        }
        //hp.println("test for 3s " +count);
        int twos = hm.get(2);
        count += twos / 2;
        twos %= 2;

        ones = (twos * 2) + ones;

        if(ones % 4 == 0)
            count += ones / 4;
        else
            count += (ones / 4) + 1;
        hp.println(count);



        hp.flush();
    } */

}
