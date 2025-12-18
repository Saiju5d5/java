abstract class vehicle{
    abstract void car();
    abstract void Bike();
}
class Company extends vehicle{
    void car(){
        System.out.println("hundai,suzuki,TATA,Mahindra,Nissan");
    }
    void Bike(){
        System.out.println("yamaha,Honda,Bjaj,Suzuki");
    }
}
public class AbstractionEx {
    public static void main(String[] args){
        Company ob= new Company();
        ob.car(); 
        ob.Bike();
    }   
}
