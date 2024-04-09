package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductList extends JFrame {

	private JPanel contentPane;
	private JTable table;
	String data[][];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductList frame = new ProductList();
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
	public ProductList() {
		data=new String[25][6];
	//	ProductDao pdao=new ProductDao();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 760, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Inventory Management System");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 32));
		lblNewLabel_2.setBackground(Color.RED);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 45, 760, 39);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Products Lists");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1.setBackground(SystemColor.menu);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				HomePage hp=new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(44, 479, 108, 33);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 107, 750, 362);
		contentPane.add(scrollPane);
		
//		data=new String[25][5];
		ProductDao pdao=new ProductDao();
		
		ArrayList<Product> prodlist= pdao.getProduct();
		
		int r=0,c=0;
			
	       for(Product p: prodlist)
	       {
	    	   c=0;
	    	   System.out.println(p);
	    	   data[r][c++]=p.getProdId();
	    	   data[r][c++]=p.getProdName();
	    	   data[r][c++]=String.valueOf(p.getProdQuantity());
	    	   data[r][c++]=p.getProdCategory();
	    	   
	    	   data[r][c++]=p.getProdDescription();
	    	   data[r++][c]=""+(p.getProdPrice());
	    	   
	    	  
	       }
	      // table.updateUI();
	       String head[]={"Product ID", "Product Name","Product Quantity", "Product Category", "Product Description","Product Price"} ;
		table = new JTable(data , head);
		
		scrollPane.setViewportView(table);
	}
}
