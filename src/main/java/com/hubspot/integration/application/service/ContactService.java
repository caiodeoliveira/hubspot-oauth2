package com.hubspot.integration.application.service;

import com.hubspot.integration.web.dto.ContactDTO;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ContactService {


    public String createContactByNameAndEmail(ContactDTO contactDTO) {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://api.hubapi.com/crm/v3/objects/contacts")
                .build();

        return webClient.post()
                .uri("")
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(contactDTO), ContactDTO.class)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}
