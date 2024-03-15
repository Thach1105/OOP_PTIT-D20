import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        scanner.nextLine();
        while(testCase-- >0){
            String input = scanner.nextLine();
            String[] arr = input.split("\\s+");
            Stack<Integer> s = new Stack<Integer>();
            for (String str : arr) {
                s.push(Integer.parseInt(str));
            }
            compressDuplicates(s);
        }
    }
    public static void compressDuplicates(Stack<Integer> s){
        Stack<Integer> res = new Stack<Integer>();
        Stack<Integer> temp = new Stack<Integer>();
        int x = s.pop(), count = 1;
        while (!s.empty()){
            if (x == s.peek()){
                count++;
                s.pop();
            }else {
                res.push(x);
                res.push(count);
                x = s.pop();
                count = 1;
            }
        }
        res.push(x);
        res.push(count);
        while (!res.empty()){
            temp.push(res.pop());
        }
        String kq = "";
       for(int a : temp){
           kq += String.valueOf(a) + " ";

       }
        System.out.println(kq.trim());
    }
}
