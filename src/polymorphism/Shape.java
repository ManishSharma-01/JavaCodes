package polymorphism;

public class Shape {

    protected float area(float rad){
        return (22/7)*rad*rad;
    }
    protected float area(float length,float breadth){
        return length*breadth;
    }
    protected float area(int l){
        return l*l;
    }
}
