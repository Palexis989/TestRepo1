package CartPkg;

public class Product {
	private String seller, name;
	private double price;

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Product(String seller, String name, double price) { 
		this.seller = seller;
		this.name = name;
		this.price = price;
	}
	protected Product(Product original) { 
		this.seller = original.seller;
		this.name = original.name;
		this.price = original.price;
	}
	public final String getSeller() { 
		return seller;
	}
	public final String getName() { 
		return name;
	}
	public double getPrice(Cart cart) { 
		return price;
	}
	public boolean canBeReduced() { 
		return true;
	}

	@Override public String toString() {
		return getName();
	}
}
