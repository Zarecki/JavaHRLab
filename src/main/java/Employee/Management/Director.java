package Employee.Management;

import Employee.Employee;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nINumber, double salary, String deptName, double budget) {
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    public void payBonus(){
        this.salary = (this.salary + (this.salary * .02));
    }
}
