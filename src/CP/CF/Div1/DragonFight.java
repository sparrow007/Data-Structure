package CP.CF.Div1;

import java.util.*;

public class DragonFight {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        int s = scanner.nextInt();

        int n = scanner.nextInt();

        ArrayList<Integer> dragon = new ArrayList<>();
        ArrayList<Integer> bonus = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            dragon.add(scanner.nextInt());
            bonus.add(scanner.nextInt());
        }

        for (int i = 0; i < n; i++) {
            int min = dragon.get(0);
            int b = bonus.get(0);
            int index = 0;
            int size = dragon.size();
            for (int j = 0; j < size; j++) {
                if (min > dragon.get(j)) {
                    min = dragon.get(j);
                    b = bonus.get(j);
                    index = j;
                }
            }

           // System.out.println(min);
            if (min >= s) {
                System.out.println("NO");
                return;
            }
            s += b;
            //System.out.println(b);
            dragon.remove(index);
            bonus.remove(index);
        }

        System.out.println("YES");

    }

    private void comment(Scanner scanner, int n, int s) {



        Map<Integer, Integer> dragonValues = new HashMap<>();

        for (int i =0; i < n; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();

            dragonValues.put(key, value);
        }

        TreeMap<Integer, Integer> treeMap = new TreeMap<>(dragonValues);
        boolean isWin = true;

        System.out.println(treeMap.entrySet().size());

        for (Map.Entry<Integer, Integer> values : treeMap.entrySet()) {

            if (s <= values.getKey()) {
                isWin = false;
            }else {
                isWin = true;
                s += values.getValue();
            }

        }

        if (isWin)
            System.out.println("YES");
        else   System.out.println("NO");
    }
}
