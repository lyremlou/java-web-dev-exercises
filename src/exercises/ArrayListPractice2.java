package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListPractice2 {

    public static void main(String[] args) {

        //ArrayList<String> words = new ArrayList<>();
        //words.add("oblivious");
        //words.add("ramshackle");
        //words.add("apple");
        //words.add("house");

        String rhyme = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";



        ArrayList<String> myList = new ArrayList<>(Arrays.asList(rhyme.split(" ")));
        System.out.println(PrintLetters.printNumLetters(myList));

    }
}
