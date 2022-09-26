package com.techelevator;

public class FruitTree {
    FruitTree:
    public boolean pickFruit(int numberOfPiecesToRemove) {
        if (piecesOfFruitLeft - numberOfPiecesToRemove >= 0) {
            piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
        } else {
            return false;
        }
    }


}
