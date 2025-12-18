public class MultiThreading1 implements Runnable{
    public void run(){
        for(int i=1;i<=4;i++){
            System.out.println("Thread Name : "+Thread.currentThread().getName()+"  count : "+i);
        }
    }
    public static void main(String args[]){
        MultiThreading1 task = new MultiThreading1();
        Thread t1 = new Thread(task,"Thread-1");
        Thread t2 = new Thread(task,"Thread-2");
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}
