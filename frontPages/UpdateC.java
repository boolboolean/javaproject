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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medicine.Company;

public class UpdateC extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField mobile;
	private JTextField email;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateC frame = new UpdateC();
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
	public UpdateC() {
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
		panel_1.setBounds(0, 97, 1352, 557);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAddMedicine = new JLabel("UPDATE COMPANY");
		lblAddMedicine.setForeground(new Color(0, 0, 139));
		lblAddMedicine.setFont(new Font("Britannic Bold", Font.BOLD, 30));
		lblAddMedicine.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddMedicine.setBounds(144, 23, 283, 54);
		panel_1.add(lblAddMedicine);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(144, 75, 283, 2);
		panel_1.add(separator);
		
		JLabel lblName = new JLabel("Name:-");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(90, 134, 74, 19);
		panel_1.add(lblName);
		
		name = new JTextField();
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(212, 121, 215, 32);
		panel_1.add(name);
		name.setColumns(10);
		
		
		
		JLabel lblManuDate = new JLabel("Mobile No.:-");
		lblManuDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblManuDate.setBounds(68, 188, 134, 19);
		panel_1.add(lblManuDate);
		
		JLabel v1 = new JLabel("*");
		v1.setForeground(new Color(255, 0, 0));
		v1.setBounds(437, 121, 154, 32);
		panel_1.add(v1);
		
		JLabel v2 = new JLabel("*");
		v2.setForeground(new Color(255, 0, 0));
		v2.setBounds(437, 175, 154, 32);
		panel_1.add(v2);
		
		JLabel v3 = new JLabel("*");
		v3.setForeground(new Color(255, 0, 0));
		v3.setBounds(437, 228, 154, 32);
		panel_1.add(v3);
		
		JLabel v4 = new JLabel("*");
		v4.setForeground(new Color(255, 0, 0));
		v4.setBounds(437, 281, 154, 32);
		panel_1.add(v4);
		
		mobile = new JTextField();
		mobile.setHorizontalAlignment(SwingConstants.CENTER);
		mobile.setColumns(10);
		mobile.setBounds(212, 175, 215, 32);
		mobile.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String mobile1=mobile.getText();
				char c=e.getKeyChar();
				if(Character.isLetter(c))
				{ 
					v2.setText("Enter only 10 digit number.");
					mobile.setEditable(false);
				}
				else
				{
					mobile.setEditable(true);
				}
			}
		});
		panel_1.add(mobile);
		
		email = new JTextField();
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setColumns(10);
		email.setBounds(212, 228, 215, 32);
		panel_1.add(email);
		
		JLabel lblRate = new JLabel("Email:-");
		lblRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblRate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRate.setBounds(68, 241, 134, 19);
		panel_1.add(lblRate);
		
		JLabel lblGst = new JLabel("Address:-");
		lblGst.setHorizontalAlignment(SwingConstants.CENTER);
		lblGst.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGst.setBounds(68, 294, 134, 19);
		panel_1.add(lblGst);
		
		
		
		JTextArea address = new JTextArea();
		address.setFont(new Font("Tahoma", Font.PLAIN, 13));
		address.setBounds(212, 285, 215, 83);
		panel_1.add(address);
		
		JButton btnAddCompany = new JButton("Update Company");
		btnAddCompany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cname=name.getText();
				String emailid=email.getText();
				String mobileno=mobile.getText();
				String address1=address.getText();
				int m=mobileno.length();
				
				if(cname.trim().isEmpty())
				{
					v1.setText("This field is required");
				}
				
				else if(mobileno.trim().isEmpty())
				{
					v2.setText("This field is required");
				}
				
				else  if(m<10)
				{
					v2.setText("Invalid number,Pls enter 10 digit No.");
				}
				
				else  if(m>10)
				   {
					v2.setText("Number should not Exceed 10");
				   }
				
				else if(emailid.trim().isEmpty())
				{
					v3.setText("This field is required");
				}
				
				else if(address1.trim().isEmpty())
				{
					v4.setText("This field is required");
				}
				
				else
				{
			
					Company c=new Company();
					boolean status =c.alreadyCompany(cname);
					
					if(status==true)
					{
						boolean status1=c.updateCompany(cname, mobileno, emailid, address1);
						if(status1==true)
						{
							JOptionPane.showMessageDialog(null,"Company Successfully Updated.");
							name.setText("");
							email.setText("");
							mobile.setText("");
							address.setText("");
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Failed to Update Company.");
						}
					}
					
					else
					{
						JOptionPane.showMessageDialog(null,"This Company is not added.");
					}
				  
				
				}
				
			}
		});
		btnAddCompany.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddCompany.setBounds(283, 415, 144, 32);
		panel_1.add(btnAddCompany);
		
		JButton btnGetCompany = new JButton("Get Company");
		btnGetCompany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Company c=new Company();
				String mname=name.getText();
				
				if(mname.trim().isEmpty())
				{
					v1.setText("This field is required");
				}
				
				else
				{
				boolean flag=c.alreadyCompany(mname);
				if(flag==true)
				{
					c=c.getCompany(mname);
					mobile.setText(c.getMobile());
					email.setText(c.getEmail());
					address.setText(c.getAddress());
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"This Company is not there.");
				}
				}
				
			}
		});
		btnGetCompany.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGetCompany.setBounds(107, 415, 148, 32);
		panel_1.add(btnGetCompany);
		
		JButton btnBack = new JButton(" Back <----");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 TotalC t = new TotalC();
					    t.setVisible(true);
						dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnBack.setBounds(10, 11, 89, 23);
		panel_1.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(711, 113, 590, 332);
		ImageIcon i6=new ImageIcon("M:\\My Projects\\Medical Management System\\Medical Store\\image\\industry.jpg");
		Image image6=i6.getImage();
		Image imgScale6=image6.getScaledInstance(lblNewLabel_1.getWidth(),lblNewLabel_1.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledIcon6=new ImageIcon(imgScale6);
		lblNewLabel_1.setIcon(scaledIcon6);
		panel_1.add(lblNewLabel_1);
	}

}
