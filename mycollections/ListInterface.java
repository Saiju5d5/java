import java.util.*;
public class ListInterface {
    public static void main(String raghab[]){
        List<String> l = new ArrayList<>();
        l.add("Raghab");
        l.add("shubham");
        l.add("saiju");
        l.add("kushal");
        l.add("prajwal");
        System.out.println(l);
        System.out.println(l.get(3));
        System.out.println(l.contains("kushal"));
        l.set(2,"SAIJU");
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.contains("kushal"));
        
    }    
    
}
