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

    //promptを表示した上で，ユーザの選択を待つ
    ArrayList<Integer> waitForUsersCommandDice(String prompt) {
        var index = 0;
        System.out.println(prompt);
        for(var command : commands) { //選択肢をprint
            System.out.println(index + ":" + command);
            index += 1;
        }
        System.out.println(index+":"+"なし");

        //標準入力から文字列を入力・文字列を数字の配列にする
        while(true) {
            System.out.println("複数選択するときは、数字の間にカンマを入れて！！");
            String target_dice = scanner.nextLine();
            String[] a = target_dice.split(",");
            ArrayList<Integer> target_int = new ArrayList<>();
            for(int in=0;in<a.length;in++){
                int inn = Integer.parseInt(a[in]);
                target_int.add(inn);
            } 
            return target_int;
        }
               
    }
}

