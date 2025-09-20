import java.util.HashSet;
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Raghab");    
        names.add("Raghab");    
        names.add("Raghab");    
        names.add("shubham");
        names.add("saiju");
        names.add("kushal");
        for(String name:names){
            System.out.println(name);
        }    
    }
}
