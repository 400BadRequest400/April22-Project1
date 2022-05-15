package test;

import org.junit.Assert;
import org.junit.Test;

public class Testing {

    public static void main(String[] args) {

        int actual = 10;
        int expected = 10;
        //validation

        //Assert.assertEquals(expected, actual);

        if (actual == expected){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    @Test
    public void test1(){

        int actual = 10;
        int expected = 10;

        //validation
        Assert.assertEquals(expected, actual);
    }

    public void test2(){

        int actual = 10;
        int expected = 10;

        //validation
        //Assert.assertEquals(expected, actual);
    }

    public void test3(){

        int actual = 10;
        int expected = 10;

        //validation
        //Assert.assertEquals(expected, actual);
    }
}
