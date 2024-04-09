package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registercustomer extends JFrame {

	private JPanel contentPane;
	private JTextField nametext;
	private JTextField phonetext;
	private JPasswordField upasstext;
	private JTextField emailtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registercustomer frame = new Registercustomer();
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
	public Registercustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.RED);
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(0, 52, 789, 47);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Registration Page");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_1);
		
		JLabel cusname = new JLabel("Name");
		cusname.setForeground(Color.BLACK);
		cusname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cusname.setBounds(60, 301, 85, 25);
		contentPane.add(cusname);
		
		nametext = new JTextField();
		nametext.setColumns(10);
		nametext.setBounds(471, 287, 162, 37);
		contentPane.add(nametext);
		
		phonetext = new JTextField();
		phonetext.setColumns(10);
		phonetext.setBounds(471, 356, 162, 37);
		contentPane.add(phonetext);
		
		JLabel cusphone = new JLabel("Phone");
		cusphone.setForeground(Color.BLACK);
		cusphone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cusphone.setBounds(65, 358, 104, 25);
		contentPane.add(cusphone);
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) 
			{
				Customers c=new Customers();
				c.setCusemail(emailtext.getText());
				c.setCusPassword(upasstext.getText());
				c.setCusName(nametext.getText());
				c.setCusPhone(Long.parseLong(phonetext.getText()));
				
				CustomerDao edao=new CustomerDao();
				int status=edao.addCustomer(c);
				
				//check status 
				if (status==1)
					{
					JOptionPane.showConfirmDialog(getParent(), "Record Added Successfully");
					emailtext.setText("");
					upasstext.setText("");
					nametext.setText("");
					phonetext.setText("");
					}
				else
					JOptionPane.showConfirmDialog(getParent(), "Unable to Add record");
					
				}
			
		});
		add.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add.setBackground(Color.WHITE);
		add.setBounds(73, 504, 72, 23);
		contentPane.add(add);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				emailtext.setText("");
				upasstext.setText("");
				nametext.setText("");
				phonetext.setText("");
			}
		});
		reset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		reset.setBackground(Color.WHITE);
		reset.setBounds(284, 504, 89, 23);
		contentPane.add(reset);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				CustomerLogin cg=new CustomerLogin();
				cg.setVisible(true);
				setVisible(false);
			}
		});
		back.setFont(new Font("Tahoma", Font.PLAIN, 15));
		back.setBackground(Color.WHITE);
		back.setBounds(180, 568, 89, 23);
		contentPane.add(back);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setForeground(Color.RED);
		panel_2_1.setBackground(Color.RED);
		panel_2_1.setBounds(0, 0, 789, 52);
		contentPane.add(panel_2_1);
		
		JLabel lblNewLabel = new JLabel("Inventory Management System");
		panel_2_1.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 30));
		lblNewLabel.setBackground(new Color(255, 0, 102));
		
		JLabel cuspass = new JLabel("Customer Pass");
		cuspass.setForeground(Color.BLACK);
		cuspass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cuspass.setBounds(60, 235, 142, 25);
		contentPane.add(cuspass);
		
		upasstext = new JPasswordField();
		upasstext.setColumns(10);
		upasstext.setBounds(471, 223, 162, 37);
		contentPane.add(upasstext);
		
		JLabel cusemail = new JLabel("Customer Email");
		cusemail.setForeground(Color.BLACK);
		cusemail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cusemail.setBounds(60, 169, 142, 25);
		contentPane.add(cusemail);
		
		emailtext = new JTextField();
		emailtext.setColumns(10);
		emailtext.setBounds(471, 157, 162, 37);
		contentPane.add(emailtext);
	}
}
