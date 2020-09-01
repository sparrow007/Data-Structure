package programs.Extraa;

import java.util.*;

public class LoopExp {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(test > 0) {

            int size1 = scanner.nextInt();
            int size2 = scanner.nextInt();
            int size3 = scanner.nextInt();

            HashMap<Integer, Integer> res = new HashMap<>();

            for (int i = 0; i < size1; i++)  {
                int temp = scanner.nextInt();
                res.put(temp, 1);
            }

            for (int i = 0; i < size2; i++) {
                int temp  = scanner.nextInt();
                if(res.containsKey(temp)) {
                    int value = res.get(temp);
                    if (value == 1)
                       res.put(temp, value + 1);
                }
            }

            for (int i = 0; i < size3; i++) {
                int temp  = scanner.nextInt();
                if(res.containsKey(temp)) {
                    int value = res.get(temp);
                    if (value == 2)
                        res.put(temp, value + 1);
                }
            }

            TreeMap<Integer, Integer> sorted = new TreeMap<>();

            // Copy all data from hashMap into TreeMap
            sorted.putAll(res);

            // Display the TreeMap which is naturally sorted
            boolean isAllEqaul = false;
            for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {
                 if(entry.getValue() == 3) {
                    isAllEqaul = true;
                    System.out.print(entry.getKey() + " ");
                 }
            }

            System.out.println(sorted);


            if(!isAllEqaul)
                System.out.println(-1);
            else


            test--;
        }

    }


    public static ArrayList<Integer> duplicates(int arr[], int n) {

        ArrayList<Integer> out = new ArrayList<>();

        Arrays.sort(arr);


        int prev = 0;
        int cur = 1;
        int i  = 0;
        while (cur < arr.length && i < arr.length) {
            if(arr[prev] == arr[cur]) {
                out.add(arr[i]);
            }else prev++;

            cur++;
            i--;
        }

        System.out.println(out);
        return out;
    }
}
