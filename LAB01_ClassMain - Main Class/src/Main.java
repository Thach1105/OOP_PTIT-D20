import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while (test-- > 0){
            String line = scanner.nextLine();
            String arr[] = line.split(" ");
            System.out.println(line.length() + " " + arr.length);
        }
    }

}
