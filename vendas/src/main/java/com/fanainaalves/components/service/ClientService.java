package com.fanainaalves.components.service;

import com.fanainaalves.components.model.Client;
import com.fanainaalves.components.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {


    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void salvarCliente(Client client){
        validarCliente(client);
        this.clientRepository.save(client);
    }

    private void validarCliente(Client client){
        //validações
    }
}
