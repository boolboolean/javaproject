package frontPages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;
import utility.DBUtility;

public class TotalC extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TotalC frame = new TotalC();
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
	public TotalC() {
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
		panel_1.setBounds(10, 104, 1352, 557);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(283, 147, 1021, 380);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblTotalMedicine = new JLabel("TOTAL COMPANIES");
		lblTotalMedicine.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalMedicine.setForeground(new Color(0, 0, 139));
		lblTotalMedicine.setFont(new Font("Britannic Bold", Font.BOLD, 30));
		lblTotalMedicine.setBounds(532, 59, 283, 54);
		panel_1.add(lblTotalMedicine);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(532, 114, 283, 2);
		panel_1.add(separator_1);
		
		Connection con=DBUtility.connection();
		String query="select * from company";
		try {
			PreparedStatement stmt=con.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			
				table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			JSeparator separator = new JSeparator();
			separator.setOrientation(SwingConstants.VERTICAL);
			separator.setBounds(244, 147, 5, 380);
			panel_1.add(separator);
			
			JButton btnAddCompany = new JButton("ADD COMPANY");
			btnAddCompany.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
					    AddC a = new AddC();
						a.setVisible(true);
						dispose();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			btnAddCompany.setBounds(48, 186, 152, 37);
			panel_1.add(btnAddCompany);
			
			JButton btnUpdateCompany = new JButton("UPDATE COMPANY");
			btnUpdateCompany.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					    UpdateC u = new UpdateC();
						u.setVisible(true);
						dispose();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			btnUpdateCompany.setBounds(48, 269, 152, 37);
			panel_1.add(btnUpdateCompany);
			
			JButton btnDeleteCompany = new JButton("DELETE COMPANY");
			btnDeleteCompany.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					    DeleteC d= new DeleteC();
						d.setVisible(true);
						dispose();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
				}
				
			});
			btnDeleteCompany.setBounds(48, 362, 152, 37);
			panel_1.add(btnDeleteCompany);
			
			JButton btnMainPage = new JButton("MAIN PAGE");
			btnMainPage.addActionListener(new ActionListener() {
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
			btnMainPage.setBounds(48, 468, 152, 37);
			panel_1.add(btnMainPage);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
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
	}

}
