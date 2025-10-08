public abstract class Employ{
    abstract void calculateBonus();
    private String name;
    private int salary;

    Employ(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int setSalary(){
        return salary;
    }

    public void getSalary(int salary){
        this.salary = salary;
    }

}