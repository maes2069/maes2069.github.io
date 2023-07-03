package r_eighteen.list;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] a){
        ArrayList<Employee> empList = new ArrayList<>();
        List<Employee> empList2 = new ArrayList<>();

        Employee emp = new Employee();
        emp.setEmpID(111L);
        emp.setEmpName("John Doe");
        empList2.add(emp);

        emp = new Employee();
        emp.setEmpID(222L);
        emp.setEmpName("Peter Smith");
        empList2.add(emp);

        for(Employee e: empList2){
            System.out.println("Employee with ID " +e.getEmpID()+" is " +e.getEmpName());
        }
    }
}
