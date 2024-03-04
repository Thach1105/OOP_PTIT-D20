public class Main {
    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}
class SimpleDate{
    private int day;
    private int month;
    private int year;
    public SimpleDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Object obj){
        if(obj instanceof SimpleDate){
            if((((SimpleDate) obj).day == this.day) && (((SimpleDate) obj).month == this.month) && (((SimpleDate) obj).year == year)){
                return true;
            }
        }
        return false;
    }
}
