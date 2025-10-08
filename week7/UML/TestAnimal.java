public class TestAnimal {
    public static void main(String[] args) {
        //Animal animal1 = new Animal ("AUCH", 3);
        //System.out.println("Nama animal 1 adalah " + animal1.getName());
        //System.out.println("Umur animal 1 adalah " + animal1.getAge());
        //animal1.makeSound();

        Dog dog1 = new Dog ("Heli", 5, "Buldog");
        System.out.println("Nama dog 1 adalah " + dog1.getName());
        System.out.println("Umur dog 1 adalah " + dog1.getAge());
        System.out.println("Ras dog 1 adalah " + dog1.getBreed());
        dog1.makeSound();
    }
}
