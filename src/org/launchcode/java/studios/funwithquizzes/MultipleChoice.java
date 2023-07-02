package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;


public class MultipleChoice extends Question{

    public ArrayList<String> possibleAnswers;

    public String userInput;

    private int correctAnswer;

    private boolean answerIsCorrect = false;

    public MultipleChoice(int pointValue, String text, String userInput, ArrayList<String> possibleAnswers, int correctAnswer) {
        super(pointValue, text);
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;

    }

    public void displayAnswers () {
        for(int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println(possibleAnswers.get(i));
        }
    }

    public boolean isAnswerIsCorrect(int possibleAnswer) {
        if (possibleAnswer == correctAnswer) {
            return true;
        } else return false;
    }
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Enter your answer using a number: ");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        if (isAnswerIsCorrect(result)) {
            return 1;
        } else {
            return 0;
        }
    }

}
