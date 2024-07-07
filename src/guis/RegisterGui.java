package guis;

import Account.Account;
import Contents.CommonContents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterGui extends JFrame{

    public static RegisterGui registerGui = new RegisterGui();
    public static Account account;

    public RegisterGui(){
        super(CommonContents.APP_NAME);
        setSize(CommonContents.FRAME_SIZE[0], CommonContents.FRAME_SIZE[1]);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addGuiComponents();
    }



    public void addGuiComponents() {


        SpringLayout springLayout = new SpringLayout();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(springLayout);

        // Gmail
        JLabel gmailLabel = new JLabel("Gmail: ");
        gmailLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
        JTextField gmailField = new JTextField(CommonContents.FIELD_SIZE);
        gmailField.setFont(new Font("Dialog", Font.PLAIN, 18));

        springLayout.putConstraint(SpringLayout.WEST, gmailLabel, 35, SpringLayout.WEST, jPanel);
        springLayout.putConstraint(SpringLayout.NORTH, gmailLabel, 35, SpringLayout.NORTH, jPanel);
        springLayout.putConstraint(SpringLayout.WEST, gmailField, 135, SpringLayout.WEST, jPanel);
        springLayout.putConstraint(SpringLayout.NORTH, gmailField, 35, SpringLayout.NORTH, jPanel);

        jPanel.add(gmailLabel);
        jPanel.add(gmailField);


        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN,20));

        JTextField usernameField = new JTextField(CommonContents.FIELD_SIZE);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 18));

        springLayout.putConstraint(SpringLayout.WEST, usernameLabel, 35, SpringLayout.WEST, jPanel);
        springLayout.putConstraint(SpringLayout.NORTH, usernameLabel, 85, SpringLayout.NORTH, jPanel);

        springLayout.putConstraint(SpringLayout.WEST, usernameField,135, SpringLayout.WEST, jPanel);
        springLayout.putConstraint(SpringLayout.NORTH, usernameField, 85, SpringLayout.NORTH, jPanel);

        jPanel.add(usernameLabel);
        jPanel.add(usernameField);


        //password

        JLabel passwordLabel = new JLabel("Password: ");
        JPasswordField passwordField = new JPasswordField(CommonContents.FIELD_SIZE);

        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 18));

        springLayout.putConstraint(SpringLayout.WEST, passwordLabel, 35, SpringLayout.WEST, jPanel);
        springLayout.putConstraint(SpringLayout.WEST, passwordField, 135 , SpringLayout.WEST, jPanel);
        springLayout.putConstraint(SpringLayout.NORTH, passwordLabel, 135, SpringLayout.NORTH, jPanel);
        springLayout.putConstraint(SpringLayout.NORTH, passwordField, 135, SpringLayout.NORTH, jPanel);

        jPanel.add(passwordLabel);
        jPanel.add(passwordField);

        JButton loginButton = new JButton("REGISTER");
        loginButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        springLayout.putConstraint(SpringLayout.WEST, loginButton, 150, SpringLayout.WEST, jPanel);
        springLayout.putConstraint(SpringLayout.NORTH, loginButton, 250, SpringLayout.NORTH, jPanel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginGui loginGui = new LoginGui();
                account= new Account(gmailField.getText(), usernameField.getText(), passwordField.getText());
                registerGui.setVisible(false);
                loginGui.setVisible(true);

            }
        });

        jPanel.add(loginButton);



        this.getContentPane().add(jPanel);
    }
}
