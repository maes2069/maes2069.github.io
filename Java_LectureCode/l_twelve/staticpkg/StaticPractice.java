package l_twelve.staticpkg;

public class StaticPractice {

    static int a = 10;
    static int b;
    int empID = 555;

    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }
    {
        b = a * 10;
    }
    {
        System.out.println("I am a non static block");
    }
    public StaticPractice(){
        System.out.println("default constructor called");
    }
    static void m1(){
        System.out.println("inside m1");
    }
    public void show(){
        System.out.println("value of a is: "+this.a);
        System.out.println("value of employee id is: "+this.empID);
    }
    public static void display(){
        System.out.println("value of a is: "+a);
    }
    public static void main(String[] args){
        System.out.println("from main");
        System.out.println("value of a is: "+a);
        System.out.println("value of b is: "+b);

        StaticPractice sp1 = new StaticPractice();
        sp1.a = 99;
        sp1.empID = 666;
        StaticPractice sp2 = new StaticPractice();
        System.out.println("value of sp2.a is: "+sp2.a);
        System.out.println(StaticPractice.a);
        StaticPractice.display();
        display();
        System.out.println("value of sp2.empID is "+sp2.empID);
    }


}
