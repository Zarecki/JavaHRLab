package Employee;

public abstract class Employee {

    private String name;
    private String nINumber;
    protected double salary;

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
        if (percentage < 0.0) return;
        this.salary = (this.salary + this.salary * (percentage / 100));
    }

    public void payBonus(){
        this.salary = (this.salary + (this.salary * .01));
    }

    public double checkBonus(){
        return this.salary * .01;
    }

    public void changeName(String name){
        if (name != null){
                this.name = name;}
    }
}
