package StreamAPI_product;

import java.util.*;

public class StreamAPI7Product {
	public static void main(String[] args) {
		List <ProductBean> product = new ArrayList<ProductBean>();
		product.add(new ProductBean(1,"hp",25000));
		product.add(new ProductBean(1,"dell",75000));
		product.add(new ProductBean(1,"lenovo",50000));
		product.add(new ProductBean(1,"apple",250000));
		product.stream().filter(myproduct->myproduct.getPrice()>=50000).forEach(System.out::println);
	}
}
