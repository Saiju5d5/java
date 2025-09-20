class methods{
    void add(int a,int b){
        int n1,n2;
        n1=a;
        n2=b;
        System.out.println(n1+n2);
    }
    void add(float f1,float f2){
        float num1,num2;
        num1=f1;
        num2=f2;
        System.out.println(num1+num2);
    }
    void add(String s1,String s2){
        String str1,str2;
        str1=s1;
        str2=s2;
        System.out.println(str1+" "+str2);
    }
}

public class MethodOverloading {
    public static void main(String args[]){
        methods m =new methods();
        m.add(4,5);
        m.add(3.5f,5.3f);
        m.add("shubham","Raghab");
    }
    
}
