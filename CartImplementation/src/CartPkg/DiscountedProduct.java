package CartPkg;

public class DiscountedProduct extends Product {
	private Product original;
	private double discount;
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public DiscountedProduct(Product original, double discount) throws IllegalArgumentException {
		super(original);
		if (!original.canBeReduced()) {
			throw new IllegalArgumentException("Questo prodotto non può essere scontato!");
		}
		this.discount = discount;
		this.original = original;
	}
	@Override public double getPrice(Cart cart) {
		return (original.getPrice(cart) - ((original.getPrice(cart) * discount) / 100));
	}
	@Override public String toString() {
		return original.toString() + "Scontato del " + discount + "%";
	}
}