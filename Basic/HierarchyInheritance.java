class Math{
    void Addition(int x,int y){
        System.out.println(x+y);
    }
    void Subtraction(int a ,int b){
        System.out.println(a-b);
        
    }
}
class science extends Math{
    void print(String topic){
        System.out.println(topic);
    }
}
class Account extends Math{
    void show(int amount){
        System.out.println(amount);
        System.out.println("raghab");
    }
}
public class HierarchyInheritance {
    public static void main(String args[]){
        science s = new science();
        s.Addition(3,4);
        s.Subtraction(10,5);
        s.print("physic");

        Account a= new Account();
        a.Addition(25,45);
        a.Subtraction(45,25 );
        a.show(25000);
    }
}
