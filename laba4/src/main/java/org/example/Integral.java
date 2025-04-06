package org.example;

public class Integral<T extends IntervalInterface> implements Interface<T> {
    final double lowerRange, hightRange;

    public Integral(double a, double b) {
        this.lowerRange = a;
        this.hightRange = b;
    }

    @Override
    public double converting(T func) {
        if (lowerRange < func.getLowerRange() || hightRange > func.getHightRange()) {
            throw new IllegalArgumentException("аргумент выходит за границы диапозона");
        }
        double integral = 0;
        for (double i = lowerRange; i < hightRange; i += (hightRange - lowerRange)/100){
            integral += func.solution(i) * (hightRange - lowerRange)/100;
        }
        return integral;
    }
}
