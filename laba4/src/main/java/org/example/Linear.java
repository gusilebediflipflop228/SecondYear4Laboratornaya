package org.example;

public class Linear implements IntervalInterface {
    private final double a, b, hightRange, lowerRange;

    public Linear(double a, double b, double lowerRange, double hightRange) {
        this.a = a;
        this.b = b;
        this.hightRange = hightRange;
        this.lowerRange = lowerRange;
    }

    @Override
    public double solution(double x) {
        if (x <= hightRange && x >= lowerRange) {
            return a * x + b;
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
