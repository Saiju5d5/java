public class finallyBlock {
    public static void main(String args[]){
        int a=10;
        int b=0;
        try {
            float result =a/b;
            System.out.println(result);
        }
        finally{
            System.out.println(a+b);
            System.out.println("Finally block exceuted,either Exception is handled or not");
        }
    }
}
