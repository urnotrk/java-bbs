package geng.Cheshi;
import geng.model.*;
import geng.handle.*;
import java.sql.*;
public class Cheshi {
    public static void main(String args[]){
        Register user = new Register();
        user.setAdmin_id("3");
        user.setAdmin_login_name("admin3");
        user.setAdmin_login_pwd("123");
        HandleInsertData handleInsertData = new HandleInsertData();
        handleInsertData.writeRegisterModel(user);
        Login login = new Login();
        login.setAdmin_login_name("admin2");
        login.setAdmin_login_pwd("123");
        HandleLogin handleLogin = new HandleLogin();
        login = handleLogin.queryVerify(login);
        if(login.getLoginSuccess()==true){
            System.out.println("登录成功啦！");
        }
    }
}
