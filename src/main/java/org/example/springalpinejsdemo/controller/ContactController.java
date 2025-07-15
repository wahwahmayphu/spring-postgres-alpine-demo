package org.example.springalpinejsdemo.controller;

import org.example.springalpinejsdemo.model.Contact;
import org.example.springalpinejsdemo.repository.ContactRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    @PostMapping
    public Contact saveContact(@RequestBody Contact contact){
        return contactRepository.save(contact);
    }
}
