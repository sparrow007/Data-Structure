package LeetCode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ReplaceNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) arr[i] = scanner.nextInt();

        int k = scanner.nextInt();

        int b = findPairs(arr, k);

        System.out.println(b);
    }

    public static int findPairs(int[] nums, int k) {

        int count = 0;

        HashMap<Integer,Integer> hmap = new HashMap<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int diff = Math.abs(nums[i] - nums[j]);
                
                if (diff == k){
                    if (hmap.containsKey(nums[i]) && hmap.containsValue(nums[j])) {

                    }else {
                        hmap.put(nums[i], nums[j]);
                        count++;
                    }
                    //System.out.println("diff " + diff + " i = " + i + " j = " + j);

                }
            }
        }

        return count;

    }

    public static int[] replaceElements(int[] arr) {

        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;

        for (int start_index = arr.length-2; start_index >= 0; start_index--) {

            if (arr[start_index] >= max) {
                int temp = arr[start_index];
                arr[start_index] = max;
                max = temp;
            }else {
                arr[start_index] = max;
            }

        }
     return arr;
    }
}
