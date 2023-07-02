package org.launchcode.java.studios.funwithquizzes;

import java.util.Scanner;

public abstract class Question {

    private int pointValue;
    private String text;

    public Question(int pointValue, String text) {
        this.pointValue = pointValue;
        this.text = text;
    }

    public void displayQuestion() {
        System.out.println(text);
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

