package com.dev.personapi.controller;

import com.dev.personapi.repository.ContactRepository;
import com.dev.personapi.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @Autowired
    private ContactService contactService;
}
