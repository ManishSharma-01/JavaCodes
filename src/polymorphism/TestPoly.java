package polymorphism;
public class TestPoly {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();
        System.out.println("Area of circle is "+circle.area(4f));
        System.out.println("Area of rectangle is "+rectangle.area(3,5));
        System.out.println("Area of square is "+square.area(4));
    }
}