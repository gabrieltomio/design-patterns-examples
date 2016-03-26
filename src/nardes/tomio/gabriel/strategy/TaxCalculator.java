package nardes.tomio.gabriel.strategy;

public final class TaxCalculator {

	public double  performsCalculation(Tax tax, Budget budget) {
		return tax.calculate(budget);
	}
}
