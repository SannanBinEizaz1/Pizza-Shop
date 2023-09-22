package concept;

import static org.junit.Assert.*;

import org.junit.Test;

public class PriceTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		ChickenPizza chicken = new ChickenPizza(false,"","");
		Testcases tests = new Testcases();
		double result = tests.priceGetter(chicken);
		assertEquals(10.0,result);
	}

}
