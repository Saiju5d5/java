public class setBit {
    public static void main(String args[]){
        int num = 5; //0101
        int pos = 3; 
        int bitmask = 1<<pos; //1000
        int newNumber = bitmask | num;
        System.out.println(newNumber);
        
    }
}
