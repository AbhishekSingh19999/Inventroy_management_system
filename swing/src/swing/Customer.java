package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Customer extends JFrame {

	private JPanel contentPane;
	private JTextField cid;
	private JTextField cname;
	private JTextField cphone;
	private JTable table;
	DefaultTableModel Model;
	String data[][];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer frame = new Customer();
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
	public Customer() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 723, 475);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Customer ID");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 120, 122, 25);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Name");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(10, 175, 85, 25);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(10, 229, 104, 25);
		panel.add(lblNewLabel_1_3);
		
		cid = new JTextField();
		cid.setColumns(10);
		cid.setBounds(173, 122, 122, 29);
		panel.add(cid);
		
		cname = new JTextField();
		cname.setColumns(10);
		cname.setBounds(173, 177, 122, 29);
		panel.add(cname);
		
		cphone = new JTextField();
		cphone.setColumns(10);
		cphone.setBounds(173, 225, 122, 29);
		panel.add(cphone);
		
		String headings[]=new String[] {
				"Customer ID", "Name", "Phone"
			};
		String data[][]=new String[3][20];
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(337, 139, 374, 240);
		panel.add(scrollPane_1);
		
		table = new JTable(data,headings);
		Model= new DefaultTableModel();
         Object[] row=new Object [0]; 
		scrollPane_1.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
//				Model.addRow(row);
//				data[r][c]=cid.getText();
//				data[r][++c]=cname.getText();
//				data[r][++c]=cphone.getText();
//				//DefaultTableModel dt= (DefaultTableModel)JTable.getModel();
//				table.updateUI();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(10, 323, 72, 23);
		panel.add(btnNewButton);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setBounds(105, 410, 67, 23);
		panel.add(btnEdit);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHome.setBackground(Color.WHITE);
		btnHome.setBounds(574, 439, 89, 23);
		panel.add(btnHome);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		//	DefaultTableModel tblmodel = (DefaultTableModel) JTable.get
			
			
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(187, 323, 89, 23);
		panel.add(btnDelete);

		
	}

}
