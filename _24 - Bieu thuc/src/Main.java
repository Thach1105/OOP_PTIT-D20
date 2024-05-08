import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            BieuThuc b = new BieuThuc(x, y);
            System.out.println(b.add() + " " + b.substract() + " " + b.divide());
        }
    }

}
class BieuThuc{
    private int x;
    private int y;
    public BieuThuc(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int add(){
        return x+y;
    }
    public int substract(){
        return x-y;
    }
    public int divide(){
        if(y == 0) return -1;
        return x/y;
    }
}
