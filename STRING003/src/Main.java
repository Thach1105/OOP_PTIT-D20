import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0){
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            System.out.println(s1.equalsIgnoreCase(s2));
        }

    }
}
