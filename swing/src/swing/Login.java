package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField uid;
	private JPasswordField upass;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 102, 102));
		panel.setBounds(0, 0, 734, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 102, 102));
		panel_1.setBounds(0, 0, 734, 73);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("InvSys");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
		lblNewLabel.setForeground(new Color(230, 230, 250));
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
		
		uid = new JTextField();
		uid.setBounds(428, 237, 151, 33);
		panel.add(uid);
		uid.setColumns(10);
		
		upass = new JPasswordField();
		upass.setBounds(428, 310, 151, 34);
		panel.add(upass);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
					String userid=uid.getText();
					String pass=new String(upass.getPassword());
					
					EmployeeDao edao=new EmployeeDao();
					Employee emp=edao.checkLogin(userid, pass);
					
					if(emp.getEmpid().equals(" ") || emp.getPassword().equals(" ")||emp.getEmpid().equals(null)||emp.getPassword().equals(null))
						{
							JOptionPane.showMessageDialog(getParent(), "Fill Credentials First!");
						}
					
					
					if(!(emp.getEmpid().equals(" ") || emp.getEmpid().equals(null)))
					{
						JOptionPane.showMessageDialog(getParent(), "Login Successful!");
						CustomerEmployee re=new CustomerEmployee(userid);
						setVisible(false);
						re.setVisible(true);
					}
					else if(emp.getEmpid().equals(" ") || emp.getPassword().equals(" ")||emp.getEmpid().equals(null)||emp.getPassword().equals(null))
					{
						JOptionPane.showMessageDialog(getParent(), "Fill Credentials First!");
					}
					else
					{
						JOptionPane.showMessageDialog(getParent(), "Either Id or Password is incorrect!");
					}
				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 51));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(87, 401, 102, 23);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				uid.setText("");
				upass.setText("");
			}
		});
		btnReset.setForeground(new Color(0, 0, 51));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReset.setBounds(319, 401, 102, 23);
		panel.add(btnReset);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Atul Singh\\Downloads\\java ques\\Invent.jpg"));
		lblNewLabel_2.setBounds(0, 74, 226, 125);
		panel.add(lblNewLabel_2);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				HomePage hp=new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setForeground(new Color(0, 0, 51));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(554, 401, 102, 23);
		panel.add(btnBack);
		
		JButton btnNewButton_1 = new JButton("-----)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				RegisterEmployee re= new RegisterEmployee();
				re.setVisible(true);
				
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(655, 84, 69, 33);
		panel.add(btnNewButton_1);
		
		table = new JTable();
		table.setBounds(626, 131, -71, -35);
		panel.add(table);
		
		JLabel lblNewLabel_3 = new JLabel("New Employee");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(new Color(240, 248, 255));
		lblNewLabel_3.setBackground(new Color(255, 245, 238));
		lblNewLabel_3.setBounds(546, 76, 94, 41);
		panel.add(lblNewLabel_3);
	}
}
