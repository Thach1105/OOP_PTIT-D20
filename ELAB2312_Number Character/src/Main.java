import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int res = 0;
        while(sc.hasNextLine()){
            s = sc.nextLine();
            char c;
            for (int i = 0; i < s.length(); i++){
                c = s.charAt(i);
                if (Character.isDigit(c)) res++;
            }
            System.out.println(res);
            res = 0;
        }
        sc.close();
    }
}