package jp.ac.uryukyu.ie.e225726;
import java.util.ArrayList;
public class Player {
    String name;
    ArrayList <Dice> dices = new ArrayList<>();//サイコロ５つ使う
    ScoreSeat myScore = new ScoreSeat();

    Player(String name){
        this.name = name;
        dices.add(new Dice("サイコロa",0));
        dices.add(new Dice("サイコロb",0));
        dices.add(new Dice("サイコロc",0));
        dices.add(new Dice("サイコロd",0));
        dices.add(new Dice("サイコロe",0));    
    }
    //エースの時の処理
    void ace(){
        for(int a=0;a<dices.size();a++){
            if(dices.get(a).roll==1){
               myScore.scores[0].roleScores += dices.get(a).roll; 
            } 
        }
    }
    //ヂュースの時に処理
    void duce(){
        for(int d=0;d<dices.size();d++){
            if(dices.get(d).roll==2){
               myScore.scores[1].roleScores += dices.get(d).roll; 
            } 
        }
    }
    //トレイの時の処理
    void tray(){
        for(int t=0;t<dices.size();t++){
            if(dices.get(t).roll==3){
               myScore.scores[2].roleScores += dices.get(t).roll; 
            } 
        }
    }
    //フォーの時の処理
    void four(){
        for(int f=0;f<dices.size();f++){
            if(dices.get(f).roll==4){
               myScore.scores[3].roleScores += dices.get(f).roll; 
            } 
        }
    }
    //ファイブの時の処理
    void five(){
        for(int fi=0;fi<dices.size();fi++){
            if(dices.get(fi).roll==5){
               myScore.scores[4].roleScores += dices.get(fi).roll; 
            } 
        }
    }
    //シックスの時の処理
    void six(){
        for(int s=0;s<dices.size();s++){
            if(dices.get(s).roll==6){
               myScore.scores[5].roleScores += dices.get(s).roll; 
            } 
        }
    }
    //ボーナスの時の処理
    void bonus(){
        int bon=0;//適当な変数　なんでもいい
        for(int b=0;b<myScore.scores.length;b++){
            bon+=myScore.scores[b].roleScores;
        }
        if(bon==53){
            myScore.scores[6].roleScores+=50;
        }
    }
    //チョイスの時の処理
    void choice(){
        for(int c=0;c<dices.size();c++){
            myScore.scores[7].roleScores += dices.get(c).roll;
        }
    }
    //フルハウスの時の処理・・・思い付かない
    void fullHouse(){
        for (int fu=0;fu<dices.size();fu++){
            myScore.scores[9].roleScores +=dices.get(fu).roll;
        }
    }
    //sストレートの時の処理  代数　algebra
    void sStraight(){
        ArrayList<Integer> check_1 = new ArrayList<>();
        ArrayList<Integer> check_2 = new ArrayList<>();
        ArrayList<Integer> check_3 = new ArrayList<>();
        ArrayList <Integer> alg = new ArrayList<>();
        //sストレートになる時の場合わけ
        for(int s_1=1;s_1<=4;s_1++){
            check_1.add(s_1);
        }
        for(int s_2=2;s_2<=5;s_2++){
            check_2.add(s_2);
        }
        for(int s_3=3;s_3<=6;s_3++){
            check_3.add(s_3);
        }
        //dicesのままじゃ比較できない　dices.rollを取り出す
        for(int s_4=0;s_4<dices.size();s_4++){
            dices.get(s_4).rollTheDice();
            alg.add(dices.get(s_4).roll);
        }
        //containsメソッド
        if(alg.containsAll(check_1)||alg.containsAll(check_2)||alg.containsAll(check_3)){
            for(int s_5=0;s_5<dices.size();s_5++){
                myScore.scores[10].roleScores += dices.get(s_5).roll;
            }
        }   
    }
    //bストレートの時の処理　sストレートとだいたい一緒
    void bStraight(){
        ArrayList<Integer> check_1 = new ArrayList<>();
        ArrayList<Integer> check_2 = new ArrayList<>();
        ArrayList <Integer> alg = new ArrayList<>();
        for(int b_1=1;b_1<=5;b_1++){
            check_1.add(b_1);
        }
        for(int b_2=2;b_2<=6;b_2++){
            check_2.add(b_2);
        }
        for(int b_3=0;b_3<dices.size();b_3++){
            alg.add(dices.get(b_3).roll);
        }
        if(alg.containsAll(check_1)||alg.containsAll(check_2)){
            for(int b_4=0;b_4<dices.size();b_4++){
                myScore.scores[11].roleScores+=dices.get(b_4).roll;
            }
        }
    }
    //ヨットの時の処理
    void yacht(){
        ArrayList<Integer> alg = new ArrayList<>();
        ArrayList<Integer> check = new ArrayList<>();
        for(int y=0;y<dices.size();y++){
            alg.add(dices.get(y).roll);
        }
        for(int y_1=1;y_1<=6;y_1++){
            for(int y_2=0;y_2<5;y_2++){
                check.add(y_1);
            }
            if(alg.containsAll(check)){
                for(int y_3=0;y_3<dices.size();y_3++){
                    myScore.scores[12].roleScores+=dices.get(y_3).roll;
                }
            }
        }
    }
}
