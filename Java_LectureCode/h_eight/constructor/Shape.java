package h_eight.constructor;

public class Shape {
    int length;
    int breadth;
    String shapeType;

    public Shape()
    {
        System.out.println("Default Constructor");
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(shapeType);
    }

    public Shape(int length, String shapeType){
        this.length = length;
        this.shapeType = shapeType;
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(shapeType);
        System.out.println("Two parameterized overloaded constructor");
    }

    public Shape(int length, String shapeType, int breadth){
        this.length = length;
        this.shapeType = shapeType;
        this.breadth = breadth;
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(shapeType);
        System.out.println("Three parameterized overloaded constructor");
    }

    public void test()
    {
        System.out.println("Hello I am Test Method");
    }

    class InnerShape{
        int metrics = 6789;
        void display(){
            System.out.println("Inner Class");
            System.out.println(metrics);
        }
    }

}
