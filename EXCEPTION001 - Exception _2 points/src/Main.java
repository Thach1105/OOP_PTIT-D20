import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0){
            String s = scanner.nextLine();
            String[] arr = s.split(" ");
            Amount a1 = new Amount(arr[0], Integer.parseInt(arr[1]));
            Amount a2 = new Amount(arr[2], Integer.parseInt(arr[3]));
            try {
                a1.add(a2);
            }catch (CurrencyException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class Amount {
    private String currency;
    private int amount;
    public Amount(String currency, int amount){
        this.amount = amount;
        this.currency = currency;
    }
    public void add(Amount amount) throws CurrencyException {
        if(!this.currency.equals(amount.currency)){
            throw new CurrencyException("Currency doesn't match");
        } else {
            System.out.println(this.amount + amount.amount);
        }
    }
}
class CurrencyException extends Exception{
    public CurrencyException(String message) {
        super(message);
    }
}