package com.bootcamp.service;

import com.bootcamp.util.UtilMethods;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.entity.Client;
import com.bootcamp.repository.ClientRepository;
import reactor.core.publisher.Mono;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

@Service
public class ClientServiceImpl implements ClientService {

	private static Logger log = Logger.getLogger(ClientServiceImpl.class);
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Mono<Client> saveClient(Client client) {
		log.info("Service - Save Client");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		client.setDateCreated(simpleDateFormat.format(date));
		client.setCodClient(UtilMethods.generateRandomCodClient(8));
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
