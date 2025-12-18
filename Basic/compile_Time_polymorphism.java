class printer {
    void print(int x){
        System.out.println(x);
    }
    void print(double y){
        System.out.println(y);
    }
    void print(String s){
        System.out.println(s);
    }
}

public class compile_Time_polymorphism {
    public static void main(String[] args) {
        printer p = new printer();
        p.print(1);
        p.print(2.00);
        p.print("xerox");
    }
}

