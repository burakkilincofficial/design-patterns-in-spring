package com.bodesere.designpatternsinspring.singleton;

import com.bodesere.designpatternsinspring.creational.singleton.SingA;
import com.bodesere.designpatternsinspring.creational.singleton.SingB;
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
public class SingletonTest {
    @Autowired
    SingB singB1;
    @Autowired
    SingB singB2;

    @Test
    void testSingletons() {
        SingA singA1 = SingA.getInstance();
        SingA singA2 = SingA.getInstance();
        Assertions.assertNotNull(singA1);
        Assertions.assertNotNull(singA2);
        Assertions.assertSame(singA1, singA2);
        Assertions.assertNotNull(singB1);
        Assertions.assertNotNull(singB2);
        Assertions.assertSame(singB1, singB2);
    }


}
