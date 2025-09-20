class Address {
    int Hno;
    String city, state, country;

    Address(int Hno,String city, String state, String country) {
        this.Hno = Hno;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    void display(){
        System.out.println(Hno+" "+city+" "+state+" "+country);
    }
}

class Student {
    int id;
    String name,dept;
    Address address;  

    Student(int id, String name,String dept, Address address) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.address = address;
    }

    void display() {
        System.out.println(id+ " " + name +" "+ dept);
        //System.out.println(address.city + ", " + address.state + ", " + address.country);
        address.display();
        
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address addr1 = new Address(106,"Bhairahawa", "lumbini", "Nepal ");
        Student s1 = new Student(105, "Saiju", "CSE",addr1);
        s1.display();
    }
}
