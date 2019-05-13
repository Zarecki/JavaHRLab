package Employee.Management;

import Employee.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String nINumber, double salary, String deptName) {
        super(name, nINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
