class A{
    void print(){
        System.out.println("We are in print method of class A");
    }
    void show(){
        System.out.println("We are in show method of class A");
    }
}
class B extends A{
    @Override
    void print(){
        System.out.println("We are in print method of class B");
    }
    @Override
    void show(){
        System.out.println("We are in show method of class B");
    }

}
public class RunTimePoly {
    public static void main(String args[]) {
        A sc = new B();
        //sc.print();
        //sc.show();
    }
    
}
