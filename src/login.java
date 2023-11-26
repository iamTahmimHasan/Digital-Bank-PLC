import javax.swing.*;
import java.awt.*;


public class Login extends JFrame {
    Login(){
        setSize(800, 480);
        setVisible(true);
        setLocation(350,200);
        setTitle("Digital Bank PLC");
        setLayout(null);

        ImageIcon appIcon =new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        setIconImage(appIcon.getImage());

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/logobr.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon logo = new ImageIcon(i2);
        JLabel iconLabel = new JLabel(logo);
        iconLabel.setBounds(70,10,100,100);
        add(iconLabel);


        getContentPane().setBackground(new Color(0x00b894));
        JLabel title = new JLabel("Welcome to Digital Bank Network");
        title.setBounds(200,40,500,40);
        title.setFont(new Font("Oswald",Font.BOLD,30));
        add(title);




    }
}
