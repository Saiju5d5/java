import java.awt.*;
import java.awt.event.*;
public class FrameEx {
    public static void main(String raghab[]){
        Image bgImage;
        Frame f = new Frame();
        f.setTitle("HELLO");
        f.setSize(500,500);
       // f.setBackground(Color.RED);
        //f.bgImage = Toolkit.getDefaultToolkit().getImage("..\\..\\WhatsApp Image 2025-09-15 at 13.39.52_9ae81f56.jpg");
        f.setLayout(null);
        f.setVisible(true);

         f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
                System.exit(0);
            }
        });
    }
}
