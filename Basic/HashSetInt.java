import java.util.HashSet;
public class HashSetInt {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(20);    
        numbers.add(30);    
        numbers.add(40);    
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);
        for(Integer n:numbers){
            System.out.println(n);
        }    
    }
}
