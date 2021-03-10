package frontPages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import login.Login;
import login.Signup;

public class LoginP extends JFrame {

 private JPanel contentPane;
 private JTextField textField;
 private JPasswordField passwordField;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     LoginP frame = new LoginP();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the frame.
  */
 public LoginP() {
  getContentPane().setBackground(Color.DARK_GRAY);
  setBackground(Color.DARK_GRAY);
  setBounds(0, 0, 1368, 689);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  getContentPane().setLayout(null);
  //
  JPanel panel = new JPanel();
  panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
  panel.setBackground(Color.LIGHT_GRAY);
  panel.setBounds(0, 0, 1352, 86);
  getContentPane().add(panel);
  panel.setLayout(null);
  
  JLabel lblKesarMedicalStore = new JLabel("EBOOKS");
  lblKesarMedicalStore.setHorizontalAlignment(SwingConstants.CENTER);
  lblKesarMedicalStore.setFont(new Font("Britannic Bold", Font.BOLD, 55));
  lblKesarMedicalStore.setBackground(Color.BLACK);
  lblKesarMedicalStore.setBounds(27, 11, 1275, 64);
  panel.add(lblKesarMedicalStore);
  
  JLabel lblNewLabel = new JLabel("");
  lblNewLabel.setBounds(1005, 6, 118, 73);
  ImageIcon i3=new ImageIcon("M:\\My Projects\\Medical Management System\\Medical Store\\image\\plus.png");
  Image image3=i3.getImage();
  Image imgScale3=image3.getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(),Image.SCALE_SMOOTH);
  ImageIcon scaledIcon3=new ImageIcon(imgScale3);
  lblNewLabel.setIcon(scaledIcon3);
  panel.add(lblNewLabel);
  
  JLabel label = new JLabel("");
  label.setBounds(195, 0, 111, 86);
  ImageIcon i=new ImageIcon("M:\\My Projects\\Medical Management System\\Medical Store\\image\\chekgold.png");
  Image image=i.getImage();
  Image imgScale=image.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
  ImageIcon scaledIcon=new ImageIcon(imgScale);
  label.setIcon(scaledIcon);
  panel.add(label);
  
  
  JPanel panel_1 = new JPanel();
  panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
  panel_1.setBounds(0, 93, 830, 557);
  getContentPane().add(panel_1);
  panel_1.setLayout(null);
  
  JLabel label_1 = new JLabel("");
  label_1.setBounds(10, 11, 810, 535);
  ImageIcon i1=new ImageIcon("M:\\My Projects\\Medical Management System\\Medical Store\\image\\checkup.jpeg");
  Image image2=i1.getImage();
  Image imgScale2=image2.getScaledInstance(label_1.getWidth(),label_1.getHeight(),Image.SCALE_SMOOTH);
  ImageIcon scaledIcon2=new ImageIcon(imgScale2);
  label_1.setIcon(scaledIcon2);
  panel_1.add(label_1);
  
  JPanel panel_2 = new JPanel();
  panel_2.setForeground(Color.RED);
  panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
  panel_2.setBounds(840, 97, 512, 557);
  getContentPane().add(panel_2);
  panel_2.setLayout(null);
  
  JPanel panel_3 = new JPanel();
  panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
  panel_3.setBackground(Color.LIGHT_GRAY);
  panel_3.setBounds(10, 11, 492, 66);
  panel_2.add(panel_3);
  panel_3.setLayout(null);
  
  JLabel lblAdminLogin = new JLabel("ADMIN LOGIN");
  lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
  lblAdminLogin.setFont(new Font("Britannic Bold", Font.BOLD, 40));
  lblAdminLogin.setBounds(10, 11, 472, 44);
  panel_3.add(lblAdminLogin);
  
  JLabel label_2 = new JLabel("");
  label_2.setBounds(397, 11, 57, 44);
  ImageIcon i4=new ImageIcon("M:\\My Projects\\Medical Management System\\Medical Store\\image\\admin.png");
  Image image4=i4.getImage();
  Image imgScale4=image4.getScaledInstance(label_2.getWidth(),label_2.getHeight(),Image.SCALE_SMOOTH);
  ImageIcon scaledIcon4=new ImageIcon(imgScale4);
  label_2.setIcon(scaledIcon4);
  panel_3.add(label_2);
  
  JLabel lblUsername = new JLabel("USERNAME :");
  lblUsername.setFont(new Font("Algerian", Font.BOLD, 20));
  lblUsername.setBounds(10, 115, 112, 29);
  panel_2.add(lblUsername);
  
  JLabel lblPassword = new JLabel("PASSWORD :");
  lblPassword.setFont(new Font("Algerian", Font.BOLD, 20));
  lblPassword.setBounds(10, 164, 112, 29);
  panel_2.add(lblPassword);
  
  textField = new JTextField();
  textField.setBounds(171, 115, 154, 25);
  panel_2.add(textField);
  textField.setColumns(10);
  
  JLabel h1 = new JLabel("");
  h1.setForeground(Color.RED);
  h1.setBounds(348, 111, 154, 26);
  panel_2.add(h1);
  
  JLabel h2 = new JLabel("");
  h2.setForeground(Color.RED);
  h2.setBounds(348, 162, 154, 26);
  panel_2.add(h2);
  
  JButton btnLogin = new JButton("Login");
  btnLogin.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    String username=textField.getText();
    String password=passwordField.getText();
    if(username.trim().isEmpty())
    {
     h1.setText("This field is required.");
    }
    if(password.trim().isEmpty())
    {
     h2.setText("This field is required.");
    }
    
    else 
    {
     Login l=new Login();
     Signup s=new Signup();
     boolean status=s.alreadyUser(username);
     if(status==true)
     {
      boolean flag=l.login(username, password);
      
      if(flag == true)
      {
       
       EventQueue.invokeLater(new Runnable() {
        public void run() {
         try {
             MainP m = new MainP();     
          m.setVisible(true);
          dispose();
         } catch (Exception e) {
          e.printStackTrace();
         }
        }
       });
       JOptionPane.showMessageDialog(null, "Logined Successfully as : "+username);
       
       
      }
      
      else
      {
       JOptionPane.showMessageDialog(null, "Incorrect password, Failed to Logined...");
      }
     }
     
     else
     {
      JOptionPane.showMessageDialog(null, "You are not registered");
     }
    }
    
    
    
    
   }
  });
  btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
  btnLogin.setBackground(new Color(0, 153, 255));
  btnLogin.setBounds(220, 220, 105, 29);
  panel_2.add(btnLogin);
  
  passwordField = new JPasswordField();
  passwordField.setBounds(171, 163, 154, 25);
  panel_2.add(passwordField);
  
  JLabel label_4 = new JLabel("");
  label_4.setBounds(164, 220, 46, 29);
  ImageIcon i5=new ImageIcon("M:\\My Projects\\Medical Management System\\Medical Store\\image\\loginlogo.png");
  Image image5=i5.getImage();
  Image imgScale5=image5.getScaledInstance(label_4.getWidth(),label_4.getHeight(),Image.SCALE_SMOOTH);
  ImageIcon scaledIcon5=new ImageIcon(imgScale5);
  label_4.setIcon(scaledIcon5);
  panel_2.add(label_4);
  
  JSeparator separator = new JSeparator();
  separator.setBackground(Color.BLACK);
  separator.setBounds(10, 276, 492, 2);
  panel_2.add(separator);
  
  JSeparator separator_1 = new JSeparator();
  separator_1.setBackground(Color.BLACK);
  separator_1.setBounds(10, 310, 492, 2);
panel_2.add(separator_1);
  
  JLabel lblNewUser = new JLabel("new user?");
  lblNewUser.setFont(new Font("Tahoma", Font.ITALIC, 15));
  lblNewUser.setBackground(Color.BLACK);
  lblNewUser.setBounds(175, 289, 85, 14);
  panel_2.add(lblNewUser);
  
  JLabel lblSignUp = new JLabel("Sign Up");
  lblSignUp.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
    EventQueue.invokeLater(new Runnable() {
     public void run() {
      try {
          RegisterP r= new RegisterP();
       r.setVisible(true);
          dispose();
      } catch (Exception e) {
       e.printStackTrace();
      }
     }
    });
   }
  });
  lblSignUp.setFont(new Font("Arial Black", Font.BOLD, 15));
  lblSignUp.setBackground(Color.RED);
  lblSignUp.setBounds(257, 287, 68, 19);
  panel_2.add(lblSignUp);
  
 } 

}