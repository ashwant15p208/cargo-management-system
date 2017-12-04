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
	private String ProdId;
	private String ProdName;
	private String ProdPrice;
	private String ProdSeller;
	private String ProdAddress;
	private String ProdDescription;

	public String getProdId() {
		return ProdId;
	}

	public String getProdName() {
		return ProdName;
	}

	public String getProdPrice() {
		return ProdPrice;
	}

	public String getProdSeller() {
		return ProdSeller;
	}

	public String getProdAddress() {
		return ProdAddress;
	}

	public String getProdDescription() {
		return ProdDescription;
	}

	public void setProdId(String prodId) {
		ProdId = prodId;
	}

	public void setProdName(String prodName) {
		ProdName = prodName;
	}

	public void setProdPrice(String prodPrice) {
		ProdPrice = prodPrice;
	}

	public void setProdSeller(String prodSeller) {
		ProdSeller = prodSeller;
	}

	public void setProdAddress(String prodAddress) {
		ProdAddress = prodAddress;
	}

	public void setProdDescription(String prodDescription) {
		ProdDescription = prodDescription;
	}

}
