package frontPages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medicine.Medicine;
import utility.DBUtility;

public class UpdateM extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField quantity;
	private JTextField manu;
	private JTextField expiry;
	private JTextField rate;
	private JTextField mrp;
	private JTextField gst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateM frame = new UpdateM();
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
	public UpdateM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
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
		
		JLabel lblAddMedicine = new JLabel("UPDATE MEDICINE");
		lblAddMedicine.setForeground(new Color(0, 0, 139));
		lblAddMedicine.setFont(new Font("Britannic Bold", Font.BOLD, 30));
		lblAddMedicine.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddMedicine.setBounds(338, 32, 283, 54);
		panel_1.add(lblAddMedicine);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(338, 87, 283, 2);
		panel_1.add(separator);
		
		JLabel lblName = new JLabel("Name:-");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(41, 133, 74, 19);
		panel_1.add(lblName);
		
		name = new JTextField();
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(185, 120, 168, 32);
		panel_1.add(name);
		name.setColumns(10);
		
		JLabel lblCompany = new JLabel("Company:-");
		lblCompany.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCompany.setBounds(41, 186, 119, 19);
		panel_1.add(lblCompany);
		
		JComboBox company = new JComboBox();
		company.setBounds(186, 174, 167, 31);
		Connection con=DBUtility.connection();
		String query="select name from company";
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			company.addItem("");
			while(rs.next())
			{
				company.addItem(rs.getString("name"));
			}
			
			con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		panel_1.add(company);
		
		quantity = new JTextField();
		quantity.setForeground(new Color(0, 0, 0));
		quantity.setHorizontalAlignment(SwingConstants.CENTER);
		quantity.setColumns(10);
		quantity.setBounds(717, 120, 159, 32);
		panel_1.add(quantity);
		
		JLabel lblQuantity = new JLabel("Quantity:-");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQuantity.setBounds(573, 133, 111, 19);
		panel_1.add(lblQuantity);
		
		
		
		JLabel lblManuDate = new JLabel("Manu. Date:-");
		lblManuDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblManuDate.setBounds(41, 237, 134, 19);
		panel_1.add(lblManuDate);
		
		manu = new JTextField();
		manu.setHorizontalAlignment(SwingConstants.CENTER);
		manu.setColumns(10);
		manu.setBounds(185, 224, 168, 32);
		panel_1.add(manu);
		
		expiry = new JTextField();
		expiry.setHorizontalAlignment(SwingConstants.CENTER);
		expiry.setColumns(10);
		expiry.setBounds(717, 224, 159, 32);
		panel_1.add(expiry);
		
		JLabel lblExpiryDate = new JLabel("Expiry Date:-");
		lblExpiryDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblExpiryDate.setBounds(573, 237, 134, 19);
		panel_1.add(lblExpiryDate);
		
		rate = new JTextField();
		rate.setHorizontalAlignment(SwingConstants.CENTER);
		rate.setColumns(10);
		rate.setBounds(185, 277, 168, 32);
		panel_1.add(rate);
		
		JLabel lblRate = new JLabel("Rate:-");
		lblRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblRate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRate.setBounds(41, 290, 134, 19);
		panel_1.add(lblRate);
		
		JLabel lblMrp = new JLabel("MRP.");
		lblMrp.setHorizontalAlignment(SwingConstants.CENTER);
		lblMrp.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMrp.setBounds(573, 290, 134, 19);
		panel_1.add(lblMrp);
		
		mrp = new JTextField();
		mrp.setHorizontalAlignment(SwingConstants.CENTER);
		mrp.setColumns(10);
		mrp.setBounds(717, 277, 159, 32);
		panel_1.add(mrp);
		
		JLabel lblGst = new JLabel("GST (in %):-");
		lblGst.setHorizontalAlignment(SwingConstants.CENTER);
		lblGst.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGst.setBounds(41, 343, 134, 19);
		panel_1.add(lblGst);
		
		gst = new JTextField();
		gst.setHorizontalAlignment(SwingConstants.CENTER);
		gst.setColumns(10);
		gst.setBounds(185, 330, 168, 32);
		panel_1.add(gst);
		
		JLabel lblType = new JLabel("Type:-");
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		lblType.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblType.setBounds(573, 179, 119, 32);
		panel_1.add(lblType);
		
		JComboBox typeM = new JComboBox();
		typeM.setBounds(717, 174, 159, 31);
		typeM.addItem("");
		typeM.addItem("Syrup");
		typeM.addItem("Tablet");
		typeM.addItem("Capsules");
		typeM.addItem("Injection");
		typeM.addItem("Inhaler");
		
		panel_1.add(typeM);
		
		JLabel v1 = new JLabel("*");
		v1.setForeground(new Color(255, 0, 0));
		v1.setBounds(377, 120, 150, 32);
		panel_1.add(v1);
		
		JLabel v2 = new JLabel("*");
		v2.setForeground(new Color(255, 0, 0));
		v2.setBounds(377, 174, 150, 32);
		panel_1.add(v2);
		
		JLabel v3 = new JLabel("*");
		v3.setForeground(new Color(255, 0, 0));
		v3.setBounds(377, 224, 150, 32);
		panel_1.add(v3);
		
		JLabel v4 = new JLabel("*");
		v4.setForeground(new Color(255, 0, 0));
		v4.setBounds(377, 277, 150, 32);
		panel_1.add(v4);
		
		JLabel v5 = new JLabel("*");
		v5.setForeground(new Color(255, 0, 0));
		v5.setBounds(377, 330, 150, 32);
		panel_1.add(v5);
		
		JLabel v6 = new JLabel("*");
		v6.setForeground(new Color(255, 0, 0));
		v6.setBounds(886, 120, 152, 32);
		panel_1.add(v6);
		
		JLabel v7 = new JLabel("*");
		v7.setForeground(new Color(255, 0, 0));
		v7.setBounds(886, 174, 152, 32);
		panel_1.add(v7);
		
		JLabel v8 = new JLabel("*");
		v8.setForeground(new Color(255, 0, 0));
		v8.setBounds(886, 224, 152, 32);
		panel_1.add(v8);
		
		JLabel v9 = new JLabel("*");
		v9.setForeground(new Color(255, 0, 0));
		v9.setBounds(886, 277, 152, 32);
		panel_1.add(v9);
		
		JButton btnAddMedicine = new JButton("Update Medicine");
		btnAddMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mname=name.getText();
				String com=(String)company.getSelectedItem();
				String Gst=gst.getText();
				String Rate=rate.getText();
				String Man=manu.getText();
				String exp=expiry.getText();
				String quan=quantity.getText();
				String type=(String)typeM.getSelectedItem();
				String Mrp=mrp.getText();
				
				if(mname.trim().isEmpty())
				{
					v1.setText("This field is required");
				}
				
				else if(com=="")
				{
					v2.setText("select Company");
				}
				
				else if(Man.trim().isEmpty())
				{
					v3.setText("This field is required");
				}
				
				else if(Rate.trim().isEmpty())
				{
					v4.setText("This field is required");
				}
				
				else if(Gst.trim().isEmpty())
				{
					v5.setText("This field is required");
				}
				
				else if(quan.trim().isEmpty())
				{
					v6.setText("This field is required");
				}
				
				else if(type=="")
				{
					v7.setText("Select Medicine type");
				}
				
				else if(exp.trim().isEmpty())
				{
					v8.setText("This field is required");
				}
				
				else if(Mrp.trim().isEmpty())
				{
					v9.setText("This field is required");
				}
				
				else
				{
				
				  if(type!="" && com!="")
				  {
					    Medicine m=new Medicine();
				
						boolean status1=m.updateMedicine(mname, com, Man, exp, Rate, Mrp, Gst, quan, type);
						
						if(status1==true)
						{
							JOptionPane.showMessageDialog(null,"Medicine Successfully Updated.");
							name.setText("");
							company.setSelectedItem("");
							gst.setText("");
							rate.setText("");
							manu.setText("");
							expiry.setText("");
							quantity.setText("");
							typeM.setSelectedItem("");
							mrp.setText("");
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Failed to Update Medicine.");
						}
					
				  }
				
				}
				
			}
		});
		btnAddMedicine.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddMedicine.setBounds(547, 419, 316, 32);
		panel_1.add(btnAddMedicine);
		
		JButton btnGetMedicine = new JButton("Get Medicine");
		btnGetMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Medicine m=new Medicine();
				String mname=name.getText();
				
				if(mname.trim().isEmpty())
				{
					v1.setText("This field is required");
				}
				
				else
				{
				boolean flag=m.alreadyMedicine(mname);
				if(flag==true)
				{
					m=m.getMedicine(mname);
					company.setSelectedItem(m.getCompany());
					typeM.setSelectedItem(m.getType());
					manu.setText(m.getManu());
					expiry.setText(m.getExpiry());
					quantity.setText(m.getQuantity());
					rate.setText(m.getRate());
					mrp.setText(m.getMrp());
					gst.setText(m.getGst());
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"This medicine is not there.");
				}
				}
				
				
			}
		});
		btnGetMedicine.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGetMedicine.setBounds(121, 419, 316, 32);
		panel_1.add(btnGetMedicine);
		
		JButton btnBack = new JButton(" Back <----");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 MainP m = new MainP();
					    m.setVisible(true);
					    dispose();	
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnBack.setBounds(10, 11, 89, 23);
		panel_1.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(1111, 117, 215, 198);
		ImageIcon i6=new ImageIcon("M:\\My Projects\\Medical Management System\\Medical Store\\image\\mask.jpeg");
		Image image6=i6.getImage();
		Image imgScale6=image6.getScaledInstance(lblNewLabel_1.getWidth(),lblNewLabel_1.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledIcon6=new ImageIcon(imgScale6);
		lblNewLabel_1.setIcon(scaledIcon6);
		panel_1.add(lblNewLabel_1);
	}

}
