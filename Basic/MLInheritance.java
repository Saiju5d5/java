class A
{
 int d=50;
 void print(int a)
{
 System.out.println("Base class");
 System.out.println("The value of a is "+a);
}
}
class B extends A
{
 void print(int b,int c)
{
 super.print(25);
 int z=b+c;
 System.out.println("Derived class");
 System.out.println("The value of b is "+b +" and c is "+c);
 System.out.println("The value of z is "+z);
 System.out.println("The value of d is "+super.d);
}
}
class C extends B
{
 void show(int p,float q,int r,float s)
{
 System.out.println("The total sum is "+(p+q+r+s));
}
void display(String m,String n)
{
System.out.println("Subject Name: "+m+" "+n);  
}
}
public class MLInheritance
{
 public static void main(String args[]){
 C ob = new C();
 ob.print(45,55);
 ob.show(100,200,300,400);
 ob.display("Java","Programming");
}
}