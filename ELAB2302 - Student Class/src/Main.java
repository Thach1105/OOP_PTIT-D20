import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list_student = new ArrayList<Student>();

        while(scanner.hasNextLine()){
            String ten = scanner.nextLine();
            int tuoi = Integer.parseInt(scanner.nextLine());
            list_student.add(new Student(ten, tuoi));
        }
        for (Student student : list_student){
            student.display();
        }
        System.out.println(list_student.size());
    }
}
class Student{
    private String name;
    private int age;
    public int numberOfStudent;

    public Student(String name, int age){
        this.age = age;
        this.name = name;

    }
    public void display(){
        if(this.age >= 18){
            System.out.println(this.name);
        }
    }
}
