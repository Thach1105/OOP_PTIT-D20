import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- > 0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(quadrant(x,y));
        }

    }

    public static int quadrant(int x, int y){
        if(x == 0 || y == 0) return 0;
        if(x > 0 && y > 0) return 1;
        if(x > 0 && y < 0) return 4;
        if(y < 0 && x < 0) return 3;
        return 2;
    }
}
