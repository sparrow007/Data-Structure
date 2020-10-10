package programs.BinaryTree;

public class CatalanNumber {


    int catalen(int n) {

        if(n <= 1) return 1;

        int res = 0;
        for (int i = 0; i < n; i++) {
            res += catalen(i) * catalen(n-i-1);
        }

        //System.out.print(res + " ");

        return res;
    }



    public static void main(String[] args) {
        System.out.println(new CatalanNumber().catalen(9));
    }
}
