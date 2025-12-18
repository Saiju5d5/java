class Devloper{
    private String name;
    private int id;
    private String role;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role=role;
    }
}


public class Encapsulation {
    public static void main(String args[]){
        Devloper ob = new Devloper();
        ob.setId(1);
        ob.setName("Raghab");
        ob.setRole("kapa");
        System.out.println(ob.getId());
        System.out.println(ob.getName());
        System.out.println(ob.getRole());
    }
}
