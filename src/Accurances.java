import java.util.*;
public class Accurances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []tab= {1,2,2,2,3,5,3} ;
        Map<Integer, Integer>map = new HashMap<>();
        for(int n:tab){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println(map);
    }
}