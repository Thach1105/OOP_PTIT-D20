import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0)
        {
            int year = scanner.nextInt();
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0) System.out.println(String.valueOf(year) + " : Leap-year");
                    else System.out.println(String.valueOf(year) + " : Non Leap-year");

                    continue;
                }
                System.out.println(String.valueOf(year) + " : Leap-year");
            } else System.out.println(String.valueOf(year) + " : Non Leap-year");
        }
    }
}
