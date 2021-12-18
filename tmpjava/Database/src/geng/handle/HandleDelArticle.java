package geng.handle;
import java.sql.*;
import geng.model.*;
import javax.swing.JOptionPane;
public class HandleDelArticle {
    Connection con;
    PreparedStatement preSql;
    public HandleDelArticle(){
        try{ Class.forName("com.mysql.cj.jdbc.Driver");}
        catch(Exception e){}
        String uri = "jdbc:mysql://localhost/bbs? useSSL=true&characterEncoding=utf-8";
        String user = "root";
        String password = "root";
        try{ 
            con = DriverManager.getConnection(uri, user, password);}
        catch(SQLException e){}
    }
    public void delArticleModel(Article article){
        String sqlStr = "delete from bbs_article where art_id = ?";
        int ok=0;
        try{
            preSql = con.prepareStatement(sqlStr);
            
            preSql.setString(1, "5");
            ok = preSql.executeUpdate();
            con.close();}
        
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "删帖失败", "警告", JOptionPane.WARNING_MESSAGE);
        }
        if(ok!=0){
            JOptionPane.showMessageDialog(null, "删帖成功", "恭喜", JOptionPane.WARNING_MESSAGE);
        }
    }
}
