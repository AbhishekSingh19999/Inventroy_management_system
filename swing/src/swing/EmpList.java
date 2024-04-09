package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmpList extends JFrame {

	private JPanel contentPane;
	private JTextField emptext;
	private JTextField nametext;
	private JTextField upasstext;
	private JTextField phonetext;
	private JTextField salarytext;
	private JTable table_1;
	String data[][];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {  
			public void run() {
				try {
					EmpList frame = new EmpList("3");
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
	public EmpList(String id) 
	{
		data=new String[25][5];
		EmployeeDao edao=new EmployeeDao();
		Employee emp=edao.getEmployeeRecord(id);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 506);
		contentPane = new JPanel();
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
		
		JLabel empPhone = new JLabel("Password");
		empPhone.setForeground(Color.BLACK);
		empPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		empPhone.setBounds(30, 224, 104, 25);
		contentPane.add(empPhone);
		
		emptext = new JTextField(emp.getEmpid());
		emptext.setEditable(false);
		emptext.setColumns(10);
		emptext.setBounds(224, 117, 158, 29);
		contentPane.add(emptext);
		
		nametext = new JTextField(emp.getEmpname());
		nametext.setColumns(10);
		nametext.setBounds(224, 172, 158, 29);
		contentPane.add(nametext);
		
		upasstext = new JTextField(emp.getPassword());
		upasstext.setColumns(10);
		upasstext.setBounds(224, 226, 158, 29);
		contentPane.add(upasstext);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 839, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Inventory Management System");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 32));
		lblNewLabel.setBackground(Color.RED);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 51, 839, 39);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Management");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBackground(SystemColor.menu);
		panel_1.add(lblNewLabel_1);
		
		JLabel empPass = new JLabel("Phone");
		empPass.setForeground(Color.BLACK);
		empPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		empPass.setBounds(30, 277, 104, 25);
		contentPane.add(empPass);
		
		JLabel EmpSalary = new JLabel("Salary");
		EmpSalary.setForeground(Color.BLACK);
		EmpSalary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EmpSalary.setBounds(30, 324, 104, 25);
		contentPane.add(EmpSalary);
		
		phonetext = new JTextField(String.valueOf(emp.getPhone()));
		phonetext.setColumns(10);
		phonetext.setBounds(224, 273, 158, 29);
		contentPane.add(phonetext);
		
		salarytext = new JTextField(String.valueOf(emp.getSalary()));
		salarytext.setColumns(10);
		salarytext.setBounds(224, 326, 158, 29);
		contentPane.add(salarytext);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				// get values from textfields
				
				Employee emp=new Employee();
				emp.setEmpid(id);
				emp.setEmpname(nametext.getText());
				emp.setPassword(upasstext.getText());
				emp.setPhone(Long.parseLong(phonetext.getText()));
				emp.setSalary(Float.parseFloat(salarytext.getText()));
				
				int status = edao.updateEmployee(emp);
				
				if(status==1)
				{
					JOptionPane.showMessageDialog(getParent(), "Record Updated Successfully!");
					 ArrayList<Employee> elist=edao.getEmployees();
					int r=0,c=0;
					   
						
				       for(Employee e1: elist)
				       {
				    	   c=0;
				    	   System.out.println(e1);
				    	   data[r][c++]=e1.getEmpid();
				    	   data[r][c++]=e1.getPassword();
				    	   data[r][c++]=e1.getEmpname();
				    	   data[r][c++]=String.valueOf(e1.getPhone());
				    	   data[r++][c]=String.valueOf(e1.getSalary());
				       }
				       table_1.updateUI();
				}
				else
					JOptionPane.showMessageDialog(getParent(), "Unable to Update Record!");
				
				
			}
			});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnUpdate.setBounds(30, 387, 107, 29);
		contentPane.add(btnUpdate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			  // CustomerEmployee ce = new CustomerEmployee();
				
				CustomerEmployee ce=new CustomerEmployee(id);
				ce.setVisible(true);
				setVisible(false);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCancel.setBounds(129, 438, 107, 29);
		contentPane.add(btnCancel);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				emptext.setText("");
				nametext.setText("");
				upasstext.setText("");
				phonetext.setText("");
			    salarytext.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnReset.setBounds(232, 387, 107, 29);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel_2 = new JLabel("Employee List");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(577, 90, 104, 25);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(440, 123, 389, 330);
		contentPane.add(scrollPane);
		 
		//EmployeeDao  edao =new EmployeeDao();
	
		 ArrayList<Employee> elist=edao.getEmployees();
			int r=0,c=0;
		 			
	       for(Employee e: elist)
	       {
	    	   c=0;
	    	   System.out.println(e);
	    	   data[r][c++]=e.getEmpid();
	    	   data[r][c++]=e.getPassword();
	    	   data[r][c++]=e.getEmpname();
	    	   data[r][c++]=String.valueOf(e.getPhone());
	    	   data[r++][c]=String.valueOf(e.getSalary());
	       }
	       
	      String head[]={"Employee ID", "Employee Name","Employee Password", "Employee Phone", "Employee Salary"} ;
		
		table_1 = new JTable(data , head);
		scrollPane.setViewportView(table_1);
	}

}
