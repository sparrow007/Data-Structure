package programs.Arrays.Array_Rotations;

public class BlockSwapRotation {

    static void leftRotate(int[] arr, int i, int d, int n) {
        leftRotateRec(arr, i, d, n);
    }

    /*
    * Here A is [0...d-1] and B is [d....n]
    * Depend on the size of d both A and B will be divided
    * */
    static void leftRotateRec(int[] arr, int i, int d, int n) {

        if(d == 0 || d == n) return;

        if(d == n - d) {
            swap(arr, i, n - d + i, d);
            return;
        }

        //A is shorter than B
        if(d < n - d) {
            swap(arr, i, n-d + i, d);
            leftRotateRec(arr, i, d, n-d);
        }else {
            //B is shorter
            swap(arr, i, d + i, n-d);
            leftRotateRec(arr, n-d+i, 2*d - n, d);
        }

    }

    /*
    * Swap the different part of array
    * */
    static void swap(int[] arr, int fi, int si, int d) {

        for (int i = 0; i < d; i++) {
            int temp = arr[fi + i];
            arr[fi +i] = arr[si + i];
            arr[si + i] = temp;
        }

    }

    static void print(int[] arr) {
        for (int data : arr) System.out.print(data + " ");
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr, 0, 5, 7);
        print(arr);
    }
}
