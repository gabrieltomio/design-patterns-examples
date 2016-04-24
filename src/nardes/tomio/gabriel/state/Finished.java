package nardes.tomio.gabriel.state;

class Finished implements StateBudget {

	@Override
	public void applyExtraDiscount(final Budget budget) {
		throw new RuntimeException("Orçamento finalizado não recebe desconto");
	}

	@Override
	public void approve(final Budget budget) {
		throw new RuntimeException("Não pode-se voltar de finalizado para aprovado");
	}

	@Override
	public void disapprove(final Budget budget) {
		throw new RuntimeException("Não pode-se voltar de finalizado para reprovado");
	}

	@Override
	public void conclude(final Budget budget) {
		throw new RuntimeException("O orçamento já está finalizado");
	}

}
