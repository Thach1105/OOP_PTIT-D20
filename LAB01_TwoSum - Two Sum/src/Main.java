import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            List<Integer> arr = new ArrayList<>();
            int n = scanner.nextInt();
            for(int i = 0; i < n; i++){
                arr.add(scanner.nextInt());
            }
            int target = scanner.nextInt();
            twoSum(arr, target);
        }
    }
    public static void twoSum(List<Integer> arr, int target){
        Map<Integer, Integer> m = new HashMap<>();
        boolean check = false;
        for(int i = 0; i < arr.size(); i++){
            int temp = target - arr.get(i);
            if(m.containsKey(temp)){
                check = true;
                System.out.println(m.get(temp) + " " + i);
                break;
            }else {
                m.put(arr.get(i), i);
            }
        }
        if(!check) System.out.println("Not found");
    }
}
