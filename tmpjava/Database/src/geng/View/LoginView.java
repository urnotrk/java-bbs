package geng.View;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import geng.model.*;
import geng.handle.*;
public class LoginView extends JPanel implements ActionListener {
    Login login;
    JTextField inputName;
    JPasswordField inputPassword;
    JButton buttonLogin;
    boolean loginSuccess;
    LoginView(){
        login = new Login();
        inputName = new JTextField(12);
        inputPassword = new JPasswordField(12);
        buttonLogin = new JButton("登录");
        add(new JLabel("用户名:"));
        add(inputName);
        add(new JLabel("密码:"));
        add(inputPassword);
        add(buttonLogin);
        buttonLogin.addActionListener(this);
    }
    public boolean isLoginSuccess(){
        return loginSuccess;
    }
    public void actionPerformed(ActionEvent e){
        login.setAdmin_login_name(inputName.getText());
        System.out.println(inputName.getText());
        char [] pw = inputPassword.getPassword();
        login.setAdmin_login_pwd(new String(pw));
        System.out.println(new String(pw));
        HandleLogin handleLogin = new HandleLogin();
        login = handleLogin.queryVerify(login);
        //传递？
        loginSuccess = login.getLoginSuccess();
    }
}
