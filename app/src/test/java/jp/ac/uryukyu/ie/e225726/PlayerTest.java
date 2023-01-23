package jp.ac.uryukyu.ie.e225726;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
class PlayerTest {
    @Test void yauchtTest(){
        Player a = new Player("a");
        ArrayList <Integer> b = new ArrayList<>();
        for(int i=0;i<a.dices.size();i++){
            a.dices.get(i).rollTheDice();
            b.add(a.dices.get(i).roll);
        }
        a.yacht();
        a.myScore.showScoreSeat();
    }
    @Test void yTest(){
            ArrayList<Integer> alg = new ArrayList<>();
            ArrayList<Integer> check = new ArrayList<>();
            Player b = new Player("b");
            for(int y=0;y<b.dices.size();y++){
                alg.add(b.dices.get(y).roll);
            }
            for(int y_1=1;y_1<=6;y_1++){
                for(int y_2=0;y_2<5;y_2++){
                    check.add(y_1);
                }
                System.out.println(check);
                if(alg.containsAll(check)){
                    for(int y_3=0;y_3<b.dices.size();y_3++){
                        b.myScore.scores[11].roleScores+=b.dices.get(y_3).roll;
                    }
                }
            }
        }
    }

 
       
        

        
    


