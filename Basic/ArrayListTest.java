import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<>();
        names.add("Raghab");
        names.add("kushal");
        names.add("saiju");
        names.add("shubham");
        names.add("prajwal");
        for(String name:names){
            System.out.println(name);
        }
    }
}
