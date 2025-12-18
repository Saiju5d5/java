public class getBit {
    public static void main(String args[]){
        int num = 5; //0101
        int pos = 3; //0011
        int bitmask = 1<<pos; //1000
        if((bitmask & num)==0){
            System.out.println("Bit is zero.");
        }
        else {
            System.out.println("Bit is one.");
        }
    }
}
