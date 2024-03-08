import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- > 0){
            long n = scanner.nextLong();
            System.out.println(swapDigitPairs(n));
        }
    }
    public static long daoNguocSo2ChuSo(long n){
        if(n == 0) return 0;
        long d = n % 10;
        n = n / 10;
        long res = d * 10 + n;
        return res;
    }
    public static long swapDigitPairs(long n){
        if(n < 10) return n;
        long du = n % 100;
        du = daoNguocSo2ChuSo(du);
        n = n / 100;
        return swapDigitPairs(n)*100 + du;
    }
}
