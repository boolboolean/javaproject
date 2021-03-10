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

import books.Books;
import utility.DBUtility;

public class AddM extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField manu;
	private JTextField expiry;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddM frame = new AddM();
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
	public AddM() {
		
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
		
		JLabel lblKesarBook = new JLabel("EBOOKS");
		lblKesarBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblKesarBook.setFont(new Font("Britannic Bold", Font.BOLD, 55));
		lblKesarBook.setBackground(Color.BLACK);
		lblKesarBook.setBounds(27, 11, 1275, 64);
		panel.add(lblKesarBook);
		

			
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.setBounds(0, 97, 1352, 557);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAddMedicine = new JLabel("ADD BOOKS");
		lblAddMedicine.setForeground(new Color(0, 0, 139));
		lblAddMedicine.setFont(new Font("Britannic Bold", Font.BOLD, 30));
		lblAddMedicine.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddMedicine.setBounds(387, 29, 283, 54);
		panel_1.add(lblAddMedicine);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(387, 84, 283, 2);
		panel_1.add(separator);
		
		JLabel lblName = new JLabel("Name:-");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(41, 133, 74, 19);
		panel_1.add(lblName);
		
		name = new JTextField();
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(185, 120, 215, 32);
		panel_1.add(name);
		name.setColumns(10);
		
		JLabel lblCompany = new JLabel("Company:-");
		lblCompany.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCompany.setBounds(41, 186, 119, 19);
		panel_1.add(lblCompany);
		
		JComboBox company = new JComboBox();
		company.setBounds(186, 174, 215, 31);
		
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
		
		JLabel lblManuDate = new JLabel("Manu. Date:-");
		lblManuDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblManuDate.setBounds(41, 237, 134, 19);
		panel_1.add(lblManuDate);
		
		manu = new JTextField();
		manu.setHorizontalAlignment(SwingConstants.CENTER);
		manu.setColumns(10);
		manu.setBounds(185, 224, 215, 32);
		panel_1.add(manu);
		
		expiry = new JTextField();
		expiry.setHorizontalAlignment(SwingConstants.CENTER);
		expiry.setColumns(10);
		expiry.setBounds(755, 224, 161, 32);
		panel_1.add(expiry);
		
		JLabel lblExpiryDate = new JLabel("Expiry Date:-");
		lblExpiryDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblExpiryDate.setBounds(611, 237, 134, 19);
		panel_1.add(lblExpiryDate);
		
		JLabel v1 = new JLabel("*");
		v1.setForeground(new Color(255, 0, 0));
		v1.setBounds(423, 120, 193, 32);
		panel_1.add(v1);
		
		JLabel v2 = new JLabel("*");
		v2.setForeground(new Color(255, 0, 0));
		v2.setBounds(423, 173, 193, 32);
		panel_1.add(v2);
		
		JLabel v3 = new JLabel("*");
		v3.setForeground(new Color(255, 0, 0));
		v3.setBounds(423, 224, 193, 32);
		panel_1.add(v3);
		

		
		JButton btnAddMedicine = new JButton("Add Books");
		btnAddMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mname=name.getText();
				String com=(String)company.getSelectedItem();
				
				if(mname.trim().isEmpty())
				{
					v1.setText("This field is required");
				}
				
				else if(com=="")
				{
					v2.setText("select Company");
				}
				

							
				else
				{
				
				  {
					Books m=new Books();
					boolean status =m.alreadyBooks(mname);
					if(status==false)
					{
						boolean status1=m.addBooks(mname,com );
						if(status1==true)
						{
							JOptionPane.showMessageDialog(null,"Books Successfully Added.");
							name.setText("");
							manu.setText("");
							expiry.setText("");
					
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Failed to Add Books.");
						}
					}
					
					else
					{
						JOptionPane.showMessageDialog(null,"This books is already added.");
					}
				  }
				
				}
				
			}
		});
		btnAddMedicine.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddMedicine.setBounds(373, 419, 316, 32);
		panel_1.add(btnAddMedicine);
		
		JButton btnBack = new JButton(" Back ");
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
		
	
	}

}
