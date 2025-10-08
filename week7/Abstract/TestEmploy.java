public class TestEmploy {
    public static void main(String[] args){
        Staff staff1 = new Staff ("Aeri", 500, 001);
        System.out.println("Nama staff 1 adalah " + staff1.getName());
        System.out.println("Id staff 1 adalah " + staff1.getId());
        staff1.calculateBonus();

        Manager m = new Manager ("Pak C", 1000, 1);
        System.out.println("Nama Manager 1 adalah " + m.getName());
        System.out.println("Id Manager 1 adalah " + m.getId());
        m.calculateBonus();
    }  
}
