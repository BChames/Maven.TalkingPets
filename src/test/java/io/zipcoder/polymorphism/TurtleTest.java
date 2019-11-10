package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TurtleTest {
    @Test
    public void dogConstructorTest (){
        String name = "ChungSizzle";
        Turtle turtle = new Turtle(name);

        Assert.assertEquals(name, turtle.getName());
    }

    @Test
    public void speakTest(){
        String name = "ChungGotTurtlesToo";
        Turtle turtle = new Turtle(name);

        String expected = "ROOAAAAARR!!!";

        Assert.assertEquals(expected, turtle.speak());
    }
}
