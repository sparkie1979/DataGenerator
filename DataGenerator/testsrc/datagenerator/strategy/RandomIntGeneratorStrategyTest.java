package datagenerator.strategy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;
import static org.hamcrest.core.AllOf.allOf;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RandomIntGeneratorStrategyTest {
	
	/**
	 * The number of generations to run when testing getData
	 */
	private static int GENERATIONS = 100;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link datagenerator.strategy.RandomIntGeneratorStrategy#getType()}.
	 * 
	 * Test uses range of min value 1 to max value of 2 and ensures that all numbers generated are within that range
	 */
	@Test
	public void testGetData_smallRange() {
		
		int min = 1;
		int max = 2;
		
		RandomIntGeneratorStrategy strategy = new RandomIntGeneratorStrategy(min, max);
		
		for(int i = 0; i < GENERATIONS; i++) {
			int generated = strategy.getData();
			System.out.println(generated);
			assertThat(generated, allOf(lessThanOrEqualTo(max), greaterThanOrEqualTo(min)));
		}
		
	}
	@Test
	public void testGetType() {
		String expected = "RandomIntGenerator";
		
		RandomIntGeneratorStrategy strategy = new RandomIntGeneratorStrategy();
		
		assertEquals("Wrong Type Returned", expected, strategy.getType());
	}

}
