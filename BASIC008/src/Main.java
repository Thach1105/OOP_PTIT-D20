public class Main {
    public static void main(String[] args) {
        System.out.println("Numbers between 100 and 200, divisible by 9:");
        int sum = 0;
        for(int i = 108; i <= 200; i+=9){
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}
