package io.zipcoder.polymorphism;

public class Pet {
    private String name;

    public Pet(String name){
        this.name = name;
    }
    public String speak(){
        return "Hi!!!";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
