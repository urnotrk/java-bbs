import geng.View.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ArticleWindow extends JFrame implements ActionListener{
    JButton computerButtonCreate,computerButtonDel;
    UserAllArticleView view1;
    ArticleWindow(){
        setBounds(100, 100, 800, 260);
        view1 = new UserAllArticleView();
        computerButtonCreate = new JButton("发帖");
        computerButtonCreate.addActionListener(this);
        add(view1,BorderLayout.CENTER);
        add(computerButtonCreate,BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==computerButtonCreate){
            CreateArticleWindow createArticleWindow = new CreateArticleWindow();
        }
        
    }
    
}
