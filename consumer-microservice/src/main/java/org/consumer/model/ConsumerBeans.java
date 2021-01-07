package org.consumer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
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
	
}
