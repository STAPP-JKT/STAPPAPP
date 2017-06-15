package com.example.william.stapp;
import java.util.*;
/**
 * Created by jason on 08/06/2017.
 */

public class randomizer {
    public int randomize(ArrayList<Integer> allTheShit, int chooseRange) {
        Random makLu = new Random();
        int temporary = makLu   .nextInt(chooseRange);
        int tempoObject = allTheShit.get(temporary);
        allTheShit.remove(temporary);
        allTheShit.add(tempoObject);
        return tempoObject;
    }

}
// given the ArrayList allTheShit and a range to search from where n<size of allTheShit,
//this method randomizes an integer within the range 0-n and return the object found at the index given by the integer.
// Afterwards remove it and re add it so that it becomes the last object in the ArrayList.
