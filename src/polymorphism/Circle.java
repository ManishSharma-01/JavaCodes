package polymorphism;

public class Circle extends Shape{
    @Override
    protected float area(float rad) {
        return super.area(rad);
    }
    //    float rad = 2;
//    public static void main(String[] args) {
//        Circle c = new Circle();
//        System.out.println(c.area(c.rad));
//           }

}
