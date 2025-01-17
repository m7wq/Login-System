package guis;

import Account.Account;
import Contents.CommonContents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGui extends JFrame {

    public LoginGui(){
        super(CommonContents.APP_NAME);
        setSize(CommonContents.FRAME_SIZE[0], CommonContents.FRAME_SIZE[1]);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addGuiComponents();
    }

    public void addGuiComponents(){
        SpringLayout springLayout = new SpringLayout()  ;
        JPanel jPanel = new JPanel();
        jPanel.setLayout(springLayout);

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

        JButton loginButton = new JButton("LOGIN");
        loginButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        springLayout.putConstraint(SpringLayout.WEST, loginButton, 150, SpringLayout.WEST, jPanel);
        springLayout.putConstraint(SpringLayout.NORTH, loginButton, 250, SpringLayout.NORTH, jPanel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Account acc = RegisterGui.account;
                if (!usernameField.getText().equalsIgnoreCase(acc.getUser())){
                    System.out.println("WRONG USERNAME");
                    return;
                }

                if (!passwordField.getText().equalsIgnoreCase(acc.getPassword())){
                    System.out.println("WRONG PASSWORD");
                    return;
                }


                System.out.println("SUCCESSFULLY LOGGED IN!");
            }
        });

        jPanel.add(loginButton);



        this.getContentPane().add(jPanel);
    }

}
