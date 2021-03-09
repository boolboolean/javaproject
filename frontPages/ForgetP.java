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

public class ForgetP extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField cpasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgetP frame = new ForgetP();
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
	public ForgetP() {
	    getContentPane().setBackground(Color.DARK_GRAY);
		setBackground(Color.DARK_GRAY);
		setBounds(0, 0, 1368, 689);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 1352, 86);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblKesarMedicalStore = new JLabel("AITU MEDICAL STORE");
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
		panel_1.setBounds(0, 97, 1352, 553);
		getContentPane().add(panel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(166, 51, 295, 410);
		ImageIcon i6=new ImageIcon("M:\\My Projects\\Medical Management System\\Medical Store\\image\\doc1.png");
		Image image6=i6.getImage();
		Image imgScale6=image6.getScaledInstance(label_1.getWidth(),label_1.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledIcon6=new ImageIcon(imgScale6);
		panel_1.setLayout(null);
		label_1.setIcon(scaledIcon6);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(1010, 65, 281, 396);
		ImageIcon i2=new ImageIcon("M:\\My Projects\\Medical Management System\\Medical Store\\image\\doc.png");
		Image image2=i2.getImage();
		Image imgScale2=image2.getScaledInstance(label_2.getWidth(),label_2.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledIcon2=new ImageIcon(imgScale2);
		label_2.setIcon(scaledIcon2);
		panel_1.add(label_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(521, 62, 368, 2);
		panel_1.add(separator);
		
		JLabel lblForgotPassword = new JLabel("Forgot Password");
		lblForgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPassword.setFont(new Font("Britannic Bold", Font.BOLD, 40));
		lblForgotPassword.setBackground(Color.GRAY);
		lblForgotPassword.setBounds(517, 21, 373, 43);
		panel_1.add(lblForgotPassword);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
		lblUsername.setBounds(506, 81, 140, 54);
		panel_1.add(lblUsername);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(645, 98, 124, 26);
		panel_1.add(textField);
		
		JLabel lblPassword = new JLabel("Password  :");
		lblPassword.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
		lblPassword.setBounds(506, 132, 140, 54);
		panel_1.add(lblPassword);
		
		JLabel lblConfirmPass = new JLabel("Confirm pass  :");
		lblConfirmPass.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
		lblConfirmPass.setBounds(482, 184, 154, 54);
		panel_1.add(lblConfirmPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(645, 149, 124, 26);
		panel_1.add(passwordField);
		
		cpasswordField = new JPasswordField();
		cpasswordField.setBounds(645, 201, 124, 26);
		panel_1.add(cpasswordField);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(623, 470, 46, 29);
		panel_1.add(label_4);
		
		
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(471, 310, 453, 2);
		panel_1.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBackground(Color.BLACK);
		separator_2_1.setBounds(471, 355, 453, 2);
		panel_1.add(separator_2_1);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1_1.setBackground(Color.BLACK);
		separator_2_1_1.setBounds(682, 313, 2, 43);
		panel_1.add(separator_2_1_1);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							LoginP l = new LoginP();
							l.setVisible(true);
							dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		lblLogin.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblLogin.setBackground(Color.RED);
		lblLogin.setBounds(618, 323, 68, 19);
		panel_1.add(lblLogin);
		
		JLabel lblAlreadyUser = new JLabel("Already User?");
		lblAlreadyUser.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblAlreadyUser.setBackground(Color.BLACK);
		lblAlreadyUser.setBounds(521, 325, 100, 14);
		panel_1.add(lblAlreadyUser);
		
		JLabel lblNewUser = new JLabel("new user?");
		lblNewUser.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewUser.setBackground(Color.BLACK);
		lblNewUser.setBounds(707, 327, 85, 14);
		panel_1.add(lblNewUser);
		
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RegisterP r = new RegisterP();
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
		lblSignUp.setBounds(783, 325, 68, 19);
		panel_1.add(lblSignUp);
		
		JLabel h1 = new JLabel("");
		h1.setForeground(Color.RED);
		h1.setBounds(779, 101, 172, 26);
		panel_1.add(h1);
		
		JLabel h2 = new JLabel("");
		h2.setForeground(Color.RED);
		h2.setBounds(779, 152, 172, 26);
		panel_1.add(h2);
		
		JLabel h3 = new JLabel("");
		h3.setForeground(Color.RED);
		h3.setBounds(779, 201, 172, 26);
		panel_1.add(h3);
		
		JButton btnChangePassword = new JButton("change password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String password=passwordField.getText();
				String cpassword=cpasswordField.getText();
				int pasLength=password.length();
				
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
					if(pasLength<6 || pasLength>8)
					{
						h2.setText("Pass length should be in between 6 & 8");
					}
				}
				
				if(cpassword.trim().isEmpty())
				{
					h3.setText("This field is required.");
				}
				
				else if(password.equals(cpassword))
				{
					Signup s=new Signup();
					Login l=new Login();
					boolean status=s.alreadyUser(username);
					
					if(status==true)
					{
                        boolean flag=l.forgetPassword(username, password);
						
						if(flag==true)
						{
							JOptionPane.showMessageDialog(null,"Password changed Successfully...");
						}
						
						else
						{
							JOptionPane.showMessageDialog(null,"Failed to change password..");
						}
					}
					
					else
					{
						JOptionPane.showMessageDialog(null,"You are not registered. Please register...");
					}
					
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"Failed to sign up. Confirm Password doesn't match..");
				}
				
			}
		});
		btnChangePassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnChangePassword.setBackground(new Color(0, 153, 255));
		btnChangePassword.setBounds(591, 253, 132, 29);
		panel_1.add(btnChangePassword);
	}

}
