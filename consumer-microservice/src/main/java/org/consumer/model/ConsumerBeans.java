package org.consumer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class ConsumerBeans {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String password;
	
	public ConsumerBeans(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public ConsumerBeans() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
