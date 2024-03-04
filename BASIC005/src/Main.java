//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTest = scanner.nextInt();
        scanner.nextLine();
        while(numberOfTest > 0){
            BigInteger[] nums = new BigInteger[5];
            BigInteger sum = new BigInteger("0");
            for(int i = 0; i < 5; i++){
                nums[i] = scanner.nextBigInteger();
                sum = sum.add(nums[i]);
            }
            System.out.println(sum);
            numberOfTest--;
        }
    }
}