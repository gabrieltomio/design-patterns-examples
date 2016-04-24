package nardes.tomio.gabriel.state;

final class Budget {

	private double value;
	private StateBudget currentState;
	
	public Budget(final double value) {
		this.value = value;
		this.currentState = new Approvingly();
	}
	
	public void setStateBudget(final StateBudget stateBudget) {
		this.currentState = stateBudget;
	}
	
	public void applyExtraDiscount() {
		this.currentState.applyExtraDiscount(this);
	}
	
	public void approve() {
		this.currentState.approve(this);
	}
	
	public void disapprove() {
		this.currentState.disapprove(this);
	}
	
	public void conclude() {
		this.currentState.conclude(this);
	}

	public double getValue() {
		return this.value;
	}
	
	public void setValue(final double value) {
		this.value = value;
	}
}