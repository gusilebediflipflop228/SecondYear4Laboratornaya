package org.example;

public class SumOfLimits <T extends IntervalInterface> implements Interface<T> {
    @Override
    public double converting(T func) {
        return func.solution(func.getLowerRange()) + func.solution(func.getHightRange()) + func.solution((func.getHightRange() + func.getLowerRange())/2);
    }
}
