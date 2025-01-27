package com.jad;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class IBazTest {
    private static final int NB_OF_FIELDS = 0;
    private static final int NB_OF_NON_CONSTRUCTOR_METHOD = 1;
    private static Class<?> iBazClass;

    @BeforeAll
    static void beforeAll() {
        IBazTest.iBazClass = Utils.testIfClassExists("com.jad.IBaz");
    }

    @Test
    void doAllTests() {
        this.interfaceTest();
        this.countMethodsTest();
        this.hasDoSomethingLikeABazMethodTest();
    }

    @Test
    void interfaceTest() {
        Utils.testIfIsAnInterface(IBazTest.iBazClass);
    }

    @Test
    void countMethodsTest() {
        Utils.testCountNonConstructorMethods(IBazTest.iBazClass, IBazTest.NB_OF_NON_CONSTRUCTOR_METHOD);
    }

    @Test
    void hasDoSomethingLikeABazMethodTest() {
        Utils.testIfMethodExists(IBazTest.iBazClass, "doSomethingLikeABaz");
    }
}