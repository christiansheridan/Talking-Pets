package io.zipcoder.polymorphism;
import com.sun.tools.internal.xjc.model.CAttributePropertyInfo;
import org.junit.Test;
import org.junit.Assert;

public class PetTest {

    @Test public void speakTestDog(){
        //Given
        Dog testPet = new Dog();

        //When
        String expectedOutput = testPet.speak();
        String actualOutput = "woof";

        //Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test public void speakTestCat(){
        //Given
        Cat testPet = new Cat();

        //When
        String expectedOutput = testPet.speak();
        String actualOutput = "meow";

        //Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test public void speakTestBird(){
        //Given
        Bird testPet = new Bird();

        //When
        String expectedOutput = testPet.speak();
        String actualOutput = "tweet";

        //Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}

