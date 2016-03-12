package com.josh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> deck = new ArrayList<>();

        while (deck.size() < 52) {
            builddeck();
        }
        //call function to build deck

        for (Object listing: deck) {
            System.out.println(listing);

        }




    }

    //call function to deal cards


    /////METHODS/////

    private static ArrayList builddeck() {
        ArrayList<String> suits = new ArrayList();
        suits.add("clubs");
        suits.add("diamonds");
        suits.add("hearts");
        suits.add("spades");

        ArrayList<String> number = new ArrayList<>();
        number.add("Ace");
        number.add("2");
        number.add("3");
        number.add("4");
        number.add("5");
        number.add("6");
        number.add("7");
        number.add("8");
        number.add("9");
        number.add("10");
        number.add("Jack");
        number.add("Queen");
        number.add("King");

        HashMap<Integer, String> cards = new HashMap<>();
        Random ran = new Random();
        int suitsRandom = ran.nextInt(3) + 1;
        String suitPicked = suits.get(suitsRandom);

        int numberRandom = ran.nextInt(12) + 1;
        String numberPicked = number.get(numberRandom);

        String cardPicked = suitPicked + numberPicked;

        ArrayList<String> deck = new ArrayList<>();

        for (Object check : deck) {
            if (cardPicked == check) {
                System.out.println("already in deck");
            } else {
                deck.add(cardPicked);
            }

        }
        return deck;
    }
}

