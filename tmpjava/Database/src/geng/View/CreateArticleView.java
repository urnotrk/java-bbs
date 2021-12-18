package geng.View;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

import geng.model.*;
import geng.handle.*;
public class CreateArticleView extends JPanel implements ActionListener{
    Article article;
    JTextField inputTitle,inputContent;
    JButton buttonCreate;
    public CreateArticleView(){
        article = new Article();
        inputTitle = new JTextField(12);
        inputContent = new JTextField(12);

        buttonCreate = new JButton("发帖");
        add(new JLabel("题目:"));
        add(inputTitle);
        add(new JLabel("内容:"));
        add(inputContent);

        add(buttonCreate);
        buttonCreate.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        article.setArt_type_id("1");
        article.setArt_id("5");
        article.setArt_com_num(0);
        article.setArt_comment_id("2");
        article.setArt_hot_num(0);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        article.setArt_cre_time(df.format(System.currentTimeMillis()));
        article.setArt_like_num(0);
        article.setArt_view(0);
        article.setArt_user_id("1");
        article.setArt_title(inputTitle.getText());
        article.setArt_content(inputContent.getText());
        HandleInsertArticle handleInsertArticle = new HandleInsertArticle();
        handleInsertArticle.writeArticleModel(article);
    }
}
