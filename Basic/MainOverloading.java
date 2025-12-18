public class MainOverloading {
    public static void main(String[] args) {
        System.out.println("I am in main one.");
        main(); //here static method call directly
        main(3);
        MainOverloading ob = new MainOverloading();//for non static main method we have to create an object to call main method
        ob.main("Raghabendra kumar shah");
    }    
    public static void main() {
        System.out.println("I am in main two.");
    }
    public static void main(int i){
        System.out.println("I am in main "+i);
    }
    public void main(String name){
        System.out.println("Best laude award goes to "+name);
    }
}
