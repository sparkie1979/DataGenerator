package datagenerator.strategy;

import org.apache.commons.logging.Log;


public abstract class DataGeneratorStrategy<T> {
	
	/**
	 * It is expected that the implementing class sets up the logger
	 */
	protected Log logger;
	
	protected T data;
	
	protected DataGeneratorStrategy(Log logger) {
		this.logger = logger;
	}
	
	/**
	 * Get the type of data that this strategy produces (e.g. First Name, Last Name, Address or Post Code  
	 * @return The type of data this Strategy produces
	 */
	public String getType() {
		String typeName = this.getClass().getName();
		logger.trace("Type name from class: " + typeName);
		
		// We add one as if no . is found this function returns '-1'
		int firstChar = typeName.lastIndexOf('.') + 1;
		
		if(firstChar > 0) {
			logger.trace("Package Name detected, removing...");
			typeName = typeName.substring(firstChar);
			logger.trace("\t=>New value of type name: " + typeName);
		}
		
		if(typeName.toLowerCase().endsWith("strategy")) {
			int startOfStrategy = typeName.toLowerCase().lastIndexOf("strategy");
			
			typeName = typeName.substring(0, startOfStrategy);
		}
		
		return typeName;
		
	}
	
	/**
	 * Get a description of what this data type will produce - Allows GUIs to show the description
	 * @return The description of the type of data this strategy produces
	 */
	public abstract String getDescription();
	
	/**
	 * Get the class of the data that this strategy will produce
	 * @return The class of the data type returned by this strategy
	 */
	@SuppressWarnings("unchecked")
	public Class<T> getDataClass() {
		return (Class<T>) data.getClass();
	}
	
	/**
	 * Get a generated item of data
	 * @return The generated data item
	 */
	public abstract T getData();

	
}
