package programs.Arrays.Range_Queries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MOS_Algorithm {

    static class Query {
        int L, R;

        Query(int L, int R) {
            this.L = L;
            this.R = R;
        }
    }

    private static void queryResult(int[] arr, ArrayList<Query> queries) {

        //Block size
        int block = (int)Math.sqrt(arr.length);

        //Sort the queries
        Collections.sort(queries, new Comparator<Query>() {
            @Override
            public int compare(Query o1, Query o2) {

                //Different blocks
                if(o1.L/block != o2.L/block )
                    return o1.L < o2.L ? -1 : 1;

                //Same blocks, different R values
                return o1.R < o2.R ? -1 : 1;
            }
        });

        int currL = 0, currR = 0;
        int currSum = 0;

        //Traverse through all the queies
        for (int i = 0; i <queries.size() ; i++) {

            int L = queries.get(i).L, R = queries.get(i).R;

            //Remove elements, when there is previous range from [0,5] and the current
            //range is [2, 7] then we need to substract the [0] and [1]
            while(currL < L) {
                currSum -= arr[currL];
                currL++;
            }

           // System.out.println("values of L "  + L + " currL " + currL);
            //add element
            while(currL > L) {
                currSum += arr[currL - 1];
                currL--;
            }


            while (currR <= R) {
                currSum += arr[currR];
                currR++;
            }



            //Remove the extra element suppose we have the previous range [0, 10] and next range is
            //[2,8] then we have to remove the elements like [10] and [9]
            System.out.println("Sum of range " + L + " and " + R + " is = " + currR);
            while (currR > R +1) {
                currSum -= arr[currR-1];

                currR--;
            }

            System.out.println("Sum of range " + L + " and " + R + " is = " + currSum);
        }

    }

    public static void main(String[] args) {
        ArrayList<Query> q = new ArrayList<Query>();
        q.add(new Query(0,4));
        q.add(new Query(1,3));
        q.add(new Query(2,4));

        int a[] = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        queryResult(a, q);
    }

}
