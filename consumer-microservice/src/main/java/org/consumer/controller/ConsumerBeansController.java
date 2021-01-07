package org.consumer.controller;

import java.util.List;

import org.consumer.exception.ConsumerBeansNotFoundException;
import org.consumer.model.ConsumerBeans;
import org.consumer.repository.ConsumerRepository;
import org.consumer.services.ConsumerBeansServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConsumerBeansController implements ConsumerBeansServices{

	private final ConsumerRepository repository;
	
	
	public ConsumerBeansController(ConsumerRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/consumers")
	public List<ConsumerBeans> showAllConsumer() {
		return repository.findAll();
	}

	@PostMapping("/consumers")
	public ConsumerBeans createConsumer(@RequestBody ConsumerBeans consumer) {
		return repository.save(consumer);
	}

	@GetMapping("/consumers/{id}")
	public ConsumerBeans showOneConsumer(@PathVariable Long id) {
		return repository.findById(id)
				.orElseThrow(
						() -> new ConsumerBeansNotFoundException(id)
						);
	}

	@PutMapping("/consumers/{id}")
	public ConsumerBeans replaceConsumer(@RequestBody ConsumerBeans consumer,@PathVariable Long id) {
		return repository.findById(id)
				.map(oldConsumer -> {
					oldConsumer.setName(consumer.getName());
					oldConsumer.setPassword(consumer.getPassword());
					return repository.save(oldConsumer);
				})
				.orElseGet(
						() -> {
							consumer.setId(id);
							return repository.save(consumer);
						}
						);
	}

	@DeleteMapping("/consumers/{id}")
	public void deleteConsumer(Long id) {
		repository.deleteById(id);
	}

}
