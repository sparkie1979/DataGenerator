/**
 * 
 */
package datagenerator.strategy;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

/**
 * @author Mark
 *
 */
public class DataGeneratorStrategyTest {
	
	private static Log logger = LogFactory.getLog(DataGeneratorStrategyTest.class);
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link datagenerator.strategy.DataGeneratorStrategy#getType()}.
	 * 
	 * Tests that the correct type is returned for the class
	 */
	@Test
	public void testGetType() {
		
		DataGeneratorStrategy<String> dataGeneratorStrategy = new MockDataGeneratorStrategy<String>();
		String expected = "MockDataGenerator";
		String actual = dataGeneratorStrategy.getType();
		logger.debug("Type returned: " + actual);
		
		String errorMessage = "Wrong type returned, expected: " + expected + " actual: " + actual;
		
		assertEquals(errorMessage, expected, actual);
	}

}
