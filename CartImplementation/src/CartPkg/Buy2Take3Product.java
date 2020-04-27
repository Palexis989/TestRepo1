package CartPkg;

public class Buy2Take3Product extends Product {
	private Product original;

	public Buy2Take3Product(Product original) throws IllegalArgumentException {
		super(original);
		if (!original.canBeReduced()) {
			throw new IllegalArgumentException("Questo prodotto non può essere scontato!");
		}
		this.original = original;
	}
	@Override public boolean canBeReduced() { 
		return false;
	}
	@Override public double getPrice(Cart cart) {
		int counter = 0;

		for (Product local : cart.getProducts()) {
			if (local == this.original) {
				counter ++;
			}    
		}
		int free = counter / 3;
		return (counter - free) * original.getPrice(cart) / counter;
	}
}