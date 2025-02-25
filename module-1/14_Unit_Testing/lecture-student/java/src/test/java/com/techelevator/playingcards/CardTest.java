package com.techelevator.playingcards;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    //testing the two constructor for Card
    @Test
    public void no_arg_constructor_makes_ace_of_spades() {
        //arrange & act
        Card sut = new Card();
        //assert
        Assert.assertEquals("Ace", sut.getRank());
        Assert.assertEquals(Suit.SPADES, sut.getSuit());
    }

    @Test
    public void constructor_makes_specified_card() {
        //arrange & act
        Card sut = new Card("Jack", Suit.DIAMONDS);
        //assert
        Assert.assertEquals("Jack", sut.getRank());
        Assert.assertEquals(Suit.DIAMONDS, sut.getSuit());

    }

    @Test
    public void getDescription_returns_back_of_card_when_face_down() {
        //arrange
        Card sut = new Card();
        sut.setFaceUp(false);//made sure it is facedown

        //act
        String descritpion = sut.getDescription();

        //assert
        Assert.assertEquals("Back of Card", descritpion);
    }

    @Test
    public void getDescription_returns_rank_of_suit_when_face_up() {
        //arrange
        Card sut = new Card();
        sut.setFaceUp(true);//made sure it is facedown

        //act
        String descritpion = sut.getDescription();

        //assert
        Assert.assertEquals("Ace of Spades", descritpion);
    }

    @Test
    public void getValueForRank_returns_correct_value_for_ace() {

        //arrange
        String rank = "Ace";

        //act
        int value = Card.getValueForRank(rank);


        //assert
        Assert.assertEquals(14, value);

    }

    @Test
    public void getValueForRank_returns_zero_for_invalid_ranks() {
        Assert.assertEquals(0, Card.getValueForRank(""));//empty string
        Assert.assertEquals(0, Card.getValueForRank(null));  //null
        Assert.assertEquals(0, Card.getValueForRank("blah")); //nonsense
    }

    @Test
    public void flip_changes_faceUp_to_faceDown() {
        Card sut = new Card();
        sut.setFaceUp(true);

        sut.flip();

        Assert.assertFalse(sut.isFaceUp());
    }

    @Test
    public void flip_changes_faceDown_to_faceUp() {
        Card sut = new Card();
        sut.setFaceUp(false);

        sut.flip();

        Assert.assertTrue(sut.isFaceUp());
    }

    @Test
    public void isHigherThan_returns_true_if_higher_than_otherCard(){
        Card sut = new Card();//ace of spades
        Card otherCard = new Card("Jack", Suit.DIAMONDS);


        Assert.assertTrue(sut.isHigherThan(otherCard));


    }

    @Test
    public void getHalfValue_returns_two_and_a_half_for_five(){
        Card sut = new Card("Five", Suit.CLUBS);

        double value = sut.getHalfVaue();

        Assert.assertEquals(2.5, .0001);
    }
}
