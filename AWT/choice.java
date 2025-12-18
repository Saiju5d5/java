import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class choice {
    public static void main(String args[]){
        Frame f = new Frame();
        Choice c = new Choice();
        Button b= new Button("Press here");
        Label l = new Label("welcome to java awt.");
        l.setBounds(60,100, 230,40);
        f.add(l);
        b.setBounds(400,400,80,50);
        b.setBackground(Color.RED);
        f.add(b);
        c.add("Red");
        c.add("Black");
        c.add("Blue");
        c.add("Pink");
        c.add("Purple");
        c.add("Green");
        c.setBounds(300,300,100,100);
        f.add(c);
        f.setTitle("java choice");
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(1000,1000);
        f.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){

            f.dispose();
            System.exit(0);
        }
        });
    }
}
