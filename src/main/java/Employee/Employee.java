package Employee;

public abstract class Employee {

    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getnINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percentage){
        this.salary *= percentage;
    }

    public void payBonus(){
        this.salary *= .01;
    }

    public double checkBonus(){
        return this.salary * .01;
    }
}
