package nardes.tomio.gabriel.builder;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceBuilderTest {

	@Test
	public void testBuild() {
		InvoiceBuilder invoiceBuilder = new InvoiceBuilder();
		
		
		Invoice invoice = invoiceBuilder.forEnterprise("teste")
					  .withId("xxx")
					  .withNote("New")
					  .with(new ItemInvoice("A", 20))
					  .with(new ItemInvoice("B", 40))
					  .with(new ItemInvoice("C", 60))
					  .build();
		
		
		Assert.assertEquals("xxx", invoice.getId());
		Assert.assertEquals("teste", invoice.getCompanyName());
		Assert.assertEquals("New", invoice.getNote());
		Assert.assertEquals(120, invoice.getGross(), 10);
		Assert.assertEquals(6, invoice.getTax(), 10);
		
	}
}
