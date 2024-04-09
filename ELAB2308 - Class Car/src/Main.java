import javax.security.sasl.SaslClient;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0){
            String s_in = scanner.nextLine();
            String[] arr = s_in.split(" ");
            if(arr[0].equals("SC")){
                SportCar sc = new SportCar(Double.parseDouble(arr[1]), Integer.parseInt(arr[2]));
                System.out.println(sc.toString());
                continue;
            }
            if(arr[0].equals("CC")){
                ClassicCar cc = new ClassicCar(Double.parseDouble(arr[1]), Integer.parseInt(arr[2]));
                System.out.println(cc.toString());
            }
        }
        Car.getMaxSalePrice();
    }
}
class Car{
    static double maxSalePrice = 0;
    protected double price;
    protected int year;
    public Car(double price, int year){
        this.price = price;
        this.year = year;
    }
    public double calculateSalePrice(){
        return 0;
    }
    static public void getMaxSalePrice(){
        DecimalFormat currencyFormat = new DecimalFormat("#,###.##");
        String formattedMaxSalePrice = currencyFormat.format(maxSalePrice);
        if(formattedMaxSalePrice.indexOf('.') == -1) formattedMaxSalePrice+=".00";
        System.out.println("Most Expensive: " + formattedMaxSalePrice + " VND");
    }
    @Override
    public String toString() {
        DecimalFormat currencyFormat = new DecimalFormat("#,###.##");
        String formattedSalePrice = currencyFormat.format(this.calculateSalePrice());
        if(formattedSalePrice.indexOf('.') == -1) formattedSalePrice+=".00";
        return "Price: " + formattedSalePrice + " VND | Year: " + this.year;
    }
}
class ClassicCar extends Car{

    public ClassicCar(double price, int year) {
        super(price, year);
    }

    public double calculateSalePrice() {
        double salePrice = 0;
        salePrice = this.price * 1.12 + 20_000_000;
        if(salePrice > maxSalePrice) maxSalePrice = salePrice;
        return salePrice;
    }
}
class SportCar extends Car{

    public SportCar(double price, int year) {
        super(price, year);
    }

    public double calculateSalePrice() {
        double salePrice = 0;
        if(this.year > 2018) { salePrice = this.price*0.8; }
        else if (this.year > 2010) { salePrice = this.price*0.5; }
        else salePrice = this.price*0.1;
        if(salePrice > maxSalePrice) maxSalePrice = salePrice;
        return salePrice;
    }

}