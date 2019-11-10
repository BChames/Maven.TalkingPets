package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void dogConstructorTest (){
        String name = "ChungTooCool";
        Dog dog = new Dog(name);

        Assert.assertEquals(name, dog.getName());
    }

    @Test
    public void speakTest(){
        String name = "ChungFancy";
        Dog dog = new Dog(name);

        String expected = "BARK BARK!!!";

        Assert.assertEquals(expected, dog.speak());
    }
}
