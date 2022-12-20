package com.bootcamp.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "client")
public class Client {

	@EqualsAndHashCode.Include
	@Id
	private String id;
	private String codClient;
	private FullName fullName;
	private Identity identity;
	private Contact contact;

	private String typeClient;
	private String dateCreated;
	private Boolean status;

}