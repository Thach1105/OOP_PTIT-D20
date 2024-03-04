import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTest = scanner.nextInt();
        scanner.nextLine();
        String strInput;
        while(numberOfTest > 0){
            strInput = scanner.nextLine();
            String[] mangSo = strInput.split(" ");
            int[] mangSoNguyen = new int[mangSo.length];
            for(int i = 0; i < mangSo.length; i++){
                mangSoNguyen[i] = Integer.parseInt(mangSo[i]);
            }
            int res = longestSortedSequence(mangSoNguyen);
            System.out.println(res);
            numberOfTest--;
        }
    }
    static int longestSortedSequence(int[] array){
        if(array.length == 0) return 0;
        int result = 1, count = 1;
        for(int i = 1; i < array.length; i++){
            if(array[i] >=  array[i-1]){
                count += 1;
            }
            else count = 1;
            if(count > result) result = count;
        }
        return result;
    }
}
