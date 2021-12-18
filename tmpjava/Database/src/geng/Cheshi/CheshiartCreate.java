package geng.Cheshi;
import geng.model.*;
import geng.handle.*;
import java.sql.*;
import java.text.SimpleDateFormat;
public class CheshiartCreate {

    public static void main(String args[]){
        Article article = new Article();
        article.setArt_type_id("1");
        article.setArt_id("4");
        article.setArt_com_num(0);
        article.setArt_comment_id("2");
        article.setArt_hot_num(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        article.setArt_cre_time(df.format(System.currentTimeMillis()));
        article.setArt_like_num(0);
        article.setArt_view(0);
        article.setArt_user_id("1");
        article.setArt_title("数据库系统");
        article.setArt_content("数据库系统内容");
        // char [] pw = inputPassword.getPassword();
        // article.setAdmin_login_pwd(new String(pw));
        HandleInsertArticle handleInsertArticle = new HandleInsertArticle();
        handleInsertArticle.writeArticleModel(article);
        System.out.println(article.getArt_title());
        // Login login = new Login();
        // login.setAdmin_login_name("admin2");
        // login.setAdmin_login_pwd("123");
        // HandleLogin handleLogin = new HandleLogin();
        // login = handleLogin.queryVerify(login);
        // if(login.getLoginSuccess()==true){
        //     System.out.println("登录成功啦！");
        // }
    }
}
