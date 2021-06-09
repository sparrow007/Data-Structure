package OpenClosed;

public class Circle implements Shape {

    Circle(int radius) {
        this.radius = radius;
    }
    private int radius;

    @Override
    public int area() {
        return (int) (Math.PI * radius*radius);
    }
}
