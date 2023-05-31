package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceExcerpt = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and of having nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Search Alice. Enter a term: ");
        String term = input.next();
        if(aliceExcerpt.toLowerCase().contains(term.toLowerCase())) {
        System.out.println(term + " was found!" + "The index of your term is: "
                + aliceExcerpt.indexOf(term) + " The character length of your term is: " + term.length() );
        } else {
            System.out.println(term + " was not found!");
        }
    }
}
