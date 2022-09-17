package br.com.estudo.service;

import br.com.estudo.model.Client;
import br.com.estudo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void save(Client client){
        validate(client);
        clientRepository.save(client);
    }

    public void validate(Client client){

    }

}
