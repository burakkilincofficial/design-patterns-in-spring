package com.bodesere.designpatternsinspring.creational.factory;

/**
 * Dog Class
 * @since 2021-10-01
 * @author burak kilinc
 */
public class Dog implements Pet {
    private String name;
    private boolean isHungry;
    private String type;

    public Dog() {
        this.type = "Dog";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public boolean isHungry() {
        return this.isHungry;
    }

    @Override
    public void feed() {

    }
}
