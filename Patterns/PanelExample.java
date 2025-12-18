import java.awt.*;
import java.awt.event.*;

public class PanelExample {
    public static void main(String[] args) {

        // Create a Frame
        Frame frame = new Frame("Panel Example");

        // Create a Panel
        Panel panel = new Panel();
        panel.setBackground(Color.LIGHT_GRAY); // Give color to panel
        panel.setLayout(new GridBagLayout());

        // Add components to Panel
        Label lbl = new Label("Enter your name:");
        TextField txt = new TextField(15);
        Button btn = new Button("Submit");

        panel.add(lbl);
        panel.add(txt);
        panel.add(btn);

        // Add Panel to Frame
        frame.add(panel);

        // Set Frame properties
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        // Center the Frame
        frame.setLocationRelativeTo(null);

        // Close properly
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
    }
}
