import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0){
            String name = scanner.nextLine();
            int age = scanner.nextInt();

            Person person = new Person(name, age);
            System.out.println(person.toString());
            scanner.nextLine();
        }
    }
}
class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        if(name.equals("") || name.length() > 40) return "Name is not valid";
        if(age < 0 || age > 120) return "Age is not valid";
        return "Name: " + name + "--Age:" + age;
    }
}
