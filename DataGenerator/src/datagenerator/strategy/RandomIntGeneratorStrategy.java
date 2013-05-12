/**
 * 
 */
package datagenerator.strategy;

import java.util.Random;

import org.apache.commons.logging.LogFactory;

/**
 * <p>Provides a Random Integer Generating Strategy for use with {@link datagenerator.DataGenerator}
 * 
 * <p> The integer will be from all integers between the minimum and maximum (inclusive) values specified 
 * 
 * @author Sparks
 *
 */
public class RandomIntGeneratorStrategy extends DataGeneratorStrategy<Integer>{
	
	private int min = 0;
	private int max = 10;
	private Random random;
	

	/**
	 * Construct a Random Int Generator
	 * @param min The minimum integer value to produce
	 * @param max The maximum integer value to produce
	 */
	public RandomIntGeneratorStrategy(int min, int max) {
		this();
		this.min = min;
		this.max = max;
		
	}
	
	/**
	 * Construct a Random Int Generator with default values of:
	 * Min: 0
	 * Max: 10
	 */
	public RandomIntGeneratorStrategy() {
		super(LogFactory.getLog(RandomIntGeneratorStrategyTest.class));
		random = new Random();
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getDescription() {
		return "Generates an integer number between the specified minimum (default: 0) and maximum (default: 10) values";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getData() {
		
		// Generate a random number
		// we use max-min as that gives us the range that the number should be generated from 
		// and add 1 as it is inclusive of the max value specified
		int generated = random.nextInt(max-min+1);
		
		// we then return the generated number added to min
		this.data = min+generated;
		return this.data;
	}

}
