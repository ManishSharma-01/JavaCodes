package polymorphism;

public class Rectangle extends Shape{
    @Override
    protected float area(float length, float breadth) {
        return super.area(length, breadth);
    }
    //float length;
//float breadth;
//
//    public static void main(String[] args) {
//        Rectangle r = new Rectangle();
//        System.out.println(r.area(r.length,r.breadth));
//    }

}
