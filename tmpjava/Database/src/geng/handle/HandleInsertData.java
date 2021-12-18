package geng.handle;
import java.sql.*;
import geng.model.Register;
import javax.swing.JOptionPane;
public class HandleInsertData {
    Connection con;
    PreparedStatement preSql;
    public HandleInsertData(){
        try{ Class.forName("com.mysql.cj.jdbc.Driver");}
        catch(Exception e){}
        String uri = "jdbc:mysql://localhost/bbs? useSSL=true&characterEncoding=utf-8";
        String user = "root";
        String password = "root";
        try{ 
            con = DriverManager.getConnection(uri, user, password);}
        catch(SQLException e){}
    }
    public void writeRegisterModel(Register register){
        String sqlStr = "insert into bbs_admin values(?,?,?)";
        int ok=0;
        try{
            preSql = con.prepareStatement(sqlStr);
            
            preSql.setString(1, register.getAdmin_id());
            preSql.setString(2, register.getAdmin_login_name());
            preSql.setString(3, register.getAdmin_login_pwd());
        
            ok = preSql.executeUpdate();
            con.close();}
        
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "id不能重复", "警告", JOptionPane.WARNING_MESSAGE);
        }
        if(ok!=0){
            JOptionPane.showMessageDialog(null, "注册成功", "恭喜", JOptionPane.WARNING_MESSAGE);
        }
    }
}
