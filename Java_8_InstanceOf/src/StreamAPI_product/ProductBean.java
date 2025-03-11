package StreamAPI_product;

import java.io.Serializable;

public class ProductBean implements Serializable{
	private int pno;
	private String pname;
	private int price;
	public ProductBean() {
		//Default
	}
	public ProductBean(int pno, String pname, int price) {
		pno = this.pno;
		pname = this.pname;
		price = this.price;
	}
	public int getPno() {
		return pno;
	}
	public String getPname() {
		return pname;
	}
	public double getPrice() {
		return price;
	}
}
