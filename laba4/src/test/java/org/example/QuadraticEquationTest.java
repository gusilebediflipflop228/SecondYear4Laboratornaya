package org.example;


import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTest {
    QuadraticEquation quadraticEquation1 = new QuadraticEquation(1, -2, 1);
    QuadraticEquation quadraticEquation2 = new QuadraticEquation(1, 2, 0);
    QuadraticEquation quadraticEquation3 = new QuadraticEquation(1, 2, 20);


    @Test
    public void Test1() {
        Assert.assertEquals(1, quadraticEquation1.solution()[0],0.000000000000001);
    }

    @Test
    public void Test2() {
        Assert.assertEquals(0, quadraticEquation2.solution()[0],0.000000000000001);
        Assert.assertEquals(-2, quadraticEquation2.solution()[1],0.000000000000001);
    }

    @Test
    public void Test3() {
        Assert.assertEquals(0, quadraticEquation3.solution().length);
    }//
}
