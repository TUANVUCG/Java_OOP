public class Rectangle {
    int height;
    int width;


     Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

     int getHeight() {
        return height;
    }

     void setHeight(int height) {
        this.height = height;
    }

     int getWidth() {
        return width;
    }

     void setWidth(int width) {
        this.width = width;
    }

    double getArea() {
        return width * height;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + getArea() +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12121, 42323);
        System.out.println(rectangle);
    }
}
