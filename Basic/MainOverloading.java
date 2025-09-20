public class MainOverloading {
    public static void main(String[] args) {
        System.out.println("I am in main one.");
        main();
        main(3);
    }    
    public static void main() {
        System.out.println("I am in main two.");
    }
    public static void main(int i){
        System.out.println("I am in main "+i);
    }
}
