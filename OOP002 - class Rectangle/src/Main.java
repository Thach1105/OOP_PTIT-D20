import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            Rectangle rectangle = new Rectangle(x,y,w,h);
            System.out.println(rectangle.toString());
        }
    }
}
class Rectangle{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.height =height;
        this.width = width;
    }
    public int getHeight(){
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Rectangle" + "[x=" + x + ",y=" + y + ",width=" +width +",height=" +height +"]";
    }
}