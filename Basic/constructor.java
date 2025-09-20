public class student {
    int rno;
    String name;
    student(){
        int rno=0;
        String name="NULL";
    }
    student(int r){
        rno=r;
    }    
    void printstudent(){
        System.out.println(name);
        System.out.println(rno);
    }
}
public class constructor{
public static void main (String args[]){
        student s= new student();
        student s1= new student(1,"xyz");
        student s2= new student(s1);
        s.printstudent();
        s1.printstudent();
        s2.printstudent();
        
}}
