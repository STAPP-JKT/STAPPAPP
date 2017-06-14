package com.example.william.stapp;
import java.math.*;
import java.util.*;
/**
 * Created by jason on 08/06/2017.
 */

public class randomizer {
    private ArrayList<Stuff> allTheShit;
    //to be randomized
    int chooseRange = 5; //// TODO: 07/06/2017 change range value
    //choose from the n first elements, define a constant n (0)

    int temporary = Random.nextInt(chooseRange);
    String temporary = allTheShit.get(temporary);
return temporary;

    public int randomize() {

    }
            allTheShit.remove()
            allTheShit.add(temporary);
}
// given the ArrayList allTheShit and a range to search from where n<size of allTheShit,
//this method randomizes an integer within the range 0-n and return the object found at the index given by the integer.
// Afterwards remove it and re add it so that it becomes the last object in the ArrayList.
