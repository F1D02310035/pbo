public class Staff extends Employ {
    @Override
    void calculateBonus(){
        System.out.println("Bonus untuk staff bulan ini adalah 1 juta");
    }
    private int id;

    Staff(String name, int salary, int id){
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
