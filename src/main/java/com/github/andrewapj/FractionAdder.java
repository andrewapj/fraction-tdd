package com.github.andrewapj;

class FractionAdder {
    Fraction add(final Fraction fraction1, final Fraction fraction2){
        return new Fraction(
            ( fraction1.getNumerator() * fraction2.getDenominator()) +
                (fraction1.getDenominator() * fraction2.getNumerator()),
            ( fraction1.getDenominator() * fraction2.getDenominator()));
    }
}
