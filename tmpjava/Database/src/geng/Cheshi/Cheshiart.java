package geng.Cheshi;
import geng.model.*;
import geng.handle.*;
import java.sql.*;
public class Cheshiart {
    public static void main(String args[]){
        Article article = new Article();
        article.setArt_id("1");
        HandleUserArticleData handleUserArticleData = new HandleUserArticleData();
        article = handleUserArticleData.queryVerify(article);
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
