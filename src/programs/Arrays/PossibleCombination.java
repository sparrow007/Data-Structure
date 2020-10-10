package programs.Arrays;

public class PossibleCombination {

    public static void main(String[] args) {
        int[] a = {1,2,3};

        int b[] = new int[3];

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");

            for (int j = 0; j < a.length; j++) {
                 if(j != i) {
                     System.out.print(a[j] + " ");
                 }
            }

            System.out.println();
        }
    }
}
