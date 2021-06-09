package OpenClosed;

import java.awt.geom.Area;

public class Excute {

    public static void main(String[] args) {

        Shape r1 = new Recatangle(20, 30);

        Shape r2 = new Recatangle(30, 30);

        Shape c = new Circle(10);

        Shape[] arr = {r1, r2, c};

        int area = new AreaCalculator().sumOfArea(arr);
        System.out.println(area);
    }
}
