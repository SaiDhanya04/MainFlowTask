import javax.swing.*;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        titleLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");

        titleLabel.setFont(new java.awt.Font("Arial", 1, 24));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Login Page");

        usernameLabel.setText("Username:");
        usernameField.setToolTipText("Enter Username");

        passwordLabel.setText("Password:");
        passwordField.setToolTipText("Enter Password");

        loginButton.setText("Login");
        loginButton.setToolTipText("Click to Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(passwordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80,_
