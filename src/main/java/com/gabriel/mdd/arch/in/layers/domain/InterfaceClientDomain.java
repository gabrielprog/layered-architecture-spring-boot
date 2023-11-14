package com.gabriel.mdd.arch.in.layers.domain;

import org.springframework.http.ResponseEntity;

import com.gabriel.mdd.arch.in.layers.infra.ClientEntity;

public interface InterfaceClientDomain {
    ResponseEntity<ClientEntity> create(ClientEntity clientEntity);
}
