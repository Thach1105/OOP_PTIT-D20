import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        double x1,x2,y1,y2;
        while(test-- > 0){
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);

            Double res = p1.slope(p2);
            System.out.println(res);
        }
    }
}

class Point{
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double slope(Point other) {
        if(other.x == this.x) return -1;
        Double res = ((other.y- this.y)/(other.x - this.x));
        if(res == -0.0) res = 0.0;
        return res;
    }
}