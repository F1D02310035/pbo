public class Manager extends Employ {
    @Override
    void calculateBonus(){
        System.out.println("Bonus untuk manager bulan ini adalah 2 juta");
    }
    private int id;

    Manager(String name, int salary, int id){
        super(name, salary);
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    
}
