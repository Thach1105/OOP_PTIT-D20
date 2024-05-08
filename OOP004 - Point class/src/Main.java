import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int xa = sc.nextInt();
            int ya = sc.nextInt();
            int xb = sc.nextInt();
            int yb = sc.nextInt();
            Point a = new Point(xa, ya);
            Point b = new Point(xb, yb);
            a.move(1,1);
            System.out.printf("%.2f\n", a.distanceTo(b));
        }
    }

}
class Point{
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    public double distanceTo(Point p){
        double d = Math.pow(x-p.getX(), 2) + Math.pow(y-p.getY(), 2);
        return Math.sqrt(d);
    }
}
