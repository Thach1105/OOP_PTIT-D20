import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0){
            String line = scanner.nextLine();
            System.out.println(findLongestWord(line));
        }
    }
    public static String findLongestWord(String sentence) {
        String arr[] = sentence.split(" ");
        if(arr.length == 0) return "";
        int maxLength = -1;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() >= maxLength){
                index = i;
                maxLength = arr[i].length();
            }
        }
        return arr[index];
    }
}
