package g_seven.polymorphism;

public class AreaMain {
    public static void main(String[] args){
        Area a = new Area();
        double area = a.calculateArea(9.8F);
        System.out.println("Area is "+area);
        area = a.calculateArea(9.8);
        System.out.println("Area is "+area);
        System.out.println("Area of Circle is "+area);
        System.out.println("Area of Rectangle is "+a.calculateArea(2.5, 7.5));
        System.out.println("Area of Rectangle with name is "+a.calculateArea(2.5, 7.5, "String last param"));
        System.out.println("Area of Rectangle with name is "+a.calculateArea("String 1st param",2.5, 7.5));
        System.out.println("Area of Square is "+a.calculateArea(90));

    }
}
