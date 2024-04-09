package swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDao
{
Connection con;
Statement st;
ResultSet rs;


public EmployeeDao()
{
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","12345");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} 
	 public int addEmployee(Employee emp)
	 {
		 int status=0;
		 
		 try {
			st=con.createStatement();
			
			status=st.executeUpdate("insert into employee values('"+emp.getEmpid()+"','"+emp.getPassword()+"','"+emp.getEmpname()+"',"+emp.getPhone()+","+emp.getSalary()+")");
		System.out.println("Record inserted:"+status);
		 
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	 }
	 
	 public Employee checkLogin(String id, String pass)
	 {
		 Employee emp=null;
		 
		 try {
			st=con.createStatement();
			rs=st.executeQuery("select * from employee where empid='"+id+"' and password='"+pass+"'");
		
		 if(rs.next())
		 {
			 emp=new Employee();
			
			 emp.setEmpid(rs.getString(1));
			 emp.setPassword(rs.getString(2));
			 emp.setEmpname(rs.getString(3));
			 emp.setPhone(rs.getLong(4));
			 emp.setSalary(rs.getFloat(5));
		 }
		 		 		 
		 } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return emp;
	 }
	 
	 public int updateEmployee(Employee emp)
	 {
		 int status=0;
		 
		 try {
				st=con.createStatement();
				
				status=st.executeUpdate("update employee set empname='"+emp.getEmpname()+"',phone="+emp.getPhone()+", salary="+emp.getSalary()+" where empid='"+emp.getEmpid()+"'");
			System.out.println("Recordn updated:"+status);
			 
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return status;
		 
	 }
	 public int deleteEmployee(String empid)
	 {
           int status=0;
		 
		 try {
				st=con.createStatement();
				
				status=st.executeUpdate("delete from employee where empid='"+empid+"'");
		//	System.out.println("Record inserted:"+status);
			 
			 } catch (SQLException e) {
				// TODO Auto-generated catch block  
				e.printStackTrace();
			 }
		return status;
		 
	 }
	 
	 public ArrayList<Employee>getEmployees()
	 {
		 ArrayList<Employee> emplist=new ArrayList<>();
		 
		 try {
			st=con.createStatement();
			
			rs=st.executeQuery("select * from employee");
			
			while(rs.next())
			{
				Employee e=new Employee();
				
				e.setEmpid(rs.getNString(1));
				System.out.println(e.empid);
				e.setPassword(rs.getNString(2));
				e.setEmpname(rs.getNString(3));
				e.setPhone(rs.getLong(4));
				e.setSalary(rs.getFloat(5));
				
				emplist.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return emplist;
	 }


	
	 public static void main(String[] args)
	 {
//		 Employee emp=new Employee();
//		 emp.setEmpid("1");
//		 emp.setEmpname("Asahai");
//		 emp.setPassword("1885");
//		 emp.setPhone(987687658);
//		 emp.setSalary(290970);
//		 
//		 EmployeeDao edao=new EmployeeDao();
//		 
//		 int status=edao.updateEmployee(emp);
//		 
//		 if(status==1)
//		 {
//			 System.out.println("Record update successfully");
//		 }
//		 else 
//		 {
//		 System.out.println("Unable to update record");
//		 }
	 
//	 Employee emp=edao.checkLogin("e103", "1285");
//	 
//	 try
//	 
//	 {
//	    if (!emp.getEmpid().equals(null) || !emp.getEmpid().equals(" "))
//	     {
//		 System.out.println("Record Found ");
//		 System.out.println("Welcome"+emp.getEmpname());
//		 System.out.println("Salary:"+emp.getSalary());
//	     }
//	 } catch(NullPointerException ne)
//	 
//	 {
//		System.out.println("Record not found "); 
//	 }
//	 
//	 Employee emp=new Employee();
//	 
//	 emp.setEmpid("e102");
//	 emp.setPassword("1230");
//	 emp.setEmpname("Apoorv");
//	 emp.setPhone(7651408963L);
//	 emp.setSalary(650000);
//	 
//
//	 
	EmployeeDao  edao =new EmployeeDao();
//	 int status=edao.updateEmployee(emp);
//	 
//	 if(status==1)
//	 {
//		 System.out.println("Record update successfully");
//	 }
//	 else 
//	 {
//		 System.out.println("Unable to update record");
//	 }

//       Scanner sc=new Scanner(System.in); 
//      
//       System.out.println("Enter id: ");
//       String id=sc.nextLine();
//       
//       int status=edao.deleteEmployee(id);
//  	 
//  	 if(status==1)
//  	 {
//  		 System.out.println("Record deleted successfully");
//  	 }
//  	 else 
//  	 {
//  		 System.out.println("Unable to delete record");
//  	 }
//        	 
         
       ArrayList<Employee> elist=edao.getEmployees();
       
       for(Employee e: elist)
       {
    	   System.out.println(e);
       }
    
       
	 }
	public Employee getEmployeeRecord(String id) 
	{
		Employee emp=null;
		
		try 
		{
			st=con.createStatement();
			rs=st.executeQuery("select * from employee where empid='"+id+"'");
			if(rs.next())
			{
				emp=new Employee();
				emp.setEmpid(rs.getString(1));
				emp.setPassword(rs.getString(2));
				emp.setEmpname(rs.getString(3));
				emp.setPhone(rs.getLong(4));
				emp.setSalary(rs.getFloat(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return emp;
	}        
       
}




