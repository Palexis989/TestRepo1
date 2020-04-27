package CartPkg;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	// i prodotti contenuti in questo carrello
	private List<Product> products = new ArrayList<Product>();

	public void addProduct(Product product) { 
		    this.products.add(product);
	}

	public void addProducts(List<Product> products) { 
		for(Product product : products)
			addProduct(product);
	}
	public void addProduct(Product product, int howManyTimes) { 
		for (int counter = 1; counter <= howManyTimes; counter++) {
			addProduct(product);
		}
	}

	@Override
	public String toString() {
		String result = "";
		for (Product product: getProducts())
			result += product + "    " + String.format("%.2f euro", product.getPrice(this)) + ". Venduto da " + product.getSeller() + "\n";
		return result;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}
	
	
}