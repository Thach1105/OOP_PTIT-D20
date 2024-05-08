import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0){
            String line = scanner.nextLine();
            String[] arr = line.split(" ");
            int index = Integer.parseInt(arr[1]);
            System.out.printf("The character at position %d is %c\n", index, arr[0].charAt(index));
        }
    }
}
