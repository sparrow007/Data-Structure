package CP.CF.Div;

import java.util.Scanner;

public class North {


   static class Point {
        int a , b;


        Point (int a , int b) {
            this.a = a;
            this.b = b;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {

            int n = scanner.nextInt();
            int k = scanner.nextInt();

            Point point = new Point (0,0);

            int step = 0;
            while (point.a != n || point.b != k) {

                if(point.b < k) {
                    point = north(point);
                    step++;
                }
                else if(point.b > k) {
                    point = south(point);
                    step++;
                }

                if(point.a > n) {
                    point = west(point);
                    step++;
                }else if(point.a < n) {
                    point = east(point);
                    step++;
                }

            }

            System.out.println(step);

        }
    }


    static Point north(Point point) {
        return new Point(point.a, point.b + 1);
    }

    static Point east(Point point) {
        return new Point(point.a + 1, point.b);
    }

    static Point south(Point point) {
        return new Point(point.a, point.b - 1);
    }

    static Point west(Point point) {
        return new Point(point.a-1, point.b);
    }

}
