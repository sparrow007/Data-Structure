package LeetCode.Stack;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length1 = scanner.nextInt();
        int length2 = scanner.nextInt();

        int nums1[] = new int[length1];
        int nums2[] = new int[length2];

        for (int i = 0; i < length1; i++)
            nums1[i] = scanner.nextInt();

        for (int j = 0; j < length2; j++)
            nums2[j] = scanner.nextInt();

        int nge[] = nextGreaterElement(nums1, nums2);

        for (int i = 0; i < nge.length; i++)
            System.out.print(nge[i] + " ");

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> elementsStack = new Stack<>();

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            hashMap.put(nums1[i], i);
        }

        for (int i = nums2.length-1; i >= 0; i--) {

            while(elementsStack.size() > 0 && nums2[i] > elementsStack.peek())
                elementsStack.pop();

            if (hashMap.containsKey(nums2[i])) {

                int elementIndex = hashMap.get(nums2[i]);

                if (elementsStack.size() == 0) {
                    nums1[elementIndex] = -1;
                }else
                    nums1[elementIndex] = elementsStack.peek();
            }


            elementsStack.push(nums2[i]);

        }


        return nums1;

    }


}
