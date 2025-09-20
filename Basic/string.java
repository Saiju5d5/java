public class string {
    public static void main (String args[]){
        String name = "sai global,Bhairahawa";
        String name1 = "Sai Global,Bhairahawa";
        String name2 = "   Raghab   ";
        System.out.println("Name : "+name);
        System.out.println(name.length());
        System.out.println("Name : "+name.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name.equals(name1));
        System.out.println(name.charAt(4));
        System.out.println(name1.indexOf("h"));
        System.out.println(name1.substring(0,11));
        System.out.println(name1.replace('a','A'));
        System.out.println(name1.contains("ai"));
        System.out.println(name2.trim());
        
    }
    
}
