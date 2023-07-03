package k_eleven.arrays;

import java.util.Scanner;

public class EmployeesIdProject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of employees in your company");
        int numberOfEmployees=scanner.nextInt();
        int arrayOfEmployees[] = new int[numberOfEmployees];

        for(int i=0; i<arrayOfEmployees.length; i++){
            System.out.println("enter the EmployeeID of "+(i+1)+"employee");
            arrayOfEmployees[i]=scanner.nextInt();
        }
        for(int i=0; i<arrayOfEmployees.length; i++){
            System.out.println("EmployeeID of employee "+(i+1)+" is "+arrayOfEmployees[i]);
        }
    }
}
