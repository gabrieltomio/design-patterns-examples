package nardes.tomio.gabriel.strategy;

public final class ISS implements Tax {

	@Override
	public double calculate(final Budget budget) {
		return budget.getValue() * 0.6;
	}
}
