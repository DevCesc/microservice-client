package com.bootcamp.controller;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.entity.Client;
import com.bootcamp.service.ClientService;

import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
public class ClientController {

	private static Logger log = Logger.getLogger(ClientController.class);
	
	@Autowired
	private ClientService clientService;
	
	
	@PostMapping(value= "/save")
	public Mono<ResponseEntity<Client>> saveClient(@RequestBody Client client){
		log.info(client);
		return clientService.saveClient(client)
				.map(e -> ResponseEntity
						.created(URI.create("/api/v1/clients".concat("/").concat(e.getId())))
						.contentType(MediaType.APPLICATION_JSON)
						.body(e)
				);
	}
	
	@GetMapping(value = "/checkClient/{CodCli}")
	public Mono<Boolean> checkClient(@PathVariable String CodCli){
		return clientService.getOneClient(CodCli);
	}
	
}
