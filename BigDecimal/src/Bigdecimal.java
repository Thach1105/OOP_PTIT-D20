import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Bigdecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0){
            String daySo = sc.nextLine();
            String[] arr = daySo.split(" ");
            BigDecimal sum = BigDecimal.ZERO;
            for(String num : arr){
                BigDecimal decimal = new BigDecimal(num);
                sum = sum.add(decimal.remainder(BigDecimal.ONE));
            }
            System.out.println(sum);
        }

    }
}
