package com.bodesere.designpatternsinspring.creational.factory;

/**
 * TODO Describe this class.
 * @since 2021-10-01
 * @author burak kilinc
 */
public interface Pet {
    String getName();

    void setName(String name);

    String getType();

    boolean isHungry();

    void feed();

}
