package programs.Recursions;

import java.util.Scanner;

public class MazePathPrint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        getMazeWithJumps(1,1, row, column, "");

    }

    static void getMazeWithJumps(int sr, int sc, int dr, int dc, String totalPath) {

        if(sr == dr && sc == dc) {
            System.out.println(totalPath);
            return;
        }else if(sr > dr || sc > dc) {
            return ;
        }

        //Horizontal moves
        for(int ms = 1; ms <= dc - sc; ms++) {
            getMazeWithJumps(sr, sc + ms, dr, dc,totalPath + "h"+ms);
        }

        //Vertical moves
        for(int ms = 1; ms <= dr - sr; ms++) {
         getMazeWithJumps(sr  + ms, sc, dr, dc, totalPath + "v"+ms);
        }

        //Diagonal moves
        for(int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
           getMazeWithJumps(sr + ms, sc + ms, dr, dc, totalPath + "d"+ms);
        }
    }
}
