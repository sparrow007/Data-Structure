package programs.Arrays.Optimizations;

public class MinimumDistanceArray {

    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 5, 4, 4, 2, 3};
        int x = 3;
        int y = 2;

        optMinDistancec(arr, arr.length, x, y);

    }

    static void minDistance(int[] arr, int n ,int x, int y) {
        int minDis = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if((arr[i] == x && arr[j] == y) || (arr[i] == y && arr[j] == x) &&
                minDis > (j-i) ) {
                    minDis = (j - i);
                }

            }
        }

        System.out.println(minDis);
    }

    //Optimize way
    static void optMinDistancec(int[] arr, int n , int x, int y) {

        int p = -1;
        int minDis = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if(arr[i] == x || arr[i] == y) {
                if(p != -1 && arr[i] != arr[p]) {
                    minDis = Math.min(minDis, i-p);
                }

                p = i;
            }

        }

        System.out.println(minDis);

    }

}
