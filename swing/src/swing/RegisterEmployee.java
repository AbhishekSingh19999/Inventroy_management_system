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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField emptext;
	private JTextField nametext;
	private JTextField phonetext;
	private JTextField upasstext;
	private JTextField salarytext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterEmployee frame = new RegisterEmployee();
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
	public RegisterEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel empid = new JLabel("Employee ID");
		empid.setForeground(Color.BLACK);
		empid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		empid.setBounds(30, 115, 122, 25);
		contentPane.add(empid);
		
		JLabel empname = new JLabel("Employee Name");
		empname.setForeground(Color.BLACK);
		empname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		empname.setBounds(30, 170, 173, 25);
		contentPane.add(empname);
		
		JLabel empPhone = new JLabel("Phone");
		empPhone.setForeground(Color.BLACK);
		empPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		empPhone.setBounds(30, 224, 104, 25);
		contentPane.add(empPhone);
		
		emptext = new JTextField();
		emptext.setColumns(10);
		emptext.setBounds(397, 117, 158, 29);
		contentPane.add(emptext);
		
		nametext = new JTextField();
		nametext.setColumns(10);
		nametext.setBounds(397, 172, 158, 29);
		contentPane.add(nametext);
		
		phonetext = new JTextField();
		phonetext.setColumns(10);
		phonetext.setBounds(397, 220, 158, 29);
		contentPane.add(phonetext);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(0, 0, 644, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Inventory Management System");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 32));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(0, 51, 644, 39);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Management");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel empPass = new JLabel("Password");
		empPass.setForeground(Color.BLACK);
		empPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		empPass.setBounds(30, 277, 104, 25);
		contentPane.add(empPass);
		
		JLabel EmpSalary = new JLabel("Salary");
		EmpSalary.setForeground(Color.BLACK);
		EmpSalary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EmpSalary.setBounds(30, 324, 104, 25);
		contentPane.add(EmpSalary);
		
		upasstext = new JTextField();
		upasstext.setColumns(10);
		upasstext.setBounds(397, 266, 158, 29);
		contentPane.add(upasstext);
		
		salarytext = new JTextField();
		salarytext.setColumns(10);
		salarytext.setBounds(397, 320, 158, 29);
		contentPane.add(salarytext);
		
		JButton Register = new JButton("Register");
		Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//get values from fields(TEXTFIELDS) AND STORE THEM  in bean class
				Employee emp=new Employee();
				// emp.setEmpid();
				emp.setEmpid(emptext.getText());
				emp.setEmpname(nametext.getText());
		    	emp.setPassword(new String(upasstext.getText()));
				emp.setPhone(Long.parseLong(phonetext.getText()));
				emp.setSalary(Float.parseFloat(salarytext.getText()));
				
				//  setter methods(employee)(textfield methods to get text)
				
				//pass employee object into dao class method
				
      		EmployeeDao edao=new EmployeeDao();
			int status=edao.addEmployee(emp);
			
			//check status 
			if (status==1)
				JOptionPane.showConfirmDialog(getParent(), "Record Saved Successfully");
			else
				JOptionPane.showConfirmDialog(getParent(), "Unable to save record as ID already exists");
				
			}
		});
		Register.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Register.setBounds(45, 388, 107, 29);
		contentPane.add(Register);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				HomePage hp=new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCancel.setBounds(260, 388, 107, 29);
		contentPane.add(btnCancel);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				emptext.setText(" ");
				nametext.setText(" ");
				upasstext.setText(" ");
				phonetext.setText(" ");
			    salarytext.setText(" ");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnReset.setBounds(469, 388, 107, 29);
		contentPane.add(btnReset);
	}
}
