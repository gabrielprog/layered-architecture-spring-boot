package com.gabriel.mdd.arch.in.layers.infra;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
    
}
