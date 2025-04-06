package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumTest {
    Linear linearFunction = new Linear(1, 2, 5, 10);
    Division division = new Division(1, 2, 1, 2, 5, 10);
    Sin sin = new Sin(1, 1, 0, Math.PI);
    Exponent expFunction = new Exponent(1, 1, 1, 1);
    SumOfLimits<IntervalInterface> sumOfLimits = new SumOfLimits<>();

    @Test
    public void linearTest() {
        Assertions.assertEquals(28.5, sumOfLimits.converting(linearFunction));
    }

    @Test
    public void realTest() {
        Assertions.assertEquals(3, sumOfLimits.converting(division));
    }

    @Test
    public void sinTest() {
        Assertions.assertEquals(1, Math.round(sumOfLimits.converting(sin)));
    }

    @Test
    public void expTest() {
        Assertions.assertEquals(Math.exp(1) * 3 + 3, sumOfLimits.converting(expFunction));
    }

}