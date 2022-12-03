package com.bootcamp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.entity.Client;
import com.bootcamp.repository.ClientRepository;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService {

	private static Logger log = Logger.getLogger(ClientServiceImpl.class);
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Mono<Client> saveClient(Client client) {
		log.info("Service - Save Client");
		return clientRepository.save(client);
	}

	@Override
	public Mono<Boolean> getOneClient(String codClient) {
		log.info("Ingreso a getOneClient ");
		return  clientRepository.findAll()
				.filter(t -> t.getCodClient().equals(codClient))
				.next()
				.map(s->s.getCodClient().isEmpty()?false:true).switchIfEmpty(Mono.just(false)); 
	}

}
