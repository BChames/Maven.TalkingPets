package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void petConstructorTest(){
        //given
        String name = "chungNasty";

        //when
        Pet pet = new Pet(name);

        //then
        Assert.assertEquals(name, pet.getName());

    }

    @Test
    public void speakTest(){
        //Given
        String name = "chungTooNasty";
        Pet chung = new Pet(name);

        //when
        String expected = "Hi!!!";

        //then
        Assert.assertEquals(expected, chung.speak());
    }

    @Test
    public void setNameTest(){
        //Given
        String name = "chungTastic";
        Pet chung = new Pet(name);

        //when
        String expected = "chungMagnet";
        chung.setName(expected);

        //then

        Assert.assertEquals(expected, chung.getName());
    }

    @Test
    public void getNameTest(){
        //given
        String name = "chungAlicious";
        Pet chung = new Pet(name);

        //then
        Assert.assertEquals(name, chung.getName());

    }



}
