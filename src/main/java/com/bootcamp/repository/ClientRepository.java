package com.bootcamp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.entity.Client;



@Repository
public interface ClientRepository extends ReactiveCrudRepository<Client, ObjectId> {

	//Mono<Client> save(Client client);
	
	
}