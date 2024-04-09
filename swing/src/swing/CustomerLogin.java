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
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTable table;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	private JTable table_1;
	private JTextField emailtext;
	private JPasswordField passtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLogin frame = new CustomerLogin();
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
	public CustomerLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 684);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.shadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(451, 10, 1, 1);
		panel.setLayout(null);
		panel.setBackground(new Color(102, 102, 102));
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(102, 102, 102));
		panel_1.setBounds(0, 0, 734, 73);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("InvSys");
		lblNewLabel.setForeground(new Color(230, 230, 250));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
		lblNewLabel.setBounds(278, 11, 204, 47);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1.setBounds(71, 237, 190, 33);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee Pass");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_1.setBounds(71, 303, 190, 33);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(428, 237, 151, 33);
		panel.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(428, 310, 151, 34);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(new Color(0, 0, 51));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(87, 401, 102, 23);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(new Color(0, 0, 51));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBounds(319, 401, 102, 23);
		panel.add(btnReset);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, 74, 226, 125);
		panel.add(lblNewLabel_2);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setForeground(new Color(0, 0, 51));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(554, 401, 102, 23);
		panel.add(btnBack);
		
		JButton btnNewButton_1 = new JButton("-----)");
		btnNewButton_1.setBounds(655, 84, 69, 33);
		panel.add(btnNewButton_1);
		
		table = new JTable();
		table.setBounds(626, 131, -71, -35);
		panel.add(table);
		
		JLabel lblNewLabel_3 = new JLabel("New Employee");
		lblNewLabel_3.setForeground(new Color(240, 248, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBackground(new Color(255, 245, 238));
		lblNewLabel_3.setBounds(546, 76, 94, 41);
		panel.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(457, 10, 1, 1);
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(102, 102, 102));
		contentPane.add(panel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(102, 102, 102));
		panel_1_1.setBounds(0, 0, 734, 73);
		panel_2.add(panel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("InvSys");
		lblNewLabel_4.setForeground(new Color(230, 230, 250));
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 35));
		lblNewLabel_4.setBounds(278, 11, 204, 47);
		panel_1_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("Employee ID");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 204));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_2.setBounds(71, 237, 190, 33);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Employee Pass");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_1_1.setBounds(71, 303, 190, 33);
		panel_2.add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(428, 237, 151, 33);
		panel_2.add(textField_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(428, 310, 151, 34);
		panel_2.add(passwordField_1);
		
		JButton btnNewButton_2 = new JButton("LOGIN");
		btnNewButton_2.setForeground(new Color(0, 0, 51));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(87, 401, 102, 23);
		panel_2.add(btnNewButton_2);
		
		JButton btnReset_1 = new JButton("RESET");
		btnReset_1.setForeground(new Color(0, 0, 51));
		btnReset_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset_1.setBounds(319, 401, 102, 23);
		panel_2.add(btnReset_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(0, 74, 226, 125);
		panel_2.add(lblNewLabel_2_1);
		
		JButton btnBack_1 = new JButton("BACK");
		btnBack_1.setForeground(new Color(0, 0, 51));
		btnBack_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack_1.setBounds(554, 401, 102, 23);
		panel_2.add(btnBack_1);
		
		JButton btnNewButton_1_1 = new JButton("-----)");
		btnNewButton_1_1.setBounds(655, 84, 69, 33);
		panel_2.add(btnNewButton_1_1);
		
		table_1 = new JTable();
		table_1.setBounds(626, 131, -71, -35);
		panel_2.add(table_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("New Employee");
		lblNewLabel_3_1.setForeground(new Color(240, 248, 255));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBackground(new Color(255, 245, 238));
		lblNewLabel_3_1.setBounds(546, 76, 94, 41);
		panel_2.add(lblNewLabel_3_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(102, 102, 102));
		panel_1_2.setBounds(0, 0, 909, 73);
		contentPane.add(panel_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("InvSys");
		lblNewLabel_5.setForeground(new Color(230, 230, 250));
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 35));
		lblNewLabel_5.setBounds(278, 11, 204, 47);
		panel_1_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("New Customer");
		lblNewLabel_3_2.setForeground(new Color(240, 248, 255));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_2.setBackground(new Color(255, 245, 238));
		lblNewLabel_3_2.setBounds(693, 83, 94, 41);
		contentPane.add(lblNewLabel_3_2);
		
		JButton btnNewButton_1_2 = new JButton("-----)");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Registercustomer rc=new Registercustomer();
				rc.setVisible(true);
				
				setVisible(false);
			}
		});
		btnNewButton_1_2.setBounds(830, 83, 69, 33);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Customer Email");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 204));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_3.setBounds(126, 237, 214, 33);
		contentPane.add(lblNewLabel_1_3);
		
		emailtext = new JTextField();
		emailtext.setColumns(10);
		emailtext.setBounds(508, 245, 190, 33);
		contentPane.add(emailtext);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Customer Pass");
		lblNewLabel_1_1_2.setForeground(new Color(255, 255, 204));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_1_1_2.setBounds(126, 372, 190, 33);
		contentPane.add(lblNewLabel_1_1_2);
		
		passtext = new JPasswordField();
		passtext.setBounds(508, 371, 190, 34);
		contentPane.add(passtext);
		
		JButton btnNewButton_3 = new JButton("LOGIN");
		btnNewButton_3.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e)
			{
				String Cusemail=emailtext.getText();
				String Cuspassword=passtext.getText();
				
			CustomerDao  cdao=new CustomerDao();
				Customers Cus=cdao.checkLogin(Cusemail, Cuspassword);
				
				if(Cus.getCusemail().equals(" ") || Cus.getCusPassword().equals(" ")||Cus.getCusemail().equals(null)||Cus.getCusPassword().equals(null))
				{
					JOptionPane.showMessageDialog(getParent(), "Fill Credentials First!");
				}
			
			
			if(!(Cus.getCusemail().equals(" ") || Cus.getCusemail().equals(null)))
			{
				JOptionPane.showMessageDialog(getParent(), "Login Successful!");
				Edit re=new  Edit(Cusemail);
				setVisible(false);
				re.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(getParent(), "Either Id or Password is incorrect!");
			}
				
			}
		});
		btnNewButton_3.setForeground(new Color(0, 0, 51));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(93, 577, 102, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnReset_2 = new JButton("RESET");
		btnReset_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				emailtext.setText("");
				passtext.setText("");
			}
		});
		btnReset_2.setForeground(new Color(0, 0, 51));
		btnReset_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset_2.setBounds(379, 577, 102, 23);
		contentPane.add(btnReset_2);
		
		JButton btnBack_2 = new JButton("BACK");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				HomePage hp=new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnBack_2.setForeground(new Color(0, 0, 51));
		btnBack_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack_2.setBounds(698, 577, 102, 23);
		contentPane.add(btnBack_2);
	}
}
