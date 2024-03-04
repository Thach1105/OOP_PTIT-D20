import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTest = sc.nextInt();
        sc.nextLine();

        while(numberOfTest > 0)
        {
            String bieuThuc = sc.nextLine();
            String[] phanTach = bieuThuc.split(" ");
            BigInteger number1 = new BigInteger(phanTach[0]);
            BigInteger number2 = new BigInteger(phanTach[2]);
            BigInteger sum = number1.add(number2);
            System.out.println(sum);
            numberOfTest--;
        }
    }
}