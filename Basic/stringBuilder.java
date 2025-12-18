public class stringBuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println("StringBuilder is "+sb);
        //charAt index
        System.out.println(sb.charAt(2));
        //SetcharAt index
        sb.setCharAt(0,'S');
        System.out.println(sb);
        //insert 
        sb.insert(2,'n');
        System.out.println(sb);
        //delete
        sb.delete(3,4);
        System.out.println(sb);
        StringBuilder s = new StringBuilder("H");
        System.out.println(s);
        s.append('e');
        s.append('l');
        s.append('l');
        s.append('o');
        System.out.println("After appending : "+s);
    }
}
