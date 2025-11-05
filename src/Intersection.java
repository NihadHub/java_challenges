import java.util.*;

public class Intersection {
    public static void main(String[]args){
        List<Integer>L1= Arrays.asList(4,2,6,9);
        List<Integer>L2= Arrays.asList(4,67,6,87);
        Set<Integer> set = new HashSet<>(L1);
        set.retainAll(L2);
        System.out.println("Les elements en communs sont: "+set);
    }
}
