package programs.Arrays.Range_Queries;

public class Decomposition {

    static int[] arr = new int[10000];
    static int[] blocks = new int[100];

    static int blk_sz;


    static void update(int idx, int val) {
        int block_number= idx / blk_sz;
        blocks[block_number] += val - arr[idx];
        arr[idx] = val;
    }

    static void preprocess(int []input, int n) {

        blk_sz = (int)Math.sqrt(n);

        int blc_idx = -1;

        for (int i = 0; i < n; i++) {
            arr[i] = input[i];
            if(i % blk_sz == 0) {
                blc_idx++;
            }
            blocks[blc_idx] += arr[i];

        }

    }

    static int query(int l, int r) {

        int sum = 0;

        while (l < r && l % blk_sz != 0 & l != 0) {
            //traverse the first blog
            sum += arr[l];
            l++;
        }

        while (l + blk_sz <= r) {

           //traverse the overlapped blocks
           sum += blocks[l/blk_sz];
           l += blk_sz;
        }

        while (l <= r) {
            //traverse  the last block
            sum += arr[l];
            l++;
        }
      return sum;
    }

    public static void main(String[] args) {

        int input[] = {1, 5, 2, 4, 6, 1, 3, 5, 7, 10};
        int n = input.length;

        preprocess(input, n);

        System.out.println("query(3, 8) : " +
                query(3, 8));
        System.out.println("query(1, 6) : " +
                query(1, 6));
        update(8, 0);
        System.out.println("query(8, 8) : " +
                query(8, 8));

    }

}
