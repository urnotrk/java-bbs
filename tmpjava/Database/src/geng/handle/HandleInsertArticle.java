package geng.handle;
import java.sql.*;
import geng.model.*;
import javax.swing.JOptionPane;
public class HandleInsertArticle {
    Connection con;
    PreparedStatement preSql;
    public HandleInsertArticle(){
        try{ Class.forName("com.mysql.cj.jdbc.Driver");}
        catch(Exception e){}
        String uri = "jdbc:mysql://localhost/bbs? useSSL=true&characterEncoding=utf-8";
        String user = "root";
        String password = "root";
        try{ 
            con = DriverManager.getConnection(uri, user, password);}
        catch(SQLException e){}
    }
    public void writeArticleModel(Article article){
        String sqlStr = "insert into bbs_article values(?,?,?,?,?,?,?,?,?,?,?)";
        int ok=0;
        try{
            preSql = con.prepareStatement(sqlStr);
            
            preSql.setString(1, article.getArt_id());
            preSql.setString(2, article.getArt_user_id());
            preSql.setString(3, article.getArt_title());
            preSql.setString(4, article.getArt_type_id());
            preSql.setString(5, article.getArt_content());
            preSql.setString(6, article.getArt_comment_id());
            preSql.setString(7, article.getArt_cre_time());
            preSql.setInt(8, article.getArt_view());
            preSql.setInt(9, article.getArt_com_num());
            preSql.setInt(10, article.getArt_hot_num());
            preSql.setInt(11, article.getArt_like_num());
        
            ok = preSql.executeUpdate();
            con.close();}
        
        catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "发帖失败", "警告", JOptionPane.WARNING_MESSAGE);
        }
        if(ok!=0){
            JOptionPane.showMessageDialog(null, "发帖成功", "恭喜", JOptionPane.WARNING_MESSAGE);
        }
    }
}
