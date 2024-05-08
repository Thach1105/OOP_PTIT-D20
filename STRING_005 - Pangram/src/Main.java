import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0){
            String line = scanner.nextLine();
            System.out.println(isPangram(line));
        }
    }
    public static boolean isPangram(String sentence){
        String s = sentence.toLowerCase();
        for(char c = 'a'; c <= 'z'; c++){
            if(s.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }
}
