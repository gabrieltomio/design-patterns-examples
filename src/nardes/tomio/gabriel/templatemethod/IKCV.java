package nardes.tomio.gabriel.templatemethod;

public class IKCV extends AbstractVariableTax {

	@Override
	public boolean useMaximunTax(final Budget budget) {
		return budget.getValue() > 500 && budget.getQuantityOfItems() > 100;
	}

	@Override
	public double minimumTax(final Budget budget) {
		return budget.getValue() * 0.06;
	}

	@Override
	public double maximumTax(final Budget budget) {
		return budget.getValue() * 0.1;
	}

}
