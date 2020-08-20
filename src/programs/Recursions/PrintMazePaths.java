package programs.Recursions;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintMazePaths {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        System.out.println(getMazeWithJumps(1,1, row, column));

    }

    static ArrayList<String> getMazeWithJumps(int sr, int sc, int dr, int dc) {

        if(sr == dr && sc == dc) {
            ArrayList<String> paths = new ArrayList<>();
            paths.add("");
            return paths;
        }else if(sr > dr || sc > dc) {
            return new ArrayList<String>();
        }

        ArrayList<String> paths = new ArrayList<>();

        //Horizontal moves
        for(int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hPaths = getMazeWithJumps(sr, sc + ms, dr, dc);
            for(String path : hPaths) {
                paths.add("h" + ms + path);
            }
        }

        //Vertical moves
        for(int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vPaths = getMazeWithJumps(sr  + ms, sc, dr, dc);
            for(String path : vPaths) {
                paths.add("v" + ms + path);
            }
        }

        //Diagonal moves
        for(int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
            ArrayList<String> dPaths = getMazeWithJumps(sr + ms, sc + ms, dr, dc);
            for(String path : dPaths) {
                paths.add("d" + ms + path);
            }
        }

        return paths;
    }
}
