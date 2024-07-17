package com.fanainaalves.components.repository;

import com.fanainaalves.components.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client save(Client client);
}
