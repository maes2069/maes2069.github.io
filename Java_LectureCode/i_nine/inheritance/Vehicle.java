package i_nine.inheritance;

public class Vehicle {
    private String vehicleType;
    final long regNo=0;

    public Vehicle(){
        System.out.println("Default constructor of super class Vehicle");
    }

    public Vehicle(String a){
        System.out.println("One parameterized constructor of super class Vehicle");
        System.out.println(a);
    }

    public String getVehicleType(){
        return vehicleType;
    }

    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }

    public void show(){
        System.out.println("I am parent class Vehicle");

    }
}
