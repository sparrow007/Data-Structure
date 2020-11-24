package CP.CF.Div1;

import java.util.*;

public class ParticipantsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test--> 0) {
            int n = scanner.nextInt();

            Map<Integer, Integer> hashMap = new HashMap<>();
            int[] arr = new int[n+1];

            for (int i = 1; i <= n; i++) {
                int val = scanner.nextInt();

                if (!hashMap.containsKey(val)) {
                    hashMap.put(val, i);
                }else {
                    arr[i] = val;
                }
            }

            for (int i = 1; i <= n; i++) {
                hashMap.remove(arr[i]);
            }

            TreeMap<Integer, Integer> treeMap = new TreeMap<>(hashMap);
            if (treeMap.size() == 0) {
                System.out.println(-1);
                continue;
            }

            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet())
            {
                System.out.println(entry.getValue());
                break;
            }
        }
    }

}
