package nardes.tomio.gabriel.strategy;

public final class ICMS implements Tax {

	@Override
	public double calculate(final Budget budget) {
		return (budget.getValue() * 0.05) + 50;
	}
}
