package nardes.tomio.gabriel.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class InvoiceBuilder {

	private String companyName;
	private String id;
	private LocalDate date;
	private List<ItemInvoice> items;
	private double tax;
	private double gross;
	private String note;

	public InvoiceBuilder() {
		items = new ArrayList<>();
		onDate(LocalDate.now());
	}

	public InvoiceBuilder forEnterprise(final String companyName) {
		this.companyName = companyName;
		return this;
	}

	public InvoiceBuilder withId(final String id) {
		this.id = id;
		return this;
	}

	public InvoiceBuilder onDate(final LocalDate date) {
		this.date = date;
		return this;
	}

	public InvoiceBuilder withNote(final String observacao) {
		this.note = observacao;
		return this;
	}

	public InvoiceBuilder with(final ItemInvoice item) {
		this.items.add(item);
		this.gross += item.getValue();
		this.tax += item.getValue() * 0.05;
		return this;
	}

	public Invoice build() {
		return new Invoice(this.companyName, this.id, this.date, this.items, this.tax, this.gross, this.note);
	}
}
