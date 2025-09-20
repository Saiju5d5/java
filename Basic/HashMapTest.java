import java.util.HashMap;
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> login = new HashMap<>();
        login.put("Raghab","22/5d4");
        login.put("saiju","22/5d5");
        login.put("Shubham","22/5d8");
        for(String key:login.keySet()){
            System.out.println("Name: " + key + ", ID: " + login.get(key));
        }
    }
}
