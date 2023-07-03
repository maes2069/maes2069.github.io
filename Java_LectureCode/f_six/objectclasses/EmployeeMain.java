package f_six.objectclasses;

public class EmployeeMain {
    public static void main(String[] args){
        System.out.println("***New Obj: Sam*****");
        Employee sam = new Employee();
        System.out.println(sam.getEmployeeID());
        System.out.println(sam.getSalary());
        System.out.println("***After setting values*****");

        sam.setEmployeeID(111L);
        sam.setSalary(5656.23);

        System.out.println(sam.getEmployeeID());
        System.out.println(sam.getSalary());

        System.out.println("***New Obj: Peter*****");
        Employee peter = new Employee();
        System.out.println(peter.getEmployeeID());
        System.out.println(peter.getSalary());
        System.out.println("***After setting values*****");

        peter.setEmployeeID(222L);
        peter.setSalary(9999.23);

        System.out.println(peter.getEmployeeID());
        System.out.println(peter.getSalary());

    }
}
