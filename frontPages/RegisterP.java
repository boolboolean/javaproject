package frontPages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import login.Signup;



public class RegisterP extends JFrame {

	private JPanel contentPane;
	private JTextField ftext;
	private JTextField ltext;
	private JTextField utext;
	private JTextField mtext;
	private JPasswordField ptext;
	private JPasswordField ctext;
	private final JPanel panel1 = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterP frame = new RegisterP();
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
	public RegisterP() {
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
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel1.setBounds(0, 96, 1352, 554);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
		lblFirstName.setBounds(440, 51, 140, 54);
		panel1.add(lblFirstName);
		
		ftext = new JTextField();
		ftext.setBounds(624, 65, 184, 26);
		panel1.add(ftext);
		ftext.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
		lblLastName.setBounds(440, 102, 140, 54);
		panel1.add(lblLastName);
		
		ltext = new JTextField();
		ltext.setColumns(10);
		ltext.setBounds(624, 116, 184, 26);
		panel1.add(ltext);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
		lblUsername.setBounds(440, 151, 140, 54);
		panel1.add(lblUsername);
		
		utext = new JTextField();
		utext.setColumns(10);
		utext.setBounds(624, 165, 184, 26);
		panel1.add(utext);
		
		JLabel lblMobileNo = new JLabel("Mobile No. :");
		lblMobileNo.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
		lblMobileNo.setBounds(440, 202, 140, 54);
		panel1.add(lblMobileNo);
		
		JLabel h1 = new JLabel("");
		h1.setForeground(Color.RED);
		h1.setBounds(831, 65, 204, 26);
		panel1.add(h1);
		
		JLabel h2 = new JLabel("");
		h2.setForeground(Color.RED);
		h2.setBounds(831, 116, 204, 26);
		panel1.add(h2);
		
		JLabel h3 = new JLabel("");
		h3.setForeground(Color.RED);
		h3.setBounds(831, 165, 204, 26);
		panel1.add(h3);
		
		JLabel h4 = new JLabel("");
		h4.setForeground(Color.RED);
		h4.setBounds(831, 216, 204, 26);
		panel1.add(h4);
		
		JLabel h5 = new JLabel("");
		h5.setForeground(Color.RED);
		h5.setBounds(831, 263, 191, 26);
		panel1.add(h5);
		
		JLabel h6 = new JLabel("");
		h6.setForeground(Color.RED);
		h6.setBounds(818, 371, 225, 26);
		panel1.add(h6);
		
		JLabel h7 = new JLabel("");
		h7.setForeground(Color.RED);
		h7.setBounds(831, 421, 204, 26);
		panel1.add(h7);
		
		mtext = new JTextField();
		
		mtext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String mobile=mtext.getText();
				char c=e.getKeyChar();
				if(Character.isLetter(c))
				{ 
					h4.setText("Enter only 10 digit number.");
					mtext.setEditable(false);
				}
				else
				{
					mtext.setEditable(true);
				}
			}
		});
		
		mtext.setColumns(10);
		mtext.setBounds(624, 216, 184, 26);
		panel1.add(mtext);
		
		JLabel lblAddress = new JLabel("Address     :");
		lblAddress.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
		lblAddress.setBounds(440, 252, 140, 54);
		panel1.add(lblAddress);
		
		JTextArea atext = new JTextArea();
		atext.setFont(new Font("Tahoma", Font.PLAIN, 13));
		atext.setBounds(624, 259, 184, 83);
		panel1.add(atext);
		
		JLabel lblPassword = new JLabel("Password  :");
		lblPassword.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
		lblPassword.setBounds(440, 354, 140, 54);
		panel1.add(lblPassword);
		
		ptext = new JPasswordField();
		ptext.setBounds(624, 362, 184, 33);
		panel1.add(ptext);
		
		JLabel lblConfirmPass = new JLabel("Confirm pass  :");
		lblConfirmPass.setFont(new Font("Bodoni MT Black", Font.BOLD, 20));
		lblConfirmPass.setBounds(440, 406, 154, 54);
		panel1.add(lblConfirmPass);
		
		ctext = new JPasswordField();
		ctext.setBounds(624, 414, 184, 33);
		panel1.add(ctext);
		
		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setFont(new Font("Britannic Bold", Font.BOLD, 40));
		lblRegister.setBackground(Color.GRAY);
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setBounds(436, 11, 373, 43);
		panel1.add(lblRegister);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(440, 52, 368, 2);
		panel1.add(separator);
		
		
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName=ftext.getText();
				String lastName=ltext.getText();
				String username=utext.getText();
				String mobile=mtext.getText();
				String address=atext.getText();
				String password=ptext.getText();
				String cpassword=ctext.getText();
				
				int pasLength=password.length();
				int mobLength=mobile.length();
				
				if(firstName.trim().isEmpty())
				{
					h1.setText("This field is required.");
				}
				
				else if(lastName.trim().isEmpty())
				{
					h2.setText("This field is required.");
				}
				
				else if(username.trim().isEmpty())
				{
					h3.setText("This field is required.");
				}
				
				else if(mobile.trim().isEmpty())
				{
					h4.setText("This field is required.");
				}
				
				else  if(mobLength<10)
				{
					h4.setText("Invalid number,Pls enter 10 digit No."); 
				}
				
				else  if(mobLength>10)
				   {
					h4.setText("Number should not Exceed 10");
				   }
				
				   else if(address.trim().isEmpty())
				{
					h5.setText("This field is required.");
				}
				
				   else if(password.trim().isEmpty())
				{
					h6.setText("This field is required.");
					
				}
				
				else  if(mobLength<10)
				{
					
					
						h6.setText("Pass length should be in between 6 & 8");
					
				}
				
				
				
				else if(cpassword.trim().isEmpty())
				{
					h7.setText("This field is required.");
				}
				
				
				
				else if(password.equals(cpassword) && mobLength==10)
				{
					
					Signup signup=new Signup();
					boolean status=signup.alreadyUser(username);
					
					if(status==true)
					{
						JOptionPane.showMessageDialog(null,"You are already User.");
					}
					
					else
					{
						boolean flag=signup.signup(firstName, lastName, username, mobile, address, password);
						
						if(flag==true)
						{
							JOptionPane.showMessageDialog(null,"Successfully signed up... as "+username);
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
						
						else
						{
							JOptionPane.showMessageDialog(null,"Failed to sign up...");
						}
					}
					
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"Please enter correct detail :)");
				}
				
				
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegister.setBackground(new Color(0, 153, 255));
		btnRegister.setBounds(690, 458, 105, 29);
		panel1.add(btnRegister);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(634, 458, 46, 29);
		ImageIcon i5=new ImageIcon("M:\\My Projects\\Medical Management System\\Medical Store\\image\\loginlogo.png");
		Image image5=i5.getImage();
		Image imgScale5=image5.getScaledInstance(label_4.getWidth(),label_4.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledIcon5=new ImageIcon(imgScale5);
		label_4.setIcon(scaledIcon5);
		panel1.add(label_4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(428, 538, 380, 5);
		panel1.add(separator_1);
		
		JLabel lblAlreadyUser = new JLabel("Already User?");
		lblAlreadyUser.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblAlreadyUser.setBackground(Color.BLACK);
		lblAlreadyUser.setBounds(526, 513, 100, 14);
		panel1.add(lblAlreadyUser);
		
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
		lblLogin.setBounds(623, 511, 68, 19);
		panel1.add(lblLogin);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(430, 500, 378, 2);
		panel1.add(separator_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(92, 51, 295, 410);
		ImageIcon i6=new ImageIcon("M:\\My Projects\\Medical Management System\\Medical Store\\image\\doc1.png");
		Image image6=i6.getImage();
		Image imgScale6=image6.getScaledInstance(label_1.getWidth(),label_1.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledIcon6=new ImageIcon(imgScale6);
		label_1.setIcon(scaledIcon6);
		panel1.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(1045, 51, 281, 396);
		ImageIcon i2=new ImageIcon("M:\\My Projects\\Medical Management System\\Medical Store\\image\\doc.png");
		Image image2=i2.getImage();
		Image imgScale2=image2.getScaledInstance(label_2.getWidth(),label_2.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledIcon2=new ImageIcon(imgScale2);
		label_2.setIcon(scaledIcon2);
		panel1.add(label_2);
		
		JLabel lblForgetPassword = new JLabel("forget password");
		lblForgetPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ForgetP f = new ForgetP();
							f.setVisible(true);
							dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		lblForgetPassword.setForeground(Color.RED);
		lblForgetPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblForgetPassword.setBounds(461, 459, 119, 25);
		panel1.add(lblForgetPassword);
		
		
	}

}
