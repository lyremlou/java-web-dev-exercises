package exercises;

import java.util.ArrayList;
import java.util.Scanner;
public class PrintLetters {

    public static ArrayList printNumLetters (ArrayList<String> myList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length: ");
        int wordCount = input.nextInt();
        ArrayList<String> wordCountLetters = new ArrayList<>();
        for( String word : myList) {
            if(word.length() == wordCount ) {
                wordCountLetters.add(word);
            } //else System.out.println("Word length not found.");
        }
        input.close();
        return wordCountLetters;
    }
}
