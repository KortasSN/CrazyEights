package com.josh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> deck = new ArrayList<>();

        //while (deck.size() < 52) {
        ArrayList deckInUse = builddeck(deck);
        //}
        //call function to build deck

        for (Object listing : deck) {
            System.out.println(listing);

        }
    }

    //call function to deal cards


    /////METHODS/////

    private static ArrayList builddeck(ArrayList deck) {

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

        //HashMap<Integer, String> cards = new HashMap<>();


        //ArrayList<String> deck = new ArrayList<>();
        deck.add("joker");
        while (deck.size() < 53) {
            Random ran = new Random();
            int suitsRandom = ran.nextInt(3) + 1;
            String suitPicked = suits.get(suitsRandom);
            int numberRandom = ran.nextInt(12) + 1;
            String numberPicked = number.get(numberRandom);

            String cardPicked = suitPicked + numberPicked;


            /*for (Object item : deck) {
                if (cardPicked == ) {
                    break;} else {
                     //System.out.println("already in deck");
                        //} else {
                        System.out.println(cardPicked);
                        deck.add(cardPicked);
                    }*/

            /*for (int b = 0; b < deck.size(); b++) {
                if (cardPicked != deck.get(b)) {
                    deck.add(cardPicked);
                    /*} else {
                        System.out.println(cardPicked);
*/

            if (deck.contains(cardPicked) == false) {
                deck.add(cardPicked);
            }

                }
        return deck;
            }

        }








