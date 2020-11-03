package programs.Arrays.Optimizations;

public class MinimumJump {

    public static void main(String[] args) {
        int arr[] =  {2 ,3, 1, 1, 2, 4, 2, 0, 1, 1};
        System.out.println(jumpNeed(arr, 0, arr.length-1));
    }

    static int jumpNeed(int arr[], int l , int h) {

        //Reach the base condition where source == destination
        if(l == h) return 0;

        //Now we can't jump to other position
        if(arr[l] == 0) return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;

        for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {

            int jumps = jumpNeed(arr, i , h);
            if(jumps != Integer.MAX_VALUE && jumps + 1 < min) {
                min = jumps + 1;
            }

        }

        return min;


    }

    static void totalJump(int[] arr, int n) {

        if(n < 1) return;

        if(arr[0] == 0) {
            System.out.println(-1);
            return;
        }

       int jump = 0;

       int maxRange = 0;

       int steps = 0;

      for (int i = 0; i < n && maxRange < n-1; i++) {

          if(maxRange == 0) {
              maxRange = arr[i];
              System.out.println("max = " + maxRange);
              continue;
          }

          if(i == maxRange) {

              System.out.println("i = " + i + " maxRange = " + maxRange);

              if (arr[i] > maxRange) {
                  maxRange = arr[i];
                  steps = i;
              }
              maxRange = maxRange + steps;
              ++jump;

          }else {
              if (arr[i] > maxRange) {
                  maxRange = arr[i];
                  steps = i;
              }
          }

      }


        System.out.println(jump);

    }
}
