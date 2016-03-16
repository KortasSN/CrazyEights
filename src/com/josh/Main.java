package com.josh;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> getDeck = new ArrayList<>();
        ArrayList<String> deckInUse = new ArrayList<>();
        ArrayList<String> deck = new ArrayList<>();


        deck = builddeck(getDeck);
        Hand player =
                new Hand();

        Hand computer =
                new Hand();

        Hand discard =
                new Hand();


        //Dealing initial cards to start the game//
        for (int x = 0; x < 7; x++) {
            player.dealCard(deck);

            computer.dealCard(deck);
        }
        //Deal the initial card to start game//
        discard.dealCard(deck);

        //Output of the cards//

        System.out.println("Player's Cards");
        System.out.println(player.cardsInHand);
        System.out.println("Computer's Cards");
        System.out.println(computer.cardsInHand);

        System.out.println("First card in play is the " + discard.cardsInHand);

    }





    /////METHODS/////


    public static ArrayList builddeck(ArrayList<String> getDeck) {
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
                getDeck.add(number[d] + " of " + suit[c]);
            }
        }

        return getDeck;
    }

}







