import java.awt.*;
import java.awt.event.*;

public class LoginPageAWT extends Frame implements ActionListener {

    // Declare components
    Label lblUser, lblPass, lblMsg;
    TextField txtUser, txtPass;
    Button btnLogin, btnClear;

    public LoginPageAWT() {
        // Set title
        setTitle("Login Page");

        // Create components
        lblUser = new Label("Username:");
        lblPass = new Label("Password:");
        lblMsg = new Label(" ");
        lblMsg.setPreferredSize(new Dimension(200, 20));
        lblMsg.setAlignment(Label.CENTER);

        txtUser = new TextField(15); // Smaller text field
        txtPass = new TextField(15);
        txtPass.setEchoChar('*'); // Hide password characters

        btnLogin = new Button("Login");
        btnClear = new Button("Clear");

        // Set layout
        setLayout(new GridBagLayout()); // Centered layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8); // Add padding

        // Username Label
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblUser, gbc);

        // Username Field
        gbc.gridx = 1;
        add(txtUser, gbc);

        // Password Label
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblPass, gbc);

        // Password Field
        gbc.gridx = 1;
        add(txtPass, gbc);

        // Login Button
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(btnLogin, gbc);

        // Clear Button
        gbc.gridx = 1;
        add(btnClear, gbc);

        // Message Label (below the buttons)
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add(lblMsg, gbc);

        // Add action listeners
        btnLogin.addActionListener(this);
        btnClear.addActionListener(this);

        // Window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        // Set frame size
        setSize(300, 200);

        // Center the window on screen
        setLocationRelativeTo(null);

        // Make frame visible
        setVisible(true);
    }

    // Handle button actions
    public void actionPerformed(ActionEvent e) {
        String user = txtUser.getText();
        String pass = txtPass.getText();

        if (e.getSource() == btnLogin) {
            if (user.equals("admin") && pass.equals("1234")) {
                lblMsg.setText("✅ Login Successful!");
                lblMsg.setForeground(Color.GREEN);

                // Open Welcome Page after successful login
                new WelcomePage(user);

                // Close current login page
                dispose();
            } else {
                lblMsg.setText("❌ Invalid Username or Password!");
                lblMsg.setForeground(Color.RED);
            }
        } else if (e.getSource() == btnClear) {
            txtUser.setText("");
            txtPass.setText("");
            lblMsg.setText(" ");
        }
    }

    public static void main(String[] args) {
        new LoginPageAWT();
    }
}

// ✅ Welcome Page Class
class WelcomePage extends Frame {
    Label lblWelcome;
    Button btnLogout;

    public WelcomePage(String username) {
        setTitle("Welcome Page");

        lblWelcome = new Label("Welcome, " + username + "!");
        lblWelcome.setAlignment(Label.CENTER);

        btnLogout = new Button("Logout");

        // Use BorderLayout to arrange label and button
        setLayout(new BorderLayout(10, 10));
        add(lblWelcome, BorderLayout.CENTER);
        add(btnLogout, BorderLayout.SOUTH);

        // Action for Logout Button
        btnLogout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close welcome page
                new LoginPageAWT(); // Open login page again
            }
        });

        // Close window event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        // Frame size and position
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
