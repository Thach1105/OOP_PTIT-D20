import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee clerk1 = new Employee("Grocery Bill");
        GroceryBill gb = new GroceryBill(clerk1);
        gb.add(new Item("item 1", 2.3, 0));
        gb.add(new Item("item 2", 3.45, 0));
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
    private String name;
    private double price;
    private double discount;
    public Item(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        System.out.printf("%s $%.2f (-$%.2f)\n", name, price, discount);
        return "";
    }
}
class Employee{
    private String name;
    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class GroceryBill{
    private Employee clerk;
    protected ArrayList<Item> receipt;
    private double total;
    public GroceryBill(Employee clerk){
        this.clerk = clerk;
        total = 0;
        receipt = new ArrayList<Item>();
    }
    public void add (Item i){
        total += i.getPrice();
        receipt.add(i);
    }

    public double getTotal() {
        return total;
    }

    public Employee getClerk() {
        return clerk;
    }

    @Override
    public String toString() {
        System.out.println("items:");
        for (Item i : receipt){
            System.out.print("   ");
            i.toString();
        }
        System.out.printf("total: $%.2f\n", total);
        System.out.printf("Clerk: %s\n", clerk.getName());
        return "";
    }
}

class DiscountBill extends GroceryBill{
    private double sub_total;
    private double discountAmount;
    private double total;
    public DiscountBill(Employee clerk) {
        super(clerk);
        this.sub_total = 0;
        this.discountAmount = 0;
    }
    public void add(Item i){
        receipt.add(i);
        sub_total += i.getPrice();
        discountAmount += i.getDiscount();
        total = sub_total - discountAmount;
    }

    @Override
    public String toString() {
        System.out.println("items:");
        for(Item i : receipt){
            System.out.print("   ");
            i.toString();
        }
        System.out.printf("sub-total: $%.2f\n", sub_total);
        System.out.printf("discount: $%.2f\n", discountAmount);
        System.out.printf("total: $%.2f\n", total);
        System.out.printf("Clerk: %s\n", this.getClerk().getName());
        return "";
    }
}