import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pGOC = -1;
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Point> points = new ArrayList<Point>();
        ArrayList<String> inputString = new ArrayList<String>();
        ArrayList<String> namePoints = new ArrayList<String>();
        while (scanner.hasNextLine()){
            inputString.add(scanner.nextLine());
        }
        String goc = inputString.get(inputString.size()-1);
        for(int i = 0; i < inputString.size()-1; i = i+2){
            //tách chuỗi số thành mảng double
            String[] dou_list = inputString.get(i+1).split(" ");
            if(!checkNamePoint(inputString.get(i))){
                check = false;
            }
            Point p = new Point(inputString.get(i), Double.parseDouble(dou_list[0]), Double.parseDouble(dou_list[1]), Double.parseDouble(dou_list[2]));
            points.add(p);
        }
        if(check == false){
            System.out.println("invalid input");
            return;
        }
        for(int i = 0; i < points.size(); i++){
            if(goc.equals(points.get(i).getNamePoint()))
            {
                pGOC = i;
                break;
            }
        }
        if(pGOC == -1){
            System.out.println("invalid input");
            return;
        }
        for(int i = 0; i < points.size(); i++){
            if(i != pGOC){
                Line line = new Line(points.get(pGOC), points.get(i));
                line.getDistance();
            }
        }
    }
    public static boolean checkNamePoint(String s){
        if(s.length() > 1) return false;
        return Character.isLetter(s.charAt(0));
    }

}
class Point{
    private String namePoint;
    private double x;
    private double y;
    private double z;
    public Point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point(String namePoint, double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        this.namePoint = namePoint;
    }

    public String getNamePoint() {
        return namePoint;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + x +", " +y +", "+z+")";
    }
}
class Line{
    private Point p1;
    private Point p2;
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public void getDistance(){
        if(String.valueOf(p1.getX()).equals(String.valueOf(p2.getX())) && String.valueOf(p1.getY()).equals(String.valueOf(p2.getY())) && String.valueOf(p1.getZ()).equals(String.valueOf(p2.getZ())))
        {
            System.out.printf("Line %s%s: same point\n", p1.getNamePoint(), p2.getNamePoint());
            return;
        }
        double distance = 0;
        distance = Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(),2) + Math.pow(p1.getZ()-p2.getZ(),2);
        distance = Math.sqrt(distance);
        System.out.printf("Line %s%s: %.2f\n",p1.getNamePoint(),p2.getNamePoint(), distance);
    }
}