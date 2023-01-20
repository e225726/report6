package jp.ac.uryukyu.ie.e225726;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Player a = new Player("a");
        a.myScore.showScoreSeat();
        ArrayList <Integer> in = new ArrayList<>();
        ArrayList<Integer> q = new ArrayList<>();
        q.add(1);
        
        for(int i=0;i<a.dices.size();i++){
            a.dices.get(i).rollTheDice();
            in.add(a.dices.get(i).roll);
            System.out.println(in);
        }
        if(in.containsAll(q)){
            System.out.println("a");
        }
        
        
        
        
    }
}
