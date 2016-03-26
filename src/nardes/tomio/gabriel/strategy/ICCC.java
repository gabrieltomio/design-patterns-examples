package nardes.tomio.gabriel.strategy;

public final class ICCC implements Tax {

	@Override
	public double calculate(final Budget budget) {
		final double value = budget.getValue();

		if (value < 1000) {
			return value * 0.05;
		}

		if (value >= 1000 && value <= 3000) {
			return value * 0.07;
		}

		return (value * 0.008) + 30;
	}

}
