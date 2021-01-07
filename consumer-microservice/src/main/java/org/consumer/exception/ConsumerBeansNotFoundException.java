package org.consumer.exception;

public class ConsumerBeansNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConsumerBeansNotFoundException(Long id) {
		super("Could not find Consumer " + id);
	}

}
