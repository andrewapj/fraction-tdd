package com.github.andrewapj;

class FractionSimplifier {

    Fraction simplify(Fraction fraction) {

        int commonDivisor = getCommonDivisor(fraction.getNumerator(), fraction.getDenominator());

        return new Fraction(
            fraction.getNumerator() / commonDivisor, fraction.getDenominator() / commonDivisor);
    }

    private int getCommonDivisor( int x, int y){

        int divisor = Math.min(x,y);

        while ((x % divisor != 0 || y % divisor != 0) && divisor != 1){
            divisor--;
        }
        return divisor;
    }
}
