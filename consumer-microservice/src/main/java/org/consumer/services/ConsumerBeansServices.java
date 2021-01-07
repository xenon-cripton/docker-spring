package org.consumer.services;

import java.util.List;

import org.consumer.model.ConsumerBeans;

public interface ConsumerBeansServices {

	public List<ConsumerBeans> showAllConsumer();
	public ConsumerBeans createConsumer(ConsumerBeans consumer);
	public ConsumerBeans showOneConsumer(Long id);
	public ConsumerBeans replaceConsumer(ConsumerBeans consumer, Long id);
	public void deleteConsumer(Long id);
}
