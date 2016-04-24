package nardes.tomio.gabriel.state;

class Approvingly implements StateBudget {
	
	private boolean isApplied = false;
	
	@Override
	public void applyExtraDiscount(final Budget budget) {
		if(!this.isApplied) {
			budget.setValue(budget.getValue() - budget.getValue() * 0.2);
			this.isApplied = true;
		} else {
			throw new RuntimeException("Desconto já foi aplicado no estado em aprovacao");
		}
	}

	@Override
	public void approve(final Budget budget) {
		budget.setStateBudget(new Approved());
	}

	@Override
	public void disapprove(final Budget budget) {
		budget.setStateBudget(new Disapproved());
	}

	@Override
	public void conclude(final Budget budget) {
		throw new RuntimeException("Orçamento em aprovação não pode ser finalizado");
	}

}
