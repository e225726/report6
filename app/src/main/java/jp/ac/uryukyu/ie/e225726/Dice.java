package jp.ac.uryukyu.ie.e225726;

import java.util.Random;
public class Dice {
    String name;
    int roll ;

    Dice(String name,int roll){
        this.name = name;
        this.roll = roll;    
    }
    void rollTheDice(){
        Random rand = new Random();
        roll = rand.nextInt(5) + 1;
    }
    int getTheRoll(){
        return roll;
    }
    void showDice(){
        System.out.println(name+":"+roll+",");
    }

    



}
