package com.gabriel.mdd.arch.in.layers.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gabriel.mdd.arch.in.layers.infra.ClientEntity;
import com.gabriel.mdd.arch.in.layers.infra.ClientRepository;

@Service
public class ClientDomain implements InterfaceClientDomain {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ResponseEntity<ClientEntity> create(ClientEntity clientEntity) {

        if(clientEntity.getAge() < 18) return ResponseEntity
                            .status(HttpStatus.NOT_ACCEPTABLE)
                            .body(clientEntity);

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(clientRepository.save(clientEntity));
    }
    
}
