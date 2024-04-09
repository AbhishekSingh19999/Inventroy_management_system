package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerEmployee extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerEmployee frame = new CustomerEmployee("3");
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
	public CustomerEmployee(String id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Products List");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(50, 98, 124, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmployeesList = new JLabel("Employees List");
		lblEmployeesList.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmployeesList.setBounds(405, 98, 145, 55);
		contentPane.add(lblEmployeesList);
		
		JLabel lblCustomersList = new JLabel("Customers List");
		lblCustomersList.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCustomersList.setBounds(232, 209, 145, 55);
		contentPane.add(lblCustomersList);
		
		JButton btnNewButton = new JButton("------)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ProductList pl=new ProductList();
				pl.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(71, 173, 73, 29);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 599, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Inventory Management System");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 32));
		lblNewLabel_2.setBackground(Color.RED);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 45, 599, 39);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Management Portal");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1.setBackground(SystemColor.menu);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("------)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				EmpList el=new EmpList(id);
				el.setVisible(true);
				
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(446, 173, 73, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("------)");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(263, 275, 73, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				HomePage em=new HomePage();
			     em.setVisible(true);
				
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setBounds(477, 360, 73, 29);
		contentPane.add(btnBack);
	}

}
