package com.jad;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class IQuxTest {
    private static final int NB_OF_FIELDS = 0;
    private static final int NB_OF_NON_CONSTRUCTOR_METHOD = 1;
    private static Class<?> iQuxClass;

    @BeforeAll
    static void beforeAll() {
        IQuxTest.iQuxClass = Utils.testIfClassExists("com.jad.IQux");
    }

    @Test
    void doAllTests() {
        this.interfaceTest();
        this.countMethodsTest();
        this.hasDoSomethingLikeAQuxMethodTest();
    }

    @Test
    void interfaceTest() {
        Utils.testIfIsAnInterface(IQuxTest.iQuxClass);
    }

    @Test
    void countMethodsTest() {
        Utils.testCountNonConstructorMethods(IQuxTest.iQuxClass, IQuxTest.NB_OF_NON_CONSTRUCTOR_METHOD);
    }

    @Test
    void hasDoSomethingLikeAQuxMethodTest() {
        Utils.testIfMethodExists(IQuxTest.iQuxClass, "doSomethingLikeAQux");
    }
}