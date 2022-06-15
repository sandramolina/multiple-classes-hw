package staff;

public abstract class Employee {
    public String name;
    public int NI;
    public double salary;

    public Employee(String name, int NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getNI(){
        return this.NI;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double percentualIncrement){
        if(percentualIncrement > 0){
            this.salary = this.salary * (1+ percentualIncrement);
        }
    }

    public double payBonus(){
        return this.salary = this.salary * 1.01;
    }

    public void setName(String newName){
        if(newName != null){
            this.name = newName;
        }
    }
}
