package com.gabriel.mdd.arch.in.layers.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.mdd.arch.in.layers.domain.InterfaceClientDomain;
import com.gabriel.mdd.arch.in.layers.infra.ClientEntity;

@RestController
@RequestMapping("/client")
public class ClientRest {

    @Autowired
    private InterfaceClientDomain clientDomain;

    @PostMapping
    public ResponseEntity<ClientEntity> createClient(@RequestBody ClientEntity clientEntity) {
        return clientDomain.create(clientEntity);
    }
    
}
