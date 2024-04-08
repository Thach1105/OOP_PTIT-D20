public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(st1.toString());
        System.out.print("Study credits ");
        System.out.println(st1.getCredits());
        st1.study();
        System.out.print("Study credits ");
        System.out.print(st1.getCredits());
    }
}

class Person{
    public String name;
    public String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String toString(){
        return name + " - " + address;
    }
}
class Student extends Person{
    static int credit = 0;
    public Student(String name, String address) {
        super(name, address);
    }
    public void study(){
        credit+=1;
    }
    public int getCredits(){
        return credit;
    }
}
