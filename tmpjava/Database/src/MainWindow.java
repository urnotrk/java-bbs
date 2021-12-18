import geng.View.RegisterAndLoginView;
import geng.View.UserAllArticleView;
import geng.View.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame implements ActionListener{
    JButton computerButton;
    RegisterAndLoginView view;
    UserAllArticleView view1;
    MainWindow(){
        setBounds(100, 100, 800, 260);
        view = new RegisterAndLoginView();
        computerButton = new JButton("进入");
        computerButton.addActionListener(this);
        add(view,BorderLayout.CENTER);
        add(computerButton,BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(view.isLoginSuccess()==false){
            JOptionPane.showMessageDialog(null, "please login", "login warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, " hhhhhhhhhh", "login success", JOptionPane.WARNING_MESSAGE);
            ArticleWindow articleWindow = new ArticleWindow();
        }
    }
    
    public static void main(String args[]){
        MainWindow window = new MainWindow();
        window.setTitle("论坛");
    }
}
