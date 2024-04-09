package swing;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class CustomerDao {

	Connection con;
	Statement st;
	ResultSet rs;
	
	public CustomerDao()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","12345"); 
			System.out.println("Connection created");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
}
	public int addCustomer(Customers cus)
	{
		int status=0;
		
		try {
			st=con.createStatement();
			status=st.executeUpdate("insert into customer values('"+cus.getCusemail()+" ','"+cus.getCusPassword()+" ','"+cus.getCusName()+" ','"+cus.getCusPhone()+"')");
		
			System.out.println("Record inserted "+status);
		} catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		return status;
	}
	
	public ArrayList<Customers> getCustomers()
	{
		ArrayList<Customers> clist=new ArrayList<Customers>();
		try {
			st=con.createStatement();
			rs=st.executeQuery("select * from customer");
		
			while(rs.next())
			{
				Customers c=new Customers(); 
				c.setCusemail(rs.getNString(1));
				c.setCusPassword(rs.getNString(2));
				c.setCusName(rs.getString(3));
				c.setCusPhone(rs.getLong(4));
				
				clist.add(c);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return clist;
	}
		 public  Customers checkLogin(String email, String pass)
		 {
			 Customers Cus=null;
			 
			 try {
				st=con.createStatement();
				rs=st.executeQuery("select * from customer where Cusemail='"+email+"' and Cuspass='"+pass+"'");
			
			 if(rs.next())
			 {
				 	Cus=new Customers();  
		
			 Cus.setCusemail(rs.getString(1));
			 Cus.setCusPassword(rs.getNString(2));
			 Cus.setCusName(rs.getNString(3));
			
			 Cus.setCusPhone(rs.getLong(4));
					
			 }
			 		 		 
			 } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 
			return Cus;
		 }

		 public int updateCustomer(Customers Cus)
		 {
			 int status=0;
			 
			 try {
					st=con.createStatement();
					
					status=st.executeUpdate("update customer set Cusemail='"+Cus.getCusemail()+"' Cuspass='"+Cus.getCusPassword()+"',Cusname='"+Cus.getCusName()+"', Cusphone="+Cus.getCusPhone()+" ");
			//	System.out.println("Record inserted:"+status);
				 
				 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return status;
			 
		 }
		
		 public int deleteCustomer(String Cusemail)
		 {
	           int status=0;
			 
			 try {
					st=con.createStatement();
					
					status=st.executeUpdate("delete from customer where cusemail='"+Cusemail+"'");
			//	System.out.println("Record inserted:"+status);
				 
				 } catch (SQLException e) {
					// TODO Auto-generated catch block  
					e.printStackTrace();
				 }
			return status;
			 
		 }	 
		 
		
	
	public static void main(String[] args)
	{
		CustomerDao dao=new CustomerDao();
//		
//		Customers c=new Customers();
//		
//		c.setCusId("103");
//		c.setCusName("Ashish");
//		c.setCusPhone(879064563);
//		
//		int status=dao.addCustomer(c);
//		
//		if(status==1)
//		{
//			System.out.println("Record Inserted");
//			
//		}
//		else
//		{
//			System.out.println("Unable to save customer fields");
//		}
	
//	ArrayList<Customers> clist=dao.getCustomers();
//	
//	for(Customers c:clist)
//	{
//		System.out.println(c);
//	}
	
	
	
	}
	
}
	
	
