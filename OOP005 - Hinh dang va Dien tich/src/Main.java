import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0){
            String line = scanner.nextLine();
            String[] arr = line.split(" ");
            if(arr.length == 3){
                Rectangle rectangle = new Rectangle(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]));
                rectangle.displayInfo();
            }else {
                Circle circle = new Circle(arr[0], Double.parseDouble(arr[1]));
                circle.displayInfo();
            }
        }
    }
}

abstract class Shape{
    protected String name;
    public Shape(String name){
        this.name = name;
    }
    public abstract double calculateArea();
    public void displayInfo(){
        System.out.printf("Shape:%s|Area:%.2f\n", name, this.calculateArea());
    }
}

class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(String name, double width, double length){
        super(name);
        this.width = width;
        this.length = length;
    }
    @Override
    public double calculateArea() {
        return length*width;
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}