package io.zipcoder.polymorphism;

public class Turtle extends Pet {

    public Turtle(String name){
        super(name);
    }

    //"Roar" because turtles are my favorite animal lol
    public String speak(){
        return "ROOAAAAARR!!!";
    }
}
