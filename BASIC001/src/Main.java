import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTest = scanner.nextInt();
        scanner.nextLine();

        while(numberOfTest > 0){
            String s = scanner.nextLine();
            System.out.println(s);
            numberOfTest--;
        }

    }
}