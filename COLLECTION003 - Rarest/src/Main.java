import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            String input = scanner.nextLine();
            String[] arr_s = input.split(" ");
            for (int i = 0; i < arr_s.length; i += 2) {
                map.put(arr_s[i],Integer.parseInt(arr_s[i+1]));
            }
            System.out.println(rarest(map));
        }
    }

    public static int rarest(Map<String, Integer> map) {
        // todo: implement code stub
        int rarestValue = 10000;
        int res = 100;
        Map<Integer, Integer> rarestMap = new HashMap<Integer, Integer>();
        Set<String> set = map.keySet();
        for (String key : set){
            int v = map.get(key);
            if(rarestMap.containsKey(v)){
                int vRare = rarestMap.get(v);
                rarestMap.put(v,vRare+1);
            }else {
                rarestMap.put(v, 1);
            }
        }
        Set<Integer> setKeyRarestMap = rarestMap.keySet();
        for(int k : setKeyRarestMap){
            if(rarestMap.get(k) < rarestValue) {
                rarestValue = rarestMap.get(k);
                res = k;
            }
        }
        return res;
    }
}
