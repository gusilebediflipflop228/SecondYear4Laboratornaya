package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegralTest {
    Linear linearFunction = new Linear(-1, 10, 1, 52);
    Division division = new Division(4, 2, 0, 1, 2, 52);
    Sin sin = new Sin(1, 2 * Math.PI, 0, 52);
    Exponent exp = new Exponent(1, 0, 11, 53);
    Integral<IntervalInterface> Integral = new Integral<>(9,12);

    @Test
    public void linearTest() {
        Assertions.assertEquals(-2, Math.round(Integral.converting(linearFunction)));
    }
    @Test
    public void realTest() {
        Assertions.assertEquals(133, Math.round(Integral.converting(division)));

    }
    @Test
    public void sinTest() {
        Assertions.assertEquals(-6.6077511148327236E-15, Integral.converting(sin));
    }
    @Test
    public void expTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Integral.converting(exp));
    }//тест выводит что исключений не было, не понял как проверить на то что исключение не выбрасывает

}
