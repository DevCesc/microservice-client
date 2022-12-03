package com.bootcamp.service;

import com.bootcamp.entity.Client;
import reactor.core.publisher.Mono;

public interface ClientService {

	public Mono<Client> saveClient(Client client);
	
	public Mono<Boolean> getOneClient(String codClient);
	
	
	
}
