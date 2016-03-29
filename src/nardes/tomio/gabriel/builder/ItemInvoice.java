package nardes.tomio.gabriel.builder;

public final class ItemInvoice {
	
	private final String name;
	private final double value;

	public ItemInvoice(final String name, final double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public double getValue() {
		return value;
	}

}
