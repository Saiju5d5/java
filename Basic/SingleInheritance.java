class Human{
    void speaks(){
        System.out.println("Englisjh");
    }
}
class Boy extends Human{
    void sings(){
        System.out.println("Hi,I sing");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Boy ob = new Boy();
        ob.speaks();
        ob.sings();
    }
    
}
