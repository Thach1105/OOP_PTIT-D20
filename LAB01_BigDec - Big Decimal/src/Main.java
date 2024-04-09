import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0){
            String s_in = scanner.nextLine();
            function(s_in);
        }
    }
    public static void function(String s){
        BigDecimal res = new BigDecimal(BigInteger.ZERO);
        String[] list = s.split(" ");
        ArrayList<BigDecimal> list_bd = new ArrayList<BigDecimal>();

        for(String str : list){
            BigDecimal n = new BigDecimal(str);
            list_bd.add(n);
        }
        for(BigDecimal k : list_bd){
            res.add(k.remainder(BigDecimal.ONE));
        }
        System.out.println(res);
    }

}
