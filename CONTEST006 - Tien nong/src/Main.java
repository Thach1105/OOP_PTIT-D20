public class Main {
    public static void main(String[] args) {
        //(1)
        Money a = new Money(10, 8);
        Money b = new Money(5, 5);
        Money c = a.plus(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //(2)
        Money u = new Money(10,0);
        Money y = new Money(3, 0);
        Money w = new Money(5, 0);
        System.out.println(u.lessThan(y));
        System.out.println(y.lessThan(w));

        //(3)
        Money m = new Money(10, 0);
        Money n = new Money(3, 50);
        Money o = m.minus(n);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        o = o.minus(m);
        System.out.println(o);
    }
}
class Money{
    private int euros;
    private int cent;
    public Money(int euros, int cent){
        this.cent = cent;
        this.euros = euros;
    }
    public Money plus(Money added){
        Money m = new Money(0,0);
        m.cent = this.cent + added.cent;
        int du = m.cent / 100;
        m.cent = m.cent % 100;
        m.euros = this.euros + added.euros + du;
        return m;
    }
    public boolean lessThan(Money compared){
       if(this.euros < compared.euros) return true;
       if(this.euros == compared.euros && this.cent < compared.cent) return true;
       return false;
    }
    public Money minus(Money minus){
        Money o = new Money(0,0);
        int m1 = this.euros * 100 + this.cent;
        int m2 = minus.euros * 100 + minus.cent;
        if(m1 < m2){
            o.euros = 0;
            o.cent = 0;
        }else {
            int m = m1 - m2;
            o.euros = m /100;
            o.cent = m % 100;
        }
        return o;
    }
    @Override
    public String toString() {
        String scent = String.valueOf(this.cent);
        if(scent.length() == 1) scent = "0" + scent;
        return this.euros + "." + scent + "e";
    }
}
