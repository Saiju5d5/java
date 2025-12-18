import java.util.*;
public class QueueInterface {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(30);
        q.add(20);
        q.add(60);
        q.add(40);
        q.add(10);
        System.out.println(q);
        q.remove();//follow FIFO order to remove
        System.out.println(q);
        
    }
}
