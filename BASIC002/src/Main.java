import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTest = sc.nextInt();
        sc.nextLine();
        String str_input = "";

        while(numberOfTest > 0){
            str_input = sc.nextLine();
            System.out.println(str_input);
            numberOfTest--;
        }
    }
}