import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String s = scanner.nextLine();
        String n2 = s.substring(s.indexOf(34)+1,s.lastIndexOf(34));
        if(n.equals(n2)) System.out.println(true);
        else System.out.println(false);
    }
}
