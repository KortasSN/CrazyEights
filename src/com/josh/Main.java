package com.josh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> deck = new ArrayList<>();
        ArrayList<String> deckInUse = new ArrayList<>();
        ArrayList<String> getPlayerHand = new ArrayList<>();
        ArrayList<String> computerHand = new ArrayList<>();
        ArrayList<String> playerHand = new ArrayList<>();
        deckInUse = builddeck(deck);
        String discardPile;

        System.out.println(deckInUse);

        /* This is to print out the deck
        for (Object listing : deckInUse) {
            System.out.println(listing);
        }
        */
        for (int a = 0; a < 7; a++) {   //for loop to get the player's hand
            Random ran = new Random();
            int x = ran.nextInt(deckInUse.size());
            playerHand.add(String.valueOf(deckInUse.get(x)));
            deckInUse.remove(String.valueOf(deckInUse.remove(x)));
            //String dealCard = deckInUse;
        }

        for (int b = 0; b < 7; b++) {   //for loop to get the computer's hand
            Random ran = new Random();
            int y = ran.nextInt(deckInUse.size());
            computerHand.add(String.valueOf(deckInUse.get(y)));
            deckInUse.remove(String.valueOf(deckInUse.remove(y)));
        }


        //Getting the first card for the game
        Random ran = new Random();
        int z = ran.nextInt(deckInUse.size());
        discardPile = String.valueOf(deckInUse.get(z));

//player's turn
        //playersturn(playerHand);

        System.out.println("Player's Cards");
        System.out.println(playerHand);
        System.out.println("Computer's Cards");
        System.out.println(computerHand);
        System.out.println(deckInUse);
        System.out.println(discardPile);
    }

    //private static void playersturn(playerHand) {
    //    System.out.println(playerHand);
   // }


    //call function to deal cards


    /////METHODS/////

    public static ArrayList builddeck(ArrayList<String> deck) {
        String suit[] = new String[4];
        suit[0] = "Clubs";
        suit[1] = "Diamonds";
        suit[2] = "Hearts";
        suit[3] = "Spades";

        String number[] = new String[14];
        number[0] = "Ace";
        number[1] = "2";
        number[2] = "3";
        number[3] = "4";
        number[4] = "5";
        number[5] = "6";
        number[6] = "7";
        number[7] = "8";
        number[8] = "9";
        number[9] = "10";
        number[10] = "Jack";
        number[11] = "Queen";
        number[12] = "King";

        for (int c = 0; c < 4; c++){
            for (int d = 0; d < 13; d++) {
                deck.add(number[d] + " of " + suit[c]);
            }
        }
        /*
        deck.add("A Clubs");
        deck.add("A Diamonds");
        deck.add("A Hearts");
        deck.add("A Spades");
        deck.add("2 Clubs");
        deck.add("2 Diamonds");
        deck.add("2 Hearts");
        deck.add("2 Spades");
        deck.add("3 Clubs");
        deck.add("3 Diamonds");
        deck.add("3 Hearts");
        deck.add("3 Spades");
        deck.add("4 Clubs");
        deck.add("4 Diamonds");
        deck.add("4 Hearts");
        deck.add("4 Spades");
        deck.add("5 Clubs");
        deck.add("5 Diamonds");
        deck.add("5 Hearts");
        deck.add("5 Spades");
        deck.add("6 Clubs");
        deck.add("6 Diamonds");
        deck.add("6 Hearts");
        deck.add("6 Spades");
        deck.add("7 Clubs");
        deck.add("7 Diamonds");
        deck.add("7 Hearts");
        deck.add("7 Spades");
        deck.add("8 Clubs");
        deck.add("8 Diamonds");
        deck.add("8 Hearts");
        deck.add("8 Spades");
        deck.add("9 Clubs");
        deck.add("9 Diamonds");
        deck.add("9 Hearts");
        deck.add("9 Spades");
        deck.add("10 Clubs");
        deck.add("10 Diamonds");
        deck.add("10 Hearts");
        deck.add("10 Spades");
        deck.add("Jack Clubs");
        deck.add("Jack Diamonds");
        deck.add("Jack Hearts");
        deck.add("Jack Spades");
        deck.add("Queen Clubs");
        deck.add("Queen Diamonds");
        deck.add("Queen Hearts");
        deck.add("Queen Spades");
        deck.add("King Clubs");
        deck.add("King Diamonds");
        deck.add("King Hearts");
        deck.add("King Spades");
        */
        return deck;
    }
















/* COMMENTING THIS OUT AS TAKES FOREVER TO BUILD A DECK
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


            if (deck.contains(cardPicked) == false) {
                deck.add(cardPicked);
            }

                }
        return deck;

            }
*/
        }








