abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Wau Wau");
    }
}
public class Abstraction{
    public static void main(String args[]){
        Dog ob=new Dog();
        ob.sound();
    }
}