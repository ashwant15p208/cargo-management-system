package org.order;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PRODUCT")
public class Product {
	@Id
	@GeneratedValue
	private int ProdId;
	private String ProdName;
	private String ProdPrice;
	private String ProdDesc;
	private String ProdSeller;
	
	public String getProdDesc() {
		return ProdDesc;
	}
	public void setProdDesc(String prodDesc) {
		ProdDesc = prodDesc;
	}
	public String getProdSeller() {
		return ProdSeller;
	}
	public void setProdSeller(String prodSeller) {
		ProdSeller = prodSeller;
	}
	public int getProdId() {
		return ProdId;
	}
	public void setProdId(int prodId) {
		ProdId = prodId;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public String getProdPrice() {
		return ProdPrice;
	}
	public void setProdPrice(String prodPrice) {
		ProdPrice = prodPrice;
	}

}