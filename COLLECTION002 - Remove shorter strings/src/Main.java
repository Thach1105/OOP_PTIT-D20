import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while (test-- > 0){
            String input = scanner.nextLine();
            String[] arr_s = input.split(" ");
            ArrayList<String> list = new ArrayList<String>();
            for(String s : arr_s) {
                list.add(s);
            }
            removeShorterStrings(list);
        }
    }
    public static void removeShorterStrings(ArrayList<String> list) {
        //TODO: Implement code.
        ArrayList<String> res = new ArrayList<String>();
        for(int i = 0; i < list.size();){
            if(list.size() % 2 == 1 && i == list.size()-1){
                res.add(list.get(list.size()-1));
                break;
            }
            String s1 = list.get(i);
            String s2 = list.get(i+1);
            if(s1.length() <= s2.length()) res.add(s2);
            else res.add(s1);
            i+=2;
        }
        for(int i = 0; i < res.size(); i++){
            System.out.print(res.get(i));
            if(i != res.size()-1) System.out.print(" ");
        }
        System.out.println();
    }
}