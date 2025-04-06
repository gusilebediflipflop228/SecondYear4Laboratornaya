package org.example;

public class Division implements IntervalInterface {
    private final double a, b, c, d, hightRange, lowerRange;

    public Division(double a, double b, double c, double d, double lowerRange, double hightRange) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.hightRange = hightRange;
        this.lowerRange = lowerRange;
    }

    @Override
    public double solution(double x) {
        if (x <= hightRange && x >= lowerRange) {
            return (a * x + b) / (c * x + d);
        }
        else {
            throw new IllegalArgumentException("аргумент выходит за границы диапозона");
        }
    }


    @Override
    public double getHightRange() {
        return hightRange;
    }

    @Override
    public double getLowerRange() {
        return lowerRange;
    }
}
