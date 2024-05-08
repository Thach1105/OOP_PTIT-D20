public class Main {
    public static void main(String[] args) {
        TripleTacoBox tripleB = new TripleTacoBox();
        tripleB.eat();
        tripleB.eat();
        System.out.println("Triple taco boxes left: " +tripleB.tacoRemaining());
        CustomTacoBox customB = new CustomTacoBox(8);
        customB.eat();
        System.out.println("Custom taco boxes left: "+customB.tacoRemaining());
    }
}
interface TacoBox{
    int tacoRemaining();
    void eat();
}

class TripleTacoBox implements TacoBox{
    private int tacos;
    public TripleTacoBox(){
        tacos = 3;
    }
    @Override
    public int tacoRemaining() {
        return tacos;
    }
    @Override
    public void eat() {
        tacos--;
    }
}
class CustomTacoBox implements TacoBox{
    private int tacos;
    public CustomTacoBox(int initalTaco){
        this.tacos = initalTaco;
    }

    @Override
    public int tacoRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        tacos--;
    }
}