package com.josh;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kortasthekiller on 3/15/16.
 */
public class Hand {

    public ArrayList<String> cardsInHand;
    private int numberOfCardsInHand;
    ArrayList<String> getCardsInHand;

    public ArrayList<String> getGetCardsInHand() {
        return getCardsInHand;
    }

    public void setGetCardsInHand(ArrayList<String> getCardsInHand) {
        this.getCardsInHand = getCardsInHand;
    }

    //Constructor
    Hand() {
        this.cardsInHand = new ArrayList<String>();
    }

    //for loop to get the player's hand
    void dealCard(ArrayList dealCardDeck) {
        Random ran = new Random();
        int x = ran.nextInt(dealCardDeck.size());
        cardsInHand.add(String.valueOf(dealCardDeck.get(x)));
        dealCardDeck.remove(String.valueOf(dealCardDeck.remove(x)));
        //String dealCard = deckInUse;
    }

    //public void turn();    {
        //System.out.println("You have the following cards to play on the " + );

    }
