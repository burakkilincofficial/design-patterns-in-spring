package com.bodesere.designpatternsinspring.creational.builder;

/**
 * TODO Describe this class.
 * @since 2021-10-01
 * @author burak kilinc
 */
public class ContactBuilder {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public ContactBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;

    }

    public ContactBuilder setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;

    }

    public Contact buildContact() {
        return new Contact(firstName, lastName, emailAddress);
    }
}
