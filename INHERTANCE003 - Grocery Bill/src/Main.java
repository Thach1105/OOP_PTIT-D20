import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee clerk1 = new Employee("Grocery Bill");
        GroceryBill gb = new GroceryBill(clerk1);
        gb.add(new Item("item 1", 2.3, 0));
        gb.add(new Item("item 2", 3.45, 0));
        System.out.println(gb.toString());
        Employee clerk2 = new Employee("Discount Bill");
        DiscountBill db = new DiscountBill(clerk2);
        db.add(new Item("item 3", 20, 15));
        db.add(new Item("item 4", 40, 35));
        db.add(new Item("item 5", 50, 55));
        System.out.print(db.toString());
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
        return String.format("   %s $%.2f (-$%.2f)",this.name, this.price, this.discount);
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
        StringBuilder ans = new StringBuilder("items:\n");
        for (Item i : receipt){
            ans.append(i.toString()).append("\n");
        }
        ans.append("total: ").append(String.format("$%.2f",getTotal())).append("\n");
        ans.append("Clerk: ").append(getClerk().getName()).append("\n");
        return ans.toString();
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
        StringBuilder ans = new StringBuilder("items:\n");
        for(Item i : this.receipt){
            ans.append(i.toString()).append("\n");
        }
        ans.append("sub-total: ").append(String.format("$%.2f",this.sub_total)).append("\n");
        ans.append("discount: ").append(String.format("$%.2f",this.discountAmount)).append("\n");
        ans.append("total: ").append(String.format("$%.2f",this.total)).append("\n");
        ans.append("Clerk: ").append(getClerk().getName());
        return ans.toString();
    }
}