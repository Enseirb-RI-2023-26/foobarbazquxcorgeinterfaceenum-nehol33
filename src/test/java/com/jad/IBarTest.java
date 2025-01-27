package com.jad;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class IBarTest {
    private static final int NB_OF_FIELDS = 0;
    private static final int NB_OF_NON_CONSTRUCTOR_METHOD = 1;
    private static Class<?> iBarClass;

    @BeforeAll
    static void beforeAll() {
        IBarTest.iBarClass = Utils.testIfClassExists("com.jad.IBar");
    }

    @Test
    void doAllTests() {
        this.interfaceTest();
        this.countMethodsTest();
        this.hasDoSomethingLikeABarMethodTest();
    }

    @Test
    void interfaceTest() {
        Utils.testIfIsAnInterface(IBarTest.iBarClass);
    }

    @Test
    void countMethodsTest() {
        Utils.testCountNonConstructorMethods(IBarTest.iBarClass, IBarTest.NB_OF_NON_CONSTRUCTOR_METHOD);
    }

    @Test
    void hasDoSomethingLikeABarMethodTest() {
        Utils.testIfMethodExists(IBarTest.iBarClass, "doSomethingLikeABar");
    }
}