package com.hubspot.integration.web.controller;

import com.hubspot.integration.application.service.ContactService;
import com.hubspot.integration.web.dto.ContactDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping("/get")
    public String home() {
        return "Welcome !!!";
    }

    @PostMapping("/create")
    public String createContact(@RequestBody ContactDTO contactObj) {
        return this.contactService.createContactByNameAndEmail(contactObj);
    }
}
