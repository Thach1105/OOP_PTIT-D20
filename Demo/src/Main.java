//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Literal
       int sum = 0;
       outer: for(int i = 0; i < 5; i++){
           inner: for(int j = ; j < 5; j++){
               sum++;
               if(j == 1) continue;
               if(j == 2) continue outer;
               if(i == 3) break;
               if(j == 4) break outer;
           }
       }
        System.out.println(sum);
    }

}