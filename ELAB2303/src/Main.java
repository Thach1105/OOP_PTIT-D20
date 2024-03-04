
public class Main {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");



        // b. Viết thêm code vào dấu ...
        //...
        if(m2.getName().equals(m1.getName())){
            System.out.println("value compared: same");
        }else {
            System.out.println("value compared: different");
        }
        // a.
        if (m2.equals(m1))
            System.out.println("reference compared: same");
        else
            System.out.println("reference compared: different");
    }
}
class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
//        System.out.println("My Stuff is: " + name);
    }

    public String getName() {
        return name;
    }
}