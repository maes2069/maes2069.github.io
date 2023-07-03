package i_nine.inheritance;

public class Car extends Vehicle{
    public long buildNumber;
    public Car(){
        System.out.println("Default constructor of child class Car");
        super.setVehicleType("Car is four wheeler");
    }

    public Car(long buildNumber){
        this();
        this.buildNumber=buildNumber;
    }

    public Car(String a, long xyz){
        this(7l);
    }

    public void showDetails(){
        System.out.println(getVehicleType());
        System.out.println("Build number of car is "+this.buildNumber);
    }

    @Override
    public void show(){
        System.out.println("I am child class car");
    }
}
