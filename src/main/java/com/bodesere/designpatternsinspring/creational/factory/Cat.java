package com.bodesere.designpatternsinspring.creational.factory;

/**
 * Cat Class
 * @since 2021-10-01
 * @author burak kilinc
 */
public class Cat implements Pet {
    private String name;
    private boolean isHungry;
    private String type;

    public Cat() {
        this.type = "Cat";
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
