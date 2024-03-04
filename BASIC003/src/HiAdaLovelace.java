import java.util.Scanner;

public class HiAdaLovelace {
    public static void main(String[] args) {
        String name = "";
        Scanner sc = new Scanner(System.in);
        int numberOfTest = sc.nextInt();
        sc.nextLine();
        while(numberOfTest > 0){
            name = sc.nextLine();
            name = "Hi " + name;
            System.out.println(name);
            numberOfTest--;
        }
    }
}
