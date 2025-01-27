package com.jad;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ICorgeTest {
    private static final int NB_OF_FIELDS = 0;
    private static final int NB_OF_NON_CONSTRUCTOR_METHOD = 2;
    private static Class<?> iCorgeClass;

    @BeforeAll
    static void beforeAll() {
        ICorgeTest.iCorgeClass = Utils.testIfClassExists("com.jad.ICorge");
    }

    @Test
    void doAllTests() {
        this.interfaceTest();
        this.countMethodsTest();
        this.hasGetFooMethodTest();
        this.hasSetFooMethodTest();
    }

    @Test
    void interfaceTest() {
        Utils.testIfIsAnInterface(ICorgeTest.iCorgeClass);
    }

    @Test
    void countMethodsTest() {
        Utils.testCountNonConstructorMethods(ICorgeTest.iCorgeClass, ICorgeTest.NB_OF_NON_CONSTRUCTOR_METHOD);
    }

    @Test
    void hasGetFooMethodTest() {
        Utils.testIfMethodExists(ICorgeTest.iCorgeClass, "getFoo");
    }

    @Test
    void hasSetFooMethodTest() {
        Utils.testIfMethodExists(ICorgeTest.iCorgeClass, "setFoo");
    }
}