package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {
    @Test
    public void ProvideKnownAnimalName_ExpectKnownGroupName(){
    //Arrange - set up data
    AnimalGroupName animalGroup = new AnimalGroupName();
    String animalName = "Giraffe";

        //Act - method
    String herdName = animalGroup.getHerd(animalName);

        //Assert - expected vs actual

        Assert.assertEquals("Tower", herdName);
    }
}
