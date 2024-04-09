package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Edit extends JFrame {

	private JPanel contentPane;
	private JTextField emailtext;
	private JTextField cname;
	private JTextField cphone;
	private JPasswordField upasstext;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Edit frame = new Edit();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Edit(String email) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 654, 467);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 0, 720, 44);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Inventory Management System");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 30));
		lblNewLabel.setBackground(new Color(255, 0, 102));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.RED);
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(0, 44, 720, 37);
		panel.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Product ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_1);
		
		JLabel CusEmail = new JLabel("Customer Email");
		CusEmail.setForeground(Color.BLACK);
		CusEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CusEmail.setBounds(10, 120, 168, 25);
		panel.add(CusEmail);
		
		JLabel CusName = new JLabel("Name");
		CusName.setForeground(Color.BLACK);
		CusName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CusName.setBounds(10, 243, 85, 25);
		panel.add(CusName);
		
		JLabel CusPhone = new JLabel("Phone");
		CusPhone.setForeground(Color.BLACK);
		CusPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CusPhone.setBounds(10, 304, 104, 25);
		panel.add(CusPhone);
		
		emailtext = new JTextField(email);
		emailtext.setColumns(10);
		emailtext.setBounds(347, 114, 162, 37);
		panel.add(emailtext);
		
		cname = new JTextField();
		cname.setColumns(10);
		cname.setBounds(347, 231, 162, 37);
		panel.add(cname);
		
		cphone = new JTextField();
		cphone.setColumns(10);
		cphone.setBounds(347, 292, 162, 37);
		panel.add(cphone);
		
		JButton update = new JButton("Update");
		update.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) 
			{
				
				Customers c=new Customers();
				c.setCusemail(emailtext.getText());
				c.setCusPassword(upasstext.getText());
				c.setCusName(cname.getText());
				c.setCusPhone(Long.parseLong(cphone.getText()));
				
				CustomerDao edao=new CustomerDao();
				int status=edao.addCustomer(c);
				
				//check status 
				if (status==1)
					{
					JOptionPane.showConfirmDialog(getParent(), "Record Updated Successfully");
					emailtext.setText("");
					upasstext.setText("");
					cname.setText("");
					cphone.setText("");
					}
				else
					JOptionPane.showConfirmDialog(getParent(), "Unable to Update record");
					
				}
	
			
		});
		update.setFont(new Font("Tahoma", Font.PLAIN, 15));
		update.setBackground(Color.WHITE);
		update.setBounds(35, 385, 104, 23);
		panel.add(update);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				HomePage hp=new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHome.setBackground(Color.WHITE);
		btnHome.setBounds(574, 439, 89, 23);
		panel.add(btnHome);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				emailtext.setText("");
				upasstext.setText("");
				cname.setText("");
				cphone.setText("");
			}
		});
		reset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reset.setBackground(Color.WHITE);
		reset.setBounds(221, 385, 89, 23);
		panel.add(reset);
		
		upasstext = new JPasswordField();
		upasstext.setColumns(10);
		upasstext.setBounds(347, 173, 162, 37);
		panel.add(upasstext);
		
		JLabel CusPass = new JLabel("Password");
		CusPass.setForeground(Color.BLACK);
		CusPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CusPass.setBounds(10, 185, 168, 25);
		panel.add(CusPass);
	}
}
