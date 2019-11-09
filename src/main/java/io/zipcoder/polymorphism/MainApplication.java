package io.zipcoder.polymorphism;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Pet> userPets = new ArrayList<Pet>();

    public static void main(String[] args) {
        Integer amountOfPets = amountOfPets();
        ArrayList<Pet> userPets = petList(amountOfPets);
        System.out.println(userPets);
    }

    //Modify your program from part 1 to use the Pet class and its subclasses. Keep a 'list' of the pets your user lists
    // and at the end of the program print out a list of their names and what they say when they speak.

    //RETURN- print out a list of their names and what they say when they speak.
    //Pet Name
    //Speak method
    public static ArrayList<Pet> petList(Integer amountOfPets){
        Pet pet = new Pet(null);
        for(int i = 0; i < amountOfPets; i++){
            pet.setName(getPetNameInput("What is your pets name? Enter it now!!"));
            userPets.add(pet);

            System.out.println(userPets.get(i).getName());
            System.out.println(userPets.get(i).speak());
        }

        return userPets;
    }

    public static Integer amountOfPets(){
        System.out.println("How many pets do you have?");
        return scanner.nextInt();
    }
    public static String getPetName(){
        System.out.println("What is your pets name? Enter it now!!");
        return scanner.nextLine();
    }

    public static String getPetNameInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

}
