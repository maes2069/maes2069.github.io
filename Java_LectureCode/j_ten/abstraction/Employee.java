package j_ten.abstraction;

public abstract class Employee {
    private String companyName = "xyz Private Limited";
    public String getCompanyName(){
        return this.companyName;
    }
    public abstract double calculateSalary(String employmentType);
}
