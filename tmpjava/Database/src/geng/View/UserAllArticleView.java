package geng.View;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import geng.model.*;
import geng.handle.*;
public class UserAllArticleView extends JPanel implements ActionListener{
    Article article1;
    JTextField art_title,art_content;
    JButton buttonDel;
    public UserAllArticleView(){
        article1 = new Article();

        HandleUserArticleData handleUserArticleData = new HandleUserArticleData();
        article1 = handleUserArticleData.queryVerify(article1);


        setLayout(new FlowLayout());// 设置布局流式布局
        JPanel jp = new JPanel(new GridLayout(4, 1));

        JPanel J1 = new JPanel();
        J1.add(new JLabel("文章题目"));
        J1.add(new JLabel(article1.getArt_title()));
        jp.add(J1);

        JPanel J2 = new JPanel();
        J2.add(new JLabel("文章创建时间"));
        J2.add(new JLabel(article1.getArt_cre_time()));
        jp.add(J2);

        JPanel J3 = new JPanel();
        J3.add(new JLabel("文章内容"));
        J3.add(new JLabel(article1.getArt_content()));
        jp.add(J3);

        JPanel J4 = new JPanel();
        buttonDel = new JButton("删除");
        J4.add(buttonDel);
        buttonDel.addActionListener(this);
        jp.add(J4);

        add(jp);
    }
    public void actionPerformed(ActionEvent e){
        HandleDelArticle handleDelArticle = new HandleDelArticle();
        handleDelArticle.delArticleModel(article1);
    }
}
