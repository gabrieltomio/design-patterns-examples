package nardes.tomio.gabriel.templatemethod;

public final class Budget {
	private final double value;
	private final int quantityOfItems;
	
	public Budget(final double value, final int items) {
		this.value = value;
		this.quantityOfItems = items;
	}

	public double getValue() {
		return value;
	}
	
	public int getQuantityOfItems() {
		return quantityOfItems;
	}
}
