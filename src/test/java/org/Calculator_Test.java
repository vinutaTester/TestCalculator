package org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator_Test {

    Calculator_class obj1;

    @Test
    public void tc_add(){
        obj1= new Calculator_class(10,20);
        int sum= obj1.add();
        System.out.println("Sum = "+ sum);
        Assert.assertEquals(sum,30);

    }

    @Test
    public void tc_sub(){

    }

    @Test
    public void tc_mul(){

    }
}
