package jp.ac.uryukyu.ie.e225726;

import java.util.Random;
public class Dice {
    String name;
    int roll;

    Dice(String name,int roll){
        this.name = name;
        this.roll=roll;
    }
    int rollTheDice(){
        Random rand = new Random();
        int roll = rand.nextInt(5) + 1;
        System.out.println(name+roll);
        return roll;
    }
    



}
