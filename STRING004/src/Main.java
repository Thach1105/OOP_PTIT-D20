import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while (test-- > 0){
            String s = scanner.nextLine();
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.length());
        }
    }


}
