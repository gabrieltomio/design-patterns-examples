package nardes.tomio.gabriel.state;

interface StateBudget {
	
	void applyExtraDiscount(Budget budget);
	void approve(Budget budget);
	void disapprove(Budget budget);
	void conclude(Budget budget);

}
