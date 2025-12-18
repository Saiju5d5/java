import  java.util.*;
public class MapInterface {
    public static void main(String args[]){
        Map<Integer,String> pair = new HashMap<>();
        pair.put(1,"Laptop");
        pair.put(2,"Mobile");
        pair.put(3,"Tablet");
        pair.put(4,"Smartwatch");
        pair.put(1,"Powerbank");
        System.out.println(pair);
    }
}
