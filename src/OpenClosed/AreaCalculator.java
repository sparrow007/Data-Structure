package OpenClosed;

public class AreaCalculator {

    public int sumOfArea(Shape[] arr) {
        int sum = 0;
        for (Shape data: arr) sum += data.area();
        return sum;
    }

}
