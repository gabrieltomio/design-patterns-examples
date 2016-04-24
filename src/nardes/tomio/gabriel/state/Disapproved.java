package nardes.tomio.gabriel.state;

class Disapproved implements StateBudget {

	@Override
	public void applyExtraDiscount(final Budget budget) {
		throw new RuntimeException("Orçamento reprovado não tem desconto");
	}

	@Override
	public void approve(final Budget budget) {
		throw new RuntimeException("Não pode-se passar o estado de reprovado para aprovado");
	}

	@Override
	public void disapprove(final Budget budget) {
		throw new RuntimeException("O estado do orçamento já está reprovado");
	}

	@Override
	public void conclude(final Budget budget) {
		budget.setStateBudget(new Finished());
	}

}