package geng.View;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import geng.model.*;
import geng.handle.*;
public class RegisterView extends JPanel implements ActionListener{
    Register register ;
    JTextField inputID,inputName;
    JPasswordField inputPassword;
    JButton buttonRegister;
    RegisterView(){
        register = new Register();

        inputID = new JTextField(12);
        inputName = new JTextField(12);
        inputPassword = new JPasswordField(12);

        buttonRegister = new JButton("注册");
        add(new JLabel("ID:"));
        add(inputID);
        add(new JLabel("姓名:"));
        add(inputName);
        add(new JLabel("密码:"));
        add(inputPassword);

        add(buttonRegister);
        buttonRegister.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        register.setAdmin_id(inputID.getText());
        register.setAdmin_login_name(inputName.getText());
        char [] pw = inputPassword.getPassword();
        register.setAdmin_login_pwd(new String(pw));
        HandleInsertData handleInsertData = new HandleInsertData();
        handleInsertData.writeRegisterModel(register);
    }
}
