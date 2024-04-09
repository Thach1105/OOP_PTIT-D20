import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0){
            String s_in = scanner.nextLine();
            try {
                hasVowels(s_in);
            }catch (NoHasVowelsException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void hasVowels(String s) throws NoHasVowelsException{
        boolean check = false;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(isVowel(c)){
                check = true;
                break;
            }
        }
        if(check) System.out.println("String has vowels");
        else throw new NoHasVowelsException("String not contain vowels");
    }
    public static boolean isVowel(char c){
        if("aeiouAEIOU".indexOf(c) == -1) return false;
        return true;
    }
    static class NoHasVowelsException extends Exception{
        public NoHasVowelsException(String message){
            super(message);
        }
    }
}
