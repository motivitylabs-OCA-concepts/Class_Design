package com.motivity.classdesign.Objectcasting;

class Flower
{
    public void smell()		// I
    {
        System.out.println("All flowers give smell, if you can smell");
    }
}
public class Rose extends Flower {
    public void smell()		// II
    {
        System.out.println("Rose gives rosy smell");
    }
    public static void main(String[] args) {
        Flower flower = new Flower();
        Rose rose = new Rose();

        flower.smell();	                // I
        rose.smell();	                // II

        flower = rose;                      // subclass to super class, it is valid
        flower.smell();		        // II

        //rose  = flower;	                // super class to subclass, not valid
        rose = (Rose) flower;               // explicit casting
        flower.smell();

    }
}
