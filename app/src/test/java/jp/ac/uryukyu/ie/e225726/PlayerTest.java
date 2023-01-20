package jp.ac.uryukyu.ie.e225726;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
class PlayerTest {
    @Test void aceTest(){
        Player a = new Player("a");
        ArrayList <Integer> b = new ArrayList<>();
        for(int i=0;i<a.dices.size();i++){
            a.dices.get(i).rollTheDice();
            b.add(a.dices.get(i).roll);
        }
        a.bStraight();
        a.myScore.showScoreSeat();
    }
 
       
        

        
    

}
