import java.math.BigInteger;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        int numberOfTest = scanner.nextInt();
        scanner.nextLine();
        while(numberOfTest > 0) {
            String bieuThuc = scanner.nextLine();
            String[] phanTach = bieuThuc.split(" ");
            BigInteger num1 = new BigInteger(phanTach[0]);
            String phepTinh = phanTach[1];
            BigInteger num2 = new BigInteger(phanTach[2]);
            if(phepTinh.equals("+")){
                System.out.println((BigInteger)num1.add(num2));
            }
            if(phepTinh.equals("-")){
                System.out.println((BigInteger)num1.subtract(num2));
            }
            if(phepTinh.equals("*")){
                System.out.println((BigInteger)num1.multiply(num2));
            }
            numberOfTest--;
        }
    }
}