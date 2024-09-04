
package hotel.management.system;
import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    Dashboard()
    {
        setBounds(0,0,1550,1000);
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/LLLL.jpg"));
        Image i2=i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);
        
        JLabel text = new JLabel("THE CABANA JALANDHAR WELCOMES YOU");
        text.setBounds(400,80,1000,50);
        text.setFont(new Font("Tahoma", Font.PLAIN,46));
        text.setForeground(Color.WHITE);
        image.add(text);
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0,1550,30);
        image.add(mb);
        
        JMenu hotel = new JMenu("Hotel Management");
        hotel.setForeground(Color.BLACK);
        mb.add(hotel);
        
        JMenuItem reception = new JMenuItem("Reception");
        hotel.add(reception);
        
        JMenu admin = new JMenu("Admin");
        admin.setForeground(Color.BLACK);
        mb.add(admin);
        
        JMenuItem addemployee = new JMenuItem("Add Employee");
        admin.add(addemployee);
        
        JMenuItem addrooms = new JMenuItem("Add Rooms");
        admin.add(addrooms);
        
        JMenuItem adddriver = new JMenuItem("Add Drivers");
        admin.add(adddriver);
        setVisible(true);
    }
    public static void main(String[] args){
        new Dashboard();
        
    }
}
