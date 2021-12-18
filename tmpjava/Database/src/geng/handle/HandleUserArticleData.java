package geng.handle;
import geng.model.Article;
import java.sql.*;
import javax.swing.JOptionPane;
public class HandleUserArticleData {
    Connection con;
    Statement preSql;
    ResultSet rs;
    public HandleUserArticleData(){
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
    public Article queryVerify(Article articlemodel){
        String sqlStr = "select art_id,art_type_id,art_title,art_content," 
            +"art_comment_id,art_cre_time,art_view,art_com_num,art_hot_num,art_like_num from bbs_article where "
            +" art_user_id = 1 ";
        try{
            preSql = con.createStatement();
            // preSql.setString(1, "5");
            boolean ret = preSql.execute(sqlStr);
            if(ret){
                rs = preSql.getResultSet();
                while(rs.next()){
                    articlemodel.setArt_id(rs.getString("art_id"));
                    articlemodel.setArt_type_id(rs.getString("art_type_id"));
                    articlemodel.setArt_title(rs.getString("art_title"));
                    articlemodel.setArt_content(rs.getString("art_content"));
                    articlemodel.setArt_comment_id(rs.getString("art_comment_id"));
                    articlemodel.setArt_cre_time(rs.getString("art_cre_time"));
                    articlemodel.setArt_view(rs.getInt("art_view"));
                    articlemodel.setArt_com_num(rs.getInt("art_com_num"));
                    articlemodel.setArt_hot_num(rs.getInt("art_hot_num"));
                    articlemodel.setArt_like_num(rs.getInt("art_like_num"));
                    JOptionPane.showMessageDialog(null, "登录1", "恭喜", JOptionPane.WARNING_MESSAGE);
                    }
                }
            else{
                // articlemodel.setLoginSuccess(false);
                JOptionPane.showMessageDialog(null, "登录失败", "登录失败，重新登录", JOptionPane.WARNING_MESSAGE);
            }
            
            con.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return articlemodel;
    }
}

