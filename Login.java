package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JTextField username, password;
    JButton login, cancel, clear;
    Login()
    {
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        JLabel user = new JLabel("Username");
        user.setBounds(40, 20,100,30);
        add(user);
        
         username = new JTextField();
        username.setBounds(150,20,150,30);
        add(username);
        
        JLabel pass = new JLabel("Password");
        pass.setBounds(40, 70,100,30);
        add(pass);
        
         password = new JTextField();
        password.setBounds(150,70,150,30);
        add(password);
        
         login = new JButton("Login");
        login.setBounds(40, 150, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
         cancel = new JButton("Cancel");
        cancel.setBounds(180,150,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
         clear = new JButton("Clear");
        clear.setBounds(180,200,120,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login new.png"));
        Image i2= i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 200, 200);
        add(image);
        
        
        
        
        
        
        setBounds(500,200,600,300);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae)//actionevent check which button has been clicked by user
    {
        if(ae.getSource()==login)
        {
            String user = username.getText();
            String pass = password.getText();
            try{
                Conn c = new Conn();
                String query = ("select * from login where username = '" + user + "' and password = '"+ pass +"'");
                ResultSet rs=c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                   
                    new Dashboard().setVisible(true);
                     
                          
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid username or Password");
                    setVisible(false);
                }
            }
            catch(Exception e){
                e.printStackTrace();
                
            }
        }
        else if(ae.getSource()==cancel)
        {
            setVisible(false);
        }
        else if(ae.getSource()== clear)
        {
            setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new Login();
    }
            
    
}
