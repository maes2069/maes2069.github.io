package g_seven.polymorphism;

public class Area {
    public double calculateArea(double radius){
        return (3.14*radius*radius);
    }

    public double calculateArea(double length, double width){
        return (length*width);
    }

    public double calculateArea(double length, double width, String name){
        System.out.println(name);
        return (length * width);
    }

    public double calculateArea(String name, double length, double width){
        System.out.println(name);
        return (length * width);
    }

    public int calculateArea(int length){
        return(int)(length*length);
    }

    public double calculateAreaofSquare(long length){
        return(length*length);
    }

    public double calculateAreaofRectangle(double length, double width){
        return (length*width);
    }

}
