package jp.ac.uryukyu.ie.e225726;
import java.util.ArrayList;
import java.util.Scanner;
public class CommandSelector {
    ArrayList<String> commands;
    Scanner scanner;

    CommandSelector() {
        scanner = new Scanner(System.in);
        commands = new ArrayList<>();
    }

    void addCommand(String command_name) {
        commands.add(command_name);
    }

    void clearCommands() {
        commands.clear();
    }
    void setCommands(int command_number,String command_name){
        commands.set(command_number,command_name);
    }

    //promptを表示した上で，ユーザの選択を待つ
    ArrayList<Integer> waitForUsersCommandDice(String prompt) {
        System.out.println(prompt);
        for(int index=0;index<commands.size();index++) { //選択肢をprint
            System.out.println(index + ":" + commands.get(index));
        }
        System.out.println(commands.size()+":"+"なし");

        //標準入力から文字列を入力・文字列を数字の配列にする
        while(true) {
            System.out.println("複数選択するときは、数字の間にカンマを入れて！！");
            String target_dice = scanner.nextLine();
            String[] a = target_dice.split(",");//正規表現・・たぶん
            ArrayList<Integer> target_int = new ArrayList<>();
            for(int in=0;in<a.length;in++){
                int inn = Integer.parseInt(a[in]);
                target_int.add(inn);
            } 
            return target_int;
        }        
    }
    int waitForUsersCommandRole(String prompt) {
        System.out.println(prompt);
        for(int index=0;index<commands.size();index++) { //選択肢をprint
            System.out.println(index + ":" + commands.get(index));
        }
        while(true){
            int target_role = scanner.nextInt();
            return target_role;
        }

    }
}    


