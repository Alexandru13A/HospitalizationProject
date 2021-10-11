package hospital.login;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import hospital.window.HomePage;
import javax.swing.*;


public class Login extends JFrame {
	
    private JLabel adminidField;
    private JButton loginButton;
    private JLabel loginImageLabel;
    private JLabel passwordField;
    private JPasswordField passwordTextField;
    private JTextField userTextField;

  
    public Login() {
        initComponents();
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - this.getWidth()) / 2;
        int iCoordY = (objDimension.height - this.getHeight()) / 2;
        this.setLocation(iCoordX, iCoordY);
     //   this.setIconImage(new ImageIcon(getClass().getResource("./Login.Image/loginiconblack.png")).getImage());
    }

    
    private void initComponents() {

        adminidField = new JLabel();
        userTextField = new JTextField();
        passwordField = new JLabel();
        passwordTextField = new JPasswordField();
        loginButton = new JButton();
        loginImageLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        adminidField.setText("admin id ");

        passwordField.setText("password ");

        loginButton.setText("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        //LOGIN PANEL
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(loginImageLabel)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(adminidField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTextField, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, GroupLayout.Alignment.TRAILING))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(adminidField)
                            .addComponent(userTextField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField))
                        .addGap(18, 18, 18)
                        .addComponent(loginButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginImageLabel)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }

    private void loginButtonActionPerformed(ActionEvent evt) {

        String username = userTextField.getText();
        String password= passwordField.getText();

        try {
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root", "");
			PreparedStatement st = (PreparedStatement) connection.prepareStatement("SELECT Name, password FROM admin where Name=? and password=?");
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();

        }catch (SQLException e) {
        	e.printStackTrace();
        }

        HomePage mainframe = new HomePage();
        mainframe.setDefaultCloseOperation(HomePage.EXIT_ON_CLOSE);
        this.setVisible(false);
        mainframe.setVisible(true);
    }


}
