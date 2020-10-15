package programs.Arrays.Array_Rotations;

public class ArraySortRotated {

    private static int searchElement(int[] arr, int key, int n) {
        int pivot = findPivot(arr, 0, n);

        System.out.println(pivot);
        //There is no rotation so array is sorted apply the binary search
        if(pivot == -1)
           return binarySearch(arr, 0, n, key);

        if(arr[pivot] == key) return pivot;

        if(key < arr[pivot])
           return binarySearch(arr, 0, pivot - 1, key);

        return binarySearch(arr, pivot + 1, n, key);

    }

    private static int findPivot(int[] arr, int low, int high) {

        if(high < low) return -1;

        System.out.println("low = " + low  +  " hight = " + high + " ");

        int mid = (high + low) / 2;

        if( arr[mid] > arr[mid + 1]) {
            return mid;
        }

        if(arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }

        if(arr[low] >= arr[mid]) {
           return findPivot(arr, low, mid - 1);
        }

        return findPivot(arr, mid + 1, high);

    }

    static int binarySearch(int[] arr, int low, int high, int key) {

        if(high < low) return -1;

        int mid = (high + low) / 2;

        if(arr[mid] == key) return mid;

        if(key < arr[mid])
            return binarySearch(arr, low, mid - 1, key);
        return binarySearch(arr, mid + 1, high, key);

    }

    /*
    * There is more better approach for this
    * just check in one single binary search pass
    * */

    static int findBinarySearch(int arr[], int low, int high, int key) {

        if(high < low) return -1;

        int mid = (high + low) / 2;

        if(arr[mid] == key) return mid;

        if(arr[low] <= arr[mid]) {
            //left side of array is sorted
            //Now check if the key is in the range of low --- mid
            if(arr[low] <= key && key <= arr[mid])
               return findBinarySearch(arr, low, mid - 1, key);
            return findBinarySearch(arr, mid + 1, high, key);
        }

        if(arr[mid + 1] <= key && key < arr[high]) {
            return findBinarySearch(arr, mid + 1, high, key);
        }

        return findBinarySearch(arr, low, mid - 1, key);

    }

    /*
    * Implement the iterative binary search
    * while loop  will be used for searching of the element
    * */

    static int iterativeBinarySearch(int arr[], int low, int high, int key) {

        while (low <= high) {

            int mid = (low + high) / 2;

            if(key == arr[mid]) {
                return mid;
            }

            if(arr[low] <= arr[mid])  {

                if(arr[low] <= key && key <= arr[mid- 1]) {
                    high = mid - 1;
                }else
                    low = mid + 1;

            }else {

                if(arr[mid + 1] <= key && key <= arr[high]) {
                    low = mid + 1;
                }else
                    high = mid - 1;

            }

        }


        return  -1;
    }

    public static void main(String[] args) {

        int a[] = {7,8,9,10,12,3};
        System.out.println(iterativeBinarySearch(a, 0, a.length-1, 7));

    }
}
