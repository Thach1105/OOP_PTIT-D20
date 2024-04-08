import java.nio.file.Watchable;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Warehouse wh = new Warehouse();
        wh.addProduct("milk", 10);
        wh.addProduct("coffee", 7);

        System.out.println("prices:");
        System.out.print("milk: ");
        System.out.println(wh.stock("milk"));
        System.out.print("coffee: ");
        System.out.println(wh.stock("coffee"));
        System.out.print("sugar: ");
        System.out.println(wh.stock("sugar"));
    }
}
class Warehouse {
    private HashMap<String, Integer> products;
    public Warehouse(){
        products = new HashMap<>();
    }
    public void addProduct(String product, int stock){
        products.put(product, stock);
    }

    public int stock(String product){
        if(products.get(product) == null) return -99;
        else return products.get(product);
    }
}
