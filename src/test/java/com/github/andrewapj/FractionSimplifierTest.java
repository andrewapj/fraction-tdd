package com.github.andrewapj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FractionSimplifierTest {

    private FractionSimplifier simplifier;

    @BeforeEach
    void setup(){
        simplifier = new FractionSimplifier();
    }

    @ParameterizedTest
    @CsvSource({
        "18,40,9,20",
        "10,2,5,1",
        "98,40,49,20",
        "1,5,1,5",
    }
    )
    void should_Simplify_Fractions(int nominator1, int denominator1, int nominator2, int denominator2){
        assertEquals(
            new Fraction(nominator2, denominator2),
            simplifier.simplify(new Fraction(nominator1, denominator1)));
    }
}
