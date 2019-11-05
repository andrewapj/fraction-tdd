package com.github.andrewapj;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FractionTest {

    /*
     * Create
     */
    @Test
    void should_CreateFraction(){
        new Fraction(7, 3);
    }

    /*
     * Equals
     */
    @Test
    void should_HaveEqualFractions(){
        assertEquals(new Fraction(1, 2), new Fraction(1, 2));
    }


    /*
     * Invalid Fractions
     */
    @Test
    void should_FailOnInvalidDenominator(){
        assertThrows(IllegalArgumentException.class,
            () -> new Fraction(1, 0));
    }

    /*
     * Add
     */
    @Test
    void should_AddFraction(){
        assertEquals(
            new Fraction(47,15),
            new Fraction(7,3).add( new Fraction(4,5)));
    }

    @Test
    void should_AddSimpleFraction(){
        assertEquals(
            new Fraction(5,6),
            new Fraction(1,2).add( new Fraction(1,3)));
    }

    @Test
    void should_AddFractionAndSimplify(){
        assertEquals(
            new Fraction(9,20),
            new Fraction(1,5).add( new Fraction(2,8)));
    }
}
