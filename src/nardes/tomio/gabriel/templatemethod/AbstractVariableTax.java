package nardes.tomio.gabriel.templatemethod;


public abstract class AbstractVariableTax implements Tax {
	
	@Override
	public final double calculate(final Budget budget) {
		
		if(useMaximunTax(budget)) {
			return maximumTax(budget);
		} else {
			return minimumTax(budget);
		}
	}
	
	public abstract boolean useMaximunTax(Budget budget);
	
	public abstract double minimumTax(Budget budget);
	
	public abstract double maximumTax(Budget budget);
}
