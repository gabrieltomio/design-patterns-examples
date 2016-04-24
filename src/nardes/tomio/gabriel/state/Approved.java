package nardes.tomio.gabriel.state;

class Approved implements StateBudget {

	private boolean isApplied = false;
	
	@Override
	public void applyExtraDiscount(final Budget budget) {
		if(!this.isApplied) {
			budget.setValue(budget.getValue() - budget.getValue() * 0.5);
			this.isApplied = true;
		} else {
			throw new RuntimeException("Desconto já aplicado no estado aprovado");
		}
	}

	@Override
	public void approve(final Budget budget) {
		throw new RuntimeException("O orçamento já está aprovado");
	}

	@Override
	public void disapprove(final Budget budget) {
		throw new RuntimeException("Orçamento aprovado não pode passar para reprovado");
	}

	@Override
	public void conclude(final Budget budget) {
		budget.setStateBudget(new Finished());
	}

}
