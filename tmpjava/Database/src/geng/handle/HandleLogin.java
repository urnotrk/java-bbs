package geng.handle;
import geng.model.Login;
import java.sql.*;
import javax.swing.JOptionPane;
public class HandleLogin {
    Connection con;
    PreparedStatement preSql;
    ResultSet rs;
    public HandleLogin(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){}
        String uri = "jdbc:mysql://localhost/bbs? useSSL=true&characterEncoding=utf-8";
        String user = "root";
        String password = "root";
        try{ con = DriverManager.getConnection(uri, user, password);}
        catch(SQLException e){}
    }
    public Login queryVerify(Login loginmodel){
        String name = loginmodel.getAdmin_login_name();
        String pw = loginmodel.getAdmin_login_pwd();
        String sqlStr = "select admin_login_name,admin_login_pwd from bbs_admin where "+" admin_login_name = ? and admin_login_pwd = ?";
        try{
            preSql = con.prepareStatement(sqlStr);
            preSql.setString(1, name);
            preSql.setString(2, pw);
            rs = preSql.executeQuery();
            if(rs.next()==true){
                loginmodel.setLoginSuccess(true);
                JOptionPane.showMessageDialog(null, "登录成功", "恭喜", JOptionPane.WARNING_MESSAGE);
            }
            else{
                loginmodel.setLoginSuccess(false);
                JOptionPane.showMessageDialog(null, "登录失败", "登录失败，重新登录", JOptionPane.WARNING_MESSAGE);
            }
            con.close();
        }
        catch(SQLException e){}
        return loginmodel;
    }
}

