package com.bodesere.designpatternsinspring.creational.controller;

import com.bodesere.designpatternsinspring.creational.builder.Contact;
import com.bodesere.designpatternsinspring.creational.builder.ContactBuilder;
import com.bodesere.designpatternsinspring.creational.factory.PathFactory;
import com.bodesere.designpatternsinspring.creational.factory.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * App Controller
 * @since 2021-10-01
 * @author burak kilinc
 */
@RestController
@RequestMapping("/")
public class AppController {
    @Autowired
    private PathFactory pathFactory;


    @GetMapping
    public String getDefault() {
        return "{\"message\": \"Hello World\"}";
    }

    @PostMapping("adoptPet/{type}/{name}")
    public Pet adoptPet(@PathVariable() String type, @PathVariable() String name) {
        Pet pet = pathFactory.createPet(type);
        pet.setName(name);
        pet.feed();
        return pet;
    }

    @GetMapping("presidents")
    public List<Contact> getPresidents() {
        List<Contact> contactList = new ArrayList<>();
        Contact contact = new Contact();
        contact.setFirstName("Mustafa Kemal");
        contact.setLastName("Ataturk");
        contactList.add(contact);

        contactList.add(new Contact("Ismet", "Inonu", null));
        contactList.add(new ContactBuilder().setFirstName("Celal").setLastName("Bayar").setEmailAddress("").buildContact());
        return contactList;
    }


}
