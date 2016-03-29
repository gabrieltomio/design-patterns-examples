package nardes.tomio.gabriel.builder;

import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public final class Invoice {

	private final String companyName;
	private final String id;
	private final Calendar date;
	private final List<ItemInvoice> items;
	private final double tax;
	private final double gross;
	private final String note;

	public Invoice(final String companyName, final String id, final Calendar date, final List<ItemInvoice> items, final double tax, final double gross, final String note) {
		this.companyName = companyName;
		this.id = id;
		this.date = date;
		this.items = items;
		this.tax = tax;
		this.gross = gross;
		this.note = note;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getId() {
		return id;
	}

	public Calendar getDate() {
		return date;
	}

	public List<ItemInvoice> getItems() {
		return Collections.unmodifiableList(items);
	}

	public double getTax() {
		return tax;
	}

	public double getGross() {
		return gross;
	}

	public String getNote() {
		return note;
	}

}
