package OpenClosed;

public class Recatangle implements Shape {

    Recatangle(int width , int height) {
        this.width = width;
        this.height = height;
    }
    private int width;
    private int height;

    @Override
    public int area() {
        return width * height;
    }

}
