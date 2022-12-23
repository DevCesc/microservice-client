package com.bootcamp.clientService;

import com.bootcamp.repository.ClientRepository;
import com.bootcamp.service.ClientServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ClientServiceImplTest {

    @InjectMocks
    ClientServiceImpl service;

    @Mock
    ClientRepository repository;

    @BeforeEach
    void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSave(){
        
//        fail("Not yet implemented");
    }

}
