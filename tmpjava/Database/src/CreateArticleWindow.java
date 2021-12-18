import geng.View.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CreateArticleWindow extends JFrame implements ActionListener{
    JButton computerButton;
    CreateArticleView view1;
    CreateArticleWindow(){
        setBounds(100, 100, 800, 260);
        view1 = new CreateArticleView();
        add(view1,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        // if(view.isLoginSuccess()==false){
        //     JOptionPane.showMessageDialog(null, "please login", "login warning", JOptionPane.WARNING_MESSAGE);
        // }
        // else{
        //     JOptionPane.showMessageDialog(null, " hhhhhhhhhh", "login success", JOptionPane.WARNING_MESSAGE);
        //     view1 = new UserAllArticleView();
        //     add(view1,BorderLayout.CENTER);
        //     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //     setVisible(true);
        // }
    }
    
    // public static void main(String args[]){
    //     MainWindow window = new MainWindow();
    //     window.setTitle("论坛");
    // }
}
