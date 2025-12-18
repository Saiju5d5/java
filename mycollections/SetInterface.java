import java.util.*;
public class SetInterface {
    public static void main(String args[]){
        Set<Integer> num = new HashSet<>();
        num.add(10);
        num.add(70);
        num.add(60);
        num.add(40);
        num.add(60);//No Duplicates allowed 
        System.out.println(num);
    }
}
