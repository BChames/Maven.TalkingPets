package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void catConstructorTest(){
        String name = "ohChungsBad";
        Cat ocb = new Cat(name);

        Assert.assertEquals(name, ocb.getName());
    }

    @Test
    public void speakTest(){
        String name = "ohChungsBad";
        Cat ocb = new Cat(name);

        String speak = "MEOOOOOOOOOOWWWW!!!!!!!!!";

        Assert.assertEquals(speak, ocb.speak());
    }

}
