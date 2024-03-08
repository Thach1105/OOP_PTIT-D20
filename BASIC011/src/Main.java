import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while(test-- > 0){
            String arr_inp = scanner.nextLine();
            System.out.println(minGap(arr_inp));
        }
    }
    public static int minGap(String s){
        String[] arr_str = s.split(" ");
        if(arr_str.length < 2) return 0;
        int[] arr_int = new int[arr_str.length];
        for(int i = 0; i < arr_str.length; i++){
            arr_int[i] = Integer.parseInt(arr_str[i]);
        }
        int res = arr_int[1] - arr_int[0];
        for(int i = 1; i < arr_int.length-1; i++){
            if(res > (arr_int[i+1] - arr_int[i])){
                res = arr_int[i+1] - arr_int[i];
            }
        }
        return res;
    }
}
