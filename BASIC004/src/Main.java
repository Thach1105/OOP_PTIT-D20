import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0){
            String name = sc.nextLine();
            System.out.println("Hi " + name);
        }
    }
}
