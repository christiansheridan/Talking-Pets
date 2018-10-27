package io.zipcoder.polymorphism;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numPets = reader.nextInt();
        int i;
        String[] petType = new String[numPets];
        String[] petName = new String[numPets];
        //Pets[] petArr = new Pets[numPets];
        for (i = 0; i < numPets; i++) {
            System.out.println("What type of pet do you have?");
            petType[i] = reader.next();
            System.out.println("What is their name?");
            petName[i] = reader.next();
            //Pets petInfo = new Pets(petName, petType);
            //petArr[i] = petInfo;
        }
        for (i = 0; i < numPets; i++) {
            if (petType[i].toLowerCase().equals("dog")) {
                Dog doge = new Dog();
                System.out.println("Dog: " + petName[i] + " " + doge.speak());
            }if (petType[i].toLowerCase().equals("cat")) {
                Cat mittens = new Cat();
                System.out.println("Cat: " + petName[i] + " " + mittens.speak());
            }if (petType[i].toLowerCase().equals("bird")) {
                Bird tweety = new Bird();
                System.out.println("Dog: " + petName[i] + " " + tweety.speak());
            }
            //System.out.println(petArr[i].getName());
            //System.out.println(petArr[i].speak());}
        }
    }
}
