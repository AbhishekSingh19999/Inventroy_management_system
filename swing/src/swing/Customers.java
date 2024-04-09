package swing;

public class Customers{

	private String Cusemail;
	private String CusPassword;
	private String CusName;
	private long CusPhone;
	
	
	
	public String getCusemail() {
		return Cusemail;
	}
	public void setCusemail(String cusemail) {
	this.Cusemail = cusemail;
	}
	public String getCusPassword() {
		return CusPassword;
	}
	public void setCusPassword(String cusPassword) {
	this.CusPassword = cusPassword;
	}
	public String getCusName() {
		return CusName;
	}
	public void setCusName(String cusName) {
	this.CusName = cusName;
	}
	public long getCusPhone() {
		return CusPhone;
	}
	public void setCusPhone(long cusPhone) {
	this.CusPhone = cusPhone;
	}
	@Override
	public String toString() {
		return "Customers [Cusemail=" + Cusemail + ", CusPassword=" + CusPassword + ", CusName=" + CusName + ", CusPhone="
				+ CusPhone + "]";
	}
	
	
	
}  
