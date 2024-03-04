import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();

        while(test-- > 0){
            String name = sc.nextLine();
            String address = sc.nextLine();

            Person p = new Person(name, address);
            System.out.println(p.toString());
        }
    }
}
class Person{
    private String name;
    private String address;
    public Person(){}
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String toString(){
        return this.name + " - " +this.address;
    }
}
