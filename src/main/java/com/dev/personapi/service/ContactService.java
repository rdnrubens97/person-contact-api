package com.dev.personapi.service;

import com.dev.personapi.controller.ContactController;
import com.dev.personapi.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;
}
