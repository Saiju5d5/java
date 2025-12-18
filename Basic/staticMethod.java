public class staticMethod {
    //static method
    static void sum(int a,int b){
        System.out.println("Static block");
        System.out.println(a+b);
    }
    //non static method
    
    void  multiply(int x,int y){
        System.out.println(x*y);
    }
    public static void main(String args[]){
        //for static method we can call the function diectly(no need to create object)
        sum(4,5);
        //for Non static method we have to create object to call the method
        staticMethod ob = new staticMethod();
        ob.multiply(10,4);
    }
}
