/*
 * Copyright (c) Jose Cazalilla. 2017.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Hangman {
    private String titleToGuess;
    private StringBuilder currentGuess;
    private int points;
    private ArrayList<String> lettersTried;

    public Hangman() {
        titleToGuess = "";
        currentGuess = null;
        points = 10;
        lettersTried = new ArrayList<String>();
    }

    //This function will get a title randomly from a text file
    public void setTitleToGuess (String filename) {
        Scanner file = null;
        ArrayList<String> movies = new ArrayList<String>();
        try {
            file = new Scanner(new File(filename));
        }
        catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
            System.out.println("Finishing the game");
            System.exit(0);
        }

        while (file.hasNextLine()) {
            movies.add(file.nextLine());
        }

        titleToGuess = movies.get((int)(Math.random() * movies.size())).toLowerCase();
        currentGuess = new StringBuilder(fillWithUnderscores(titleToGuess.length()));
    }

    //This function will print the actual guess
    public void printCurrentGuess () {
        System.out.println(currentGuess);
        System.out.println("You still have  " + points + " attemps." );
    }


    public void cheatABit () {
        System.out.println("You are cheating!!!!");
        System.out.println(titleToGuess);
    }

    // A new letter is tried
    public void newLetter(String letter) {
        if (lettersTried.contains(letter)) {
            System.out.println("You already tried with that letter... idiot!");
            points--;
        }
        else {
            lettersTried.add(letter);
            if (titleToGuess.contains(letter)) {
                for (int i = 0; i < titleToGuess.length(); i++) {
                    if (titleToGuess.charAt(i) == letter.charAt(0)) {
                        currentGuess.setCharAt(i,titleToGuess.charAt(i));
                    }
                }
            }
            else {
                System.out.println("That letter wasn't in the movie title...");
                points--;
            }
        }

        if (titleToGuess.equals(currentGuess.toString())) {
            System.out.println("You won!!! Congrats!!!");
            System.exit(0);
        }
        else if (points == 0) {
            System.out.println("You lost!!! Next time!!!");
            System.exit(0);
        }
    }

    private String fillWithUnderscores(int num) {
        String ret = "";
        for (int i = 0; i < num; i++) {
            ret = ret + "_";
        }
        return ret;
    }


}
