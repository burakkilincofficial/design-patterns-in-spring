package com.bodesere.designpatternsinspring.creational.factory;

import org.springframework.stereotype.Component;

/**
 * TODO Describe this class.
 * @since 2021-10-01
 * @author burak kilinc
 */
@Component
public class PathFactory {
    public Pet createPet(String animalType) {
        switch (animalType.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new UnsupportedOperationException("unknown animal type!");
        }
    }
}
