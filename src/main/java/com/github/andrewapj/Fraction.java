package com.github.andrewapj;

import java.util.Objects;

public class Fraction {

    private final int numerator;
    private final int denominator;

    private final FractionAdder adder = new FractionAdder();
    private final FractionSimplifier simplifier = new FractionSimplifier();

    public Fraction(int numerator, int denominator) {
        validate(denominator);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private void validate(int denominator) {
        if (denominator == 0){
            throw new IllegalArgumentException();
        }
    }

    public Fraction add(Fraction fraction) {
        return simplifier.simplify(adder.add(this, fraction));
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Fraction)) {
            return false;
        }
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator &&
            denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "" + numerator + "/" + denominator;
    }
}
