package com.bodesere.designpatternsinspring.prototype;

import com.bodesere.designpatternsinspring.creational.prototype.ProtoFalse;
import com.bodesere.designpatternsinspring.creational.prototype.ProtoTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Singleton class tests
 * @since 2021-10-01
 * @author burak kilinc
 */
@SpringBootTest
public class PrototypeTest {
    @Autowired
    ProtoTrue true1;

    @Autowired
    ProtoTrue true2;

    @Autowired
    ProtoFalse false1;

    @Autowired
    ProtoFalse false2;

    @Test
    void testPrototypes() {
        Assertions.assertSame(false1, false2);
        Assertions.assertNotSame(true1, true2);
    }


}
