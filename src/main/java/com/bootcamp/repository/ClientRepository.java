package com.bootcamp.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.entity.Client;

@Repository
public interface ClientRepository extends ReactiveCrudRepository<Client, String> {

}