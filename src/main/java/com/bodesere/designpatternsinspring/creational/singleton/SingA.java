package com.bodesere.designpatternsinspring.creational.singleton;

/**
 * TODO Describe this class.
 * @since 2021-10-01
 * @author burak kilinc
 */
public class SingA {
    private static SingA instance;

    private SingA() {
        super();
    }

    public static SingA getInstance() {
        if (null == instance) {
            synchronized (SingA.class) {
                if (null == instance) {
                    instance = new SingA();
                }
            }
        }
        return instance;
    }
}
