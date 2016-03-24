package com.josh;

import com.sun.beans.decoder.ValueObject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //creating ArrayLists for use//
        ArrayList<String> getDeck = new ArrayList<>();
        ArrayList<String> deckInUse = new ArrayList<>();
        ArrayList<String> deck = new ArrayList<>();

        //build original deck
        deck = builddeck(getDeck);

        //create player and computer hands
        Hand player =
                new Hand();

        Hand computer =
                new Hand();

        Hand discard =
                new Hand();

        //String discardCard;

        //Dealing initial cards to each hand to start the game//
        for (int x = 0; x < 7; x++) {
            player.dealCard(deck);

            computer.dealCard(deck);
        }
        //Deal the initial card to start game//

        discard.dealCard(deck);
        //Output of the cards//   ***for testing only***

        System.out.println("Player's Cards");
        System.out.println(player.cardsInHand);
        System.out.println("Computer's Cards");
        System.out.println(computer.cardsInHand);

        System.out.println("First card in play is the " + discard.cardsInHand);


        //playing the game

        //player's turn//  //listing cards in hand//
        System.out.println("You have these cards to play on the " + discard.cardsInHand);
        System.out.println(player.cardsInHand);
        System.out.println("Pick a card to play");
        Scanner scanner = new Scanner(System.in);
        String pickCard = scanner.nextLine();      //card selected to play from hand

        //checking card picked is in the hand//
        for (int d = 0; d < player.cardsInHand.size(); d++) {
            if (player.cardsInHand.get(d).contains(pickCard))   {
                System.out.println("You can play this card");
            } else {
                System.out.println("Please pick a different card");

        }

            //if (player.cardsInHand.get)
            //checking card picked to the card faceup//
            //System.out.println(discard.cardsInHand);
            int discardCount = discard.cardsInHand.size();
            //System.out.println(discardCount);
            String discardString = discard.cardsInHand.get(0);

            //System.out.println(discardString);     //testing purposes
               String discardSplit[] = discardString.split(" ");
              //System.out.println(discardSplit);             //testing purposes
            if (discardString.contains(discardSplit[0]) || (discardString.contains(discardSplit[2]))) {
                discard.cardsInHand.add(pickCard);
                player.cardsInHand.remove(pickCard);
            } else {
                System.out.println("You cannot play this card");
            }
            System.out.println(discard.cardsInHand);
            }


            //player.turn(ArrayList (discard.cardsInHand);


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







