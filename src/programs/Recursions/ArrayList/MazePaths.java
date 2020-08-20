package programs.Recursions.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePaths {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        System.out.println(getMazePaths(1, 1, row, column));

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr == dr && sc == dc) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }else if(sr > dr || sc > dc) {
            return new ArrayList<String>();
        }
        ArrayList<String> rowPaths = new ArrayList<>();
        ArrayList<String> columnPaths = new ArrayList<>();

            rowPaths = getMazePaths(sr + 1, sc, dr, dc);
            columnPaths = getMazePaths(sr, sc + 1, dr, dc);


        ArrayList<String> result = new ArrayList<String>();

        for(String columnPath : columnPaths)
            result.add("h" + columnPath);

        for(String rowPath : rowPaths)
            result.add("v" + rowPath);


        return result;
    }

}
