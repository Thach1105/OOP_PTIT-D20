public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setAge(12);
        dog1.setName("Micky");
        dog1.setBreed("Husky");
        dog1.printDogDetail();
    }
}
class Dog {
    private String name;
    private String breed;
    private int age;
    Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    Dog(){};
    void setName(String name){
        this.name = name;
    }
    void setBreed(String breed){
        this.breed = breed;
    }
    void setAge(int age){
        this.age = age;
    }
    void printDogDetail(){
        String str_out = "Name:"+this.name+"--Breed:"+this.breed+"--Age:"+this.age;
        System.out.println(str_out);
    }
}

