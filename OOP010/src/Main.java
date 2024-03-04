public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Tape measure");
        Product product2 = new Product("Plaster", "home improvement section");
        Product product3 = new Product("Tyre", 5);
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
    }
}
class Product{
    private String name;
    private String location;
    private int weight;

    public Product(String name){
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }
    public Product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
    }
    public Product(String name, int weight){
        this.name = name;
        this.weight = weight;
        this.location = "shelf";
    }
    public String toString(){
        return (this.name + " (" + this.weight + "kg) can be found from the " + this.location);
    }
}
