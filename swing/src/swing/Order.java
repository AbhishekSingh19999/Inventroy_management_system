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
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Order extends JFrame {

	private JPanel contentPane;
	private JTextField idtext;
	private JTextField qtytext;
	private JTable table;
	private JTextField viewtotal;
	String data[][];
	
	 int r=0,c=0;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order frame = new Order();
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
	public Order() 
	{
		data=new String[20][6];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 794);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 11, 824, 746);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 0, 828, 44);
		panel.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inventory Management System");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 30));
		lblNewLabel_2.setBackground(new Color(255, 0, 102));
		panel_1.add(lblNewLabel_2);
		
		JLabel productID = new JLabel("Product ID");
		productID.setForeground(Color.BLACK);
		productID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		productID.setBounds(10, 108, 122, 49);
		panel.add(productID);
		
		JLabel ProductQuantity = new JLabel("Product Quantity");
		ProductQuantity.setForeground(Color.BLACK);
		ProductQuantity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ProductQuantity.setBounds(12, 182, 159, 44);
		panel.add(ProductQuantity);
		
		idtext = new JTextField();
		idtext.setColumns(10);
		idtext.setBounds(249, 108, 122, 43);
		panel.add(idtext);
		
		JButton add = new JButton("Add");
		add.setForeground(new Color(248, 248, 255));
		add.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				ProductDao pr=new ProductDao();
							
				Product p = pr.getProduct(Integer.parseInt(idtext.getText()));
				
				if(p!=null)
				{
				c=0;
					System.out.println(qtytext.getText());
					int qty=Integer.parseInt(qtytext.getText());
					// call dao method to get the product price using product id
					// if product id found then
					
					if(p.getProdQuantity()>qty)
					{	
					   data[r][c++]=p.getProdId();
					   data[r][c++]=p.getProdName();
					   data[r][c++]=String.valueOf(qty);
			    	   data[r][c++]=p.getProdCategory();
			    	   data[r][c++]=p.getProdDescription();
			    	  data[r++][c]=""+(p.getProdPrice()*qty);
			    	  
					   
			    	   table.updateUI();
					}
					else
						JOptionPane.showMessageDialog(getParent(), "Qty is Not Available!");
				}
				else
				{
					JOptionPane.showMessageDialog(getParent(), "Product Not Found!");
				}
			}
		});
		add.setFont(new Font("Times New Roman", Font.BOLD, 22));
		add.setBackground(new Color(205, 92, 92));
		add.setBounds(12, 287, 136, 49);
		panel.add(add);
		
		JButton Home = new JButton("Home");
		Home.setForeground(new Color(248, 248, 255));
		Home.setFont(new Font("Times New Roman", Font.BOLD, 22));
		Home.setBackground(new Color(205, 92, 92));
		Home.setBounds(10, 376, 122, 49);
		panel.add(Home);
		
		JButton Delete = new JButton("Delete");
		Delete.setForeground(new Color(248, 248, 255));
		Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
	
				String text=JOptionPane.showInputDialog("Enter Product Id that you want to delete" );
				
			//	ProductDao pdao=new ProductDao();
				
				 boolean status=false;
				 	      
						for(int row=0;row<=data.length;row++)
				    	{
				    	    if(data[row][0].equals(text))
				    	    {
				    	    	System.out.println("Product ID is found ");
					    	    // shifting elements
				    	    	for(int i=row;i<data.length;i++)
				    	    	{
				    	    		for(int c=0;c<data[i].length;c++)
				    	    		{
				    	    			if(i<data.length-1)
					    	    		{
				    	    				data[i][c]=data[i+1][c];
					    	    		}
//				    	    			else
//				    	    			{
//				    	    				data[r][c]="";
//				    	    			}
				    	    		}
				    	    		
				    	    		
				    	    	}
				    	    	status=true;
				    	    	
				    	    	table.updateUI();
				    	    	r--;
				    	    	break;
				    	    	
				    	    }
				    	}	    	  
				    	 if(!status)
				    	   {
				    		   JOptionPane.showMessageDialog(getParent(),"Product ID not found ");
				    		  
				    	   }
				
			}
		});
		Delete.setFont(new Font("Times New Roman", Font.BOLD, 22));
		Delete.setBackground(new Color(205, 92, 92));
		Delete.setBounds(185, 376, 136, 49);
		panel.add(Delete);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.RED);
		panel_1_1.setBounds(0, 42, 828, 44);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Category");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1_1.add(lblNewLabel_1);
		String head[]={"Product ID", "Product Name", "Product Quantity","Product Category","Product Description","Product Price"};
		table = new JTable(data, head);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		JScrollPane scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(413, 123, 401, 266);
		panel.add(scrollPane);
		
		qtytext = new JTextField();
		qtytext.setBounds(251, 178, 120, 37);
		panel.add(qtytext);
		qtytext.setColumns(10);
		
		viewtotal = new JTextField();
		viewtotal.setBounds(222, 458, 333, 96);
		panel.add(viewtotal);
		viewtotal.setColumns(10);
		
		JButton Total = new JButton("Calculate Total");
		Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				ProductDao pdao=new ProductDao();
				
				int sum=0;
				//int qty=Integer.parseInt(qtytext.getText());
				System.out.println("rows : "+r);
				for(int i=0;i<r;i++)
				{
					System.out.println("Name "+data[i][1]);
					sum+=(Integer.parseInt(data[i][5]));
				 
				  
				}
				
			//	Product p= pdao.getPrice(int Id);
				
				
				viewtotal.setText("Total : "+sum);
				
				
				
				
			}
		});
		Total.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Total.setBackground(Color.WHITE);
		Total.setBounds(565, 479, 191, 56);
		panel.add(Total);
		
		JButton Pay = new JButton("Pay");
		Pay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Pay.setBackground(Color.WHITE);
		Pay.setBounds(222, 585, 364, 71);
		panel.add(Pay);
		
		JButton btnAdd = new JButton("Edit");
		btnAdd.setForeground(new Color(248, 248, 255));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				idtext.setText("");
				
				qtytext.setText("");
				
				
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnAdd.setBackground(new Color(205, 92, 92));
		btnAdd.setBounds(185, 290, 128, 46);
		panel.add(btnAdd);
		
		JLabel lblProductId = new JLabel("Total");
		lblProductId.setForeground(Color.BLACK);
		lblProductId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProductId.setBounds(10, 477, 187, 58);
		panel.add(lblProductId);
	}
}
