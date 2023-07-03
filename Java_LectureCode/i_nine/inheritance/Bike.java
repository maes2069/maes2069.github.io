package i_nine.inheritance;

public class Bike extends Vehicle{
    public Bike(){
        super("hasdfasdf");
        System.out.println("Default constructor of child class Bike");
        super.setVehicleType("Bike is two wheeler");
    }

    public void display(){
        System.out.println(super.getVehicleType());
        System.out.println(super.regNo);
    }

    @Override
    public void show(){
        System.out.println("I am child class Bike");
    }

}
