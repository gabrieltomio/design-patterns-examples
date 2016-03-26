package nardes.tomio.gabriel.strategy;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TaxCalculatorTest {
	
	private Tax tax;
	private static TaxCalculator taxCalculator;
	
	@BeforeClass
	public static void setUpClass() {
		taxCalculator = new TaxCalculator();
	}
	
	@Test
	public void testPerformsCalculationWithICCC01() {
		this.tax = new ICCC();
		
		Budget budget = new Budget(100);
		double taxValue = taxCalculator.performsCalculation(this.tax, budget);

		Assert.assertEquals(5, taxValue, 10);
	}
	
	@Test
	public void testPerformsCalculationWithICCC02() {
		this.tax = new ICCC();
		
		Budget budget = new Budget(1500);
		double taxValue = taxCalculator.performsCalculation(this.tax, budget);

		Assert.assertEquals(105, taxValue, 10);
	}
	
	@Test
	public void testPerformsCalculationWithICCC03() {
		this.tax = new ICCC();
		
		Budget budget = new Budget(3500);
		double taxValue = taxCalculator.performsCalculation(this.tax, budget);

		Assert.assertEquals(58, taxValue, 10);
	}
	
	@Test
	public void testPerformsCalculationWithICMS() {
		this.tax = new ICMS();
		
		Budget budget = new Budget(100);
		double taxValue = taxCalculator.performsCalculation(this.tax, budget);

		Assert.assertEquals(55, taxValue, 10);
	}

	@Test
	public void testPerformsCalculationWithISS() {
		this.tax = new ISS();
		
		Budget budget = new Budget(100);
		double taxValue = taxCalculator.performsCalculation(this.tax, budget);

		Assert.assertEquals(60, taxValue, 10);
	}
}
