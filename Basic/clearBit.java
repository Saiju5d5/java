public class clearBit {
    public static void main(String args[]){
        int num =5; // 0101
        int pos = 2;
        int bitmask = 1<<pos; //0100
        int newNumber = ~(bitmask) & num;
        System.out.println(newNumber);
    }
}
