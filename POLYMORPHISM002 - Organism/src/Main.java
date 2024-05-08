import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Herd h = new Herd();
        while(t-- > 0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Organism o = new Organism(x, y);
            h.addToHerd(o);
        }
        h.move(1,1);
        System.out.println(h.toString());
    }
}
interface Moveable{
    void move(int dx, int dy);
}
class Organism implements Moveable{
    private  int x;
    private  int y;
    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return String.format("x:%d;y:%d\n", x, y);
    }
}
class Herd{
    private List<Organism> organisms;
    public Herd(){
        this.organisms = new ArrayList<>();
    }

    public void addToHerd(Organism organism){
        organisms.add(organism);
    }
    public void move(int dx, int dy){
        for(Organism o : organisms){
            o.move(dx, dy);
        }
    }
    @Override
    public String toString() {
        String display = "";
        for(Organism o : organisms){
            display += o.toString();
        }
        return display;
    }
}