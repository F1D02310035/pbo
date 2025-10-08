public class Dog extends Animal {
    @Override
    void kembangBiak(){      //harus ada karena ini adalah abstract dari kelas induknya
        System.out.println("Hewan bisa bertelur, beranak, bertelur dan beranak");
    }
    private String breed;

    Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    @Override
    public void makeSound(){
        System.out.println("GukGuk");
    }
}


