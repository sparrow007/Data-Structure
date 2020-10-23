package programs.Arrays.Optimizations;

public class AverageInArray {

    public static void main(String[] args) {
        int arr[] = {3, 7, 5, 20, -10, 0, 12};
        int k = 2;
        leastAverage(arr, k);
    }

    static void leastAverage(int [] arr, int k) {
        int length = arr.length;

        //prifix sum alogirithm

        for (int i = 1; i < length; i++) {
            arr[i] += arr[i-1];
        }

        int initial = -1;
        int minAverage = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;

        for (int i = k - 1; i < length; i++) {
            int data = arr[i] - (initial < 0 ? 0 : arr[initial]);

            if (data < minAverage) {
                minAverage = data;
                end = i;
            }
            initial++;
        }
        start = Math.max(end-k+1, 0);
        System.out.println("start = " + start + " end = " + end );
    }
}
