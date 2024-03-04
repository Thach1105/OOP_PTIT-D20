import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTest = sc.nextInt();
        while(numberOfTest-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            Quiz.quiz(arr,target);
        }
    }

}
class Quiz{
    public static void quiz(int[] num, int target){
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i = 0; i < num.length; i++){
            int x = target - num[i];
            if(mp.containsKey(x)){
                res[0] = i;
                res[1] = mp.get(x);
            }
            mp.put(num[i],i);
        }
        if(res[0] > res[1]){
            int temp = res[0];
            res[0] = res[1];
            res[1] = temp;
        }
        if(res[0] == -1) System.out.println("Not found");
        else System.out.println(String.valueOf(res[0]) + " " + String.valueOf(res[1]));
    }
}
