/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author acer
 */
public  class  HotelManagementSystem extends JFrame implements ActionListener {
    HotelManagementSystem()
    {
        setSize(1366,565);//frame size
        setLocation(100,100);//location of frame
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons//caba.jpg"));//image
        JLabel image =new JLabel(i1);//use because we cant use image icons without JLabel
        image.setBounds(0,0,1366,565);
        add(image);
        JLabel text = new JLabel("Hotel Management System");
        text.setBounds(20,430,1000,90);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif", Font.PLAIN,50));
        
        
        JButton Next = new JButton("Next");
        Next.setBounds(1150,450,150,50);
        image.add(Next);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.PINK);
        Next.addActionListener(this);
        
        Next.setFont(new Font("serif",Font.PLAIN,24));
        image.add(text);
        setVisible(true);//for visibility of frame
        
        while(true)
        {
           text.setVisible(false);
        
            try {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            text.setVisible(true);
            try {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
            
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
        
            }
        
    public static void main(String[] args) {
        
        new HotelManagementSystem();
           
    }
    
}
