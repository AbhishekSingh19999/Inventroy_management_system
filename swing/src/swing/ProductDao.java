package swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDao 
{
	Connection con;
	Statement st;
	ResultSet rs;
	
	public ProductDao()
	{
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","12345");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
		 public int addproduct(Product prod)
		 {
			 int status=0;
			 
			 try {
				st=con.createStatement();
				
				status=st.executeUpdate("insert into products values('"+prod.getProdId()+"','"+prod.getProdName()+"','"+prod.getProdQuantity()+"',"+prod.getProdDescription()+","+prod.getProdCategory()+")");
			System.out.println("Record inserted:"+status);
			 
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return status;
		 }
		 
		public int getQuantity(int Id)
		{
			int qty=0;                           // executeQuery: select commands 
			                                     
			 try {
					st=con.createStatement();
					
					rs=st.executeQuery("select qty from products where prodId="+Id+" ");
					
					if(rs.next())
						qty=rs.getInt(1);
				System.out.println("Record inserted:"+qty);
				 
				 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			return qty;
		}
		
		public int deleteProduct(String Prodid)
		 {
	           int status=0;
			 
			 try {
					st=con.createStatement();
					
					status=st.executeUpdate("delete from products where Prodid='"+Prodid+"'");
			//	System.out.println("Record inserted:"+status);
				 
				 } catch (SQLException e) {
					// TODO Auto-generated catch block  
					e.printStackTrace();
				 }
			return status;
			 
		 }
		
		public int getPrice(int Id)
		{
			int Price=0;                           // executeQuery: select commands 
			                                     
			 try {
					st=con.createStatement();
					
					rs=st.executeQuery("select ProdPrice from products where prodId="+Id);
					
					if(rs.next())
						Price=rs.getInt(1);
				System.out.println("Record inserted:"+Price);
				 
				 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			return Price;
		}
		
		 
		
		 public ArrayList<Product>getProduct()
		 {
			 ArrayList<Product> prodlist=new ArrayList<>();
			 
			 try {
				st=con.createStatement();
				
				rs=st.executeQuery("select * from products");
				
				while(rs.next())
				{
					Product p=new Product();
					
					p.setProdId(rs.getNString(1));
					p.setProdName(rs.getNString(2));
					p.setProdQuantity(rs.getInt(3));
					p.setProdDescription(rs.getNString(4));
					p.setProdCategory(rs.getNString(5));
					p.setProdPrice(rs.getInt(6));
					
				   prodlist.add(p);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return prodlist;
		 }

		 public Product getProduct(int pid)
		 {
			 Product p=null;
			 
			 try {
				st=con.createStatement();
				
				rs=st.executeQuery("select * from products where ProdId="+pid);
				
				while(rs.next())
				{
					p=new Product();
					
					p.setProdId(rs.getString(1));
					p.setProdName(rs.getString(2));
					p.setProdQuantity(rs.getInt(3));
					p.setProdDescription(rs.getString(4));
					p.setProdCategory(rs.getString(5));
					p.setProdPrice(rs.getInt(6));
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return p;
		 }


	public static void main(String[] args) {
		
		ProductDao pdao=new ProductDao();
		
	     
	       ArrayList<Product> prodlist=pdao.getProduct();
	       
	       for(Product p: prodlist)
	       {
	    	   System.out.println(p);
	       }
	    
           
	}

}
