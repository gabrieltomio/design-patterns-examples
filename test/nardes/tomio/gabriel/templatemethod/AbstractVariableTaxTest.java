package nardes.tomio.gabriel.templatemethod;

import org.junit.Assert;
import org.junit.Test;


public class AbstractVariableTaxTest {

	@Test
	public void testCalculateWithICPPMaxTax() {
		Budget budget = new Budget(1000, 0);
		
		Tax icpp = new ICPP();
		double value = icpp.calculate(budget);
		
		Assert.assertEquals(70, value, 10);
	}
	
	@Test
	public void testCalculateWithICPPMinTax() {
		Budget budget = new Budget(100, 0);
		
		Tax icpp = new ICPP();
		double value = icpp.calculate(budget);
		
		Assert.assertEquals(5, value, 10);
	}
	
	@Test
	public void testCalculateWithIKCVMaxTax() {
		Budget budget = new Budget(1000, 150);
		
		Tax icpp = new IKCV();
		double value = icpp.calculate(budget);
		
		Assert.assertEquals(100, value, 10);
	}
	
	@Test
	public void testCalculateWithIKCVMinTax01() {
		Budget budget = new Budget(1000, 50);
		
		Tax icpp = new IKCV();
		double value = icpp.calculate(budget);
		
		Assert.assertEquals(60, value, 10);
	}
	
	@Test
	public void testCalculateWithIKCVMinTax02() {
		Budget budget = new Budget(100, 150);
		
		Tax icpp = new IKCV();
		double value = icpp.calculate(budget);
		
		Assert.assertEquals(6, value, 10);
	}
}
