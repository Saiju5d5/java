public class MultiThreading extends Thread{
    public void run(){
        System.out.println("Thread is running"+ Thread.currentThread().getName());
       //System.out.println("priority"+Thread.currentThread().getPriority());
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread finished execution");
    }
    public static void main(String args[]){
        Thread t = new MultiThreading();
        System.out.println("Current state : "+t.getState());
        t.start();
        //t.run();
        System.out.println("State after start : "+t.getState());
        System.out.println(t.isAlive());
        try {
            Thread.sleep(100);
            System.out.println("State "+t.getState());
            t.join();
            System.out.println("State while join "+t.getState());
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println(e);
        }
        System.out.println(t.isAlive());
    }
    
}
