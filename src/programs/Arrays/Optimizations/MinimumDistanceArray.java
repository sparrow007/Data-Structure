package programs.Arrays.Optimizations;

public class MinimumDistanceArray {

    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 5, 4, 4, 2, 3};
        int x = 3;
        int y = 2;

    }

    static void minDistance(int[] arr, int n ,int x, int y) {
        int minDis = Integer.MAX_VALUE;

        int count = 0;

        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == x) {
                start = i;
            }

            if(arr[i] == y && arr[start] == x) {
                end = i;
                minDis = Math.min(minDis, (end - start) );
            }
        }
    }

}
