package org.consumer.advice;

import org.consumer.exception.ConsumerBeansNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ConsumerBeansNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(ConsumerBeansNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	
	String ConsumerBeansNotFoundHandler(ConsumerBeansNotFoundException exception) {
		return exception.getMessage();
	}
}
