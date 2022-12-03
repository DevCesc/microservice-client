package com.bootcamp.entity;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "client")
public class Client {

	@Id
	private ObjectId id;
	private String codClient;
	private String name;
	private String phone;
	private int category;
	//private Date date_reg;

	
}
