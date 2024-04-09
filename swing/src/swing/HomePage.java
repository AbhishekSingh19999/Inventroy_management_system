package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 666, 475);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(0, 0, 666, 50);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Inventory Management System");
		lblNewLabel.setBackground(new Color(255, 0, 102));
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 30));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.RED);
		panel_1_1.setBounds(0, 49, 666, 38);
		panel.add(panel_1_1);
		
		JLabel lblMainForm_1 = new JLabel("Main Form");
		lblMainForm_1.setForeground(Color.WHITE);
		lblMainForm_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		lblMainForm_1.setBackground(new Color(255, 0, 102));
		panel_1_1.add(lblMainForm_1);
		
		JButton btnNewButton_1 = new JButton("Products");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ProductList pr=new ProductList();
				pr.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(45, 135, 134, 33);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Customers");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				CustomerLogin ed=new CustomerLogin();
				ed.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(40, 345, 139, 33);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Orders");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Order or=new Order();
				or.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(461, 345, 118, 32);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Employees");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Login log=new Login();
				log.setVisible(true);
				
				setVisible(false);
				
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(454, 135, 139, 31);
		panel.add(btnNewButton_4);
	}

}
