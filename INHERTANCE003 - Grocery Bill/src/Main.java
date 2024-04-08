import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee clerk1  = new Employee("Grocery Bill");
        GroceryBill gb = new GroceryBill(clerk1);
        gb.add(new Item("item 1", 2.3, 0));
        gb.add((new Item("item 2", 3.45, 0)));
        gb.toString();
        System.out.println();
        Employee clerk2 = new Employee("Discount Bill");
        DiscountBill db = new DiscountBill(clerk2);
        db.add(new Item("item 3", 20, 15));
        db.add(new Item("item 4", 40, 35));
        db.add(new Item("item 5", 50, 35));
        db.toString();
    }

}
class Item{
    public String name;
    public double price;
    public double discount;

    public Item(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public double getPrice(){
        price *= 1.00;
        return this.price;
    }
    public double getDiscount(){
        return discount;
    }
    public String toString(){
        System.out.printf("   %s $%.2f (-$%.2f)\n", name, price, discount);
        return "";
    }
}

class Employee{
    public String name;
    public Employee(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

class GroceryBill{
    private Employee clerk;
    protected ArrayList<Item> receipt;
    private double total;

    public GroceryBill(Employee clerk){
        this.clerk = clerk;
        receipt = new ArrayList<Item>();
    }

    public void add(Item i){
        receipt.add(i);
        total += i.price;
    }
    public double getTotal(){
        return total;
    }
    public Employee getClerk(){
        return clerk;
    }

    public String toString(){
        System.out.println("items:");
        for(Item i : receipt){
            i.toString();
        }
        System.out.printf("total: $%.2f\n", total);
        System.out.printf("Clerk: %s\n", clerk.getName());
        return "";
    }
}
class DiscountBill extends GroceryBill{
    private double discountAmount;
    private double sub_total;
    public DiscountBill(Employee clerk) {
        super(clerk);
        sub_total = 0;
    }
    public void add(Item i){
        receipt.add(i);
        discountAmount += i.discount;
        sub_total += i.price;
    }
    public String toString(){
        System.out.println("items:");
        for(Item i : receipt){
            i.toString();
        }
        System.out.printf("sub-total: $%.2f\n", sub_total);
        System.out.printf("discount: $%.2f\n", discountAmount);
        System.out.printf("total: $%.2f\n", (sub_total-discountAmount));
        System.out.printf("Clerk: %s\n", getClerk().getName());
        return "";
    }
}
