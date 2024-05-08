import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BoxWithMaxWeight BWMW = new BoxWithMaxWeight(10);
        Item saludo = new Item("Saludo", 5);
        Item pirkka = new Item("Pirkka", 5);
        Item kopiLuwak = new Item("Kopi Luwak", 5);
        BWMW.add(saludo);
        BWMW.add(pirkka);
        BWMW.add(kopiLuwak);

        Item Saludo = new Item("Saludo");
        Item Pirkka = new Item("Pirkka");
        Item KopiLuwak = new Item("Kopi Luwak");
        System.out.println(BWMW.isInBox(Saludo));
        System.out.println(BWMW.isInBox(Pirkka));
        System.out.println(BWMW.isInBox(KopiLuwak));
    }
}
class Item{
    private String name;
    private int weight;
    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public Item(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}

abstract class Box{
    public abstract void add(Item item);
    public abstract boolean isInBox(Item item);
}

class BoxWithMaxWeight extends Box{
    private List<Item> items;
    private int maxWeight;
    public BoxWithMaxWeight(int maxWeight){
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    @Override
    public void add(Item item) {
        if(item.getWeight() <= maxWeight){
            this.items.add(item);
            maxWeight -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item i : items){
            if(i.getName().equals(item.getName())){
                return true;
            }
        }
        return false;
    }
}
