package datagenerator.strategy;

import org.apache.commons.logging.LogFactory;

public class MockDataGeneratorStrategy<T> extends DataGeneratorStrategy<T> {

	public MockDataGeneratorStrategy() {
		super(LogFactory.getLog(MockDataGeneratorStrategy.class));
	}
	
	@Override
	public String getDescription() {
		logger.debug("getDescription not implemented for MockDataGeneratorStrategy, returning null...");
		return null;
	}


	@Override
	public T getData() {
		logger.debug("getData not implemented for MockDataGeneratorStrategy, returning null...");
		return null;
	}

}
