import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;

public class Login extends JFrame {
    Login(){
        setSize(800, 480);
        setVisible(true);
        setLocation(350,200);
        setTitle("Digital Bank PLC");
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon logo = new ImageIcon(i2);
        JLabel iconLabel = new JLabel(logo);
        iconLabel.setBounds(70,10,100,100);
        add(iconLabel);

    }
}
