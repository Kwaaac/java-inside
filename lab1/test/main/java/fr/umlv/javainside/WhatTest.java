package fr.umlv.javainside;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class WhatTest {

    @Test
    public void integerWhatTest() {
        assertEquals("Integer 1", What.what(1));
    }

    @Test
    public void stringWhatTest(){
        assertEquals("String bob", What.what("bob"));
    }

    @Test
    public void defaultWhatTest(){
        assertThrows(AssertionError.class, () -> What.what(Boolean.TRUE));
    }

    @Test
    public void nullObjectWhatTest(){
        assertThrows(NullPointerException.class, () -> What.what((null)));
    }
}