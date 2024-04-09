package swing;

public class Product 
{
	private String ProdId;
	private String ProdName;
	private int  ProdQuantity;
	private String ProdDescription;
	private String ProdCategory;
	private int  ProdPrice;
	public String getProdId() {
		return ProdId;
	}
	public void setProdId(String prodId) {
		ProdId = prodId;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public int getProdQuantity() {
		return ProdQuantity;
	}
	public void setProdQuantity(int prodQuantity) {
		ProdQuantity = prodQuantity;
	}
	public String getProdDescription() {
		return ProdDescription;
	}
	public void setProdDescription(String prodDescription) {
		ProdDescription = prodDescription;
	}
	public String getProdCategory() {
		return ProdCategory;
	}
	public void setProdCategory(String prodCategory) {
		ProdCategory = prodCategory;
	}
	public int getProdPrice() {
		return ProdPrice;
	}
	public void setProdPrice(int prodPrice) {
		ProdPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Product [ProdId=" + ProdId + ", ProdName=" + ProdName + ", ProdQuantity=" + ProdQuantity
				+ ", ProdDescription=" + ProdDescription + ", ProdCategory=" + ProdCategory + ",ProdPrice=" +ProdPrice+"]";
	}
}
