package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class User extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 720, 482);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 710, 44);
		panel_1.setBackground(Color.RED);
		panel.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inventory Management System");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 30));
		lblNewLabel_2.setBackground(new Color(255, 0, 102));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("User ID");
		lblNewLabel_1_1.setBounds(10, 120, 122, 25);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Name");
		lblNewLabel_1_2.setBounds(10, 175, 85, 25);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone");
		lblNewLabel_1_3.setBounds(10, 229, 104, 25);
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setBounds(173, 122, 122, 29);
		textField.setColumns(10);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(173, 177, 122, 29);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(173, 225, 122, 29);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(10, 323, 72, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.WHITE);
		panel.add(btnNewButton);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(105, 410, 67, 23);
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEdit.setBackground(Color.WHITE);
		panel.add(btnEdit);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(574, 439, 89, 23);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHome.setBackground(Color.WHITE);
		panel.add(btnHome);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(187, 323, 89, 23);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setBackground(Color.WHITE);
		panel.add(btnDelete);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(0, 42, 710, 44);
		panel_1_1.setBackground(Color.RED);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("User");
		panel_1_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(328, 140, 357, 242);
		panel.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"User ID", "Name", "Phone no"
			}
		));
	}

}
