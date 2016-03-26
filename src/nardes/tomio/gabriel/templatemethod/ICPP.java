package nardes.tomio.gabriel.templatemethod;

public class ICPP extends AbstractVariableTax {

	@Override
	public boolean useMaximunTax(final Budget budget) {
		return budget.getValue() > 500;
	}

	@Override
	public double minimumTax(final Budget budget) {
		return budget.getValue() * 0.05;
	}

	@Override
	public double maximumTax(final Budget budget) {
		return budget.getValue() * 0.07;
	}

}
