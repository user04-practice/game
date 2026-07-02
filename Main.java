import src.History;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class LifeMemo {
    static void main() {
        //キーボード入力をするための準備
        Scanner scanner = new Scanner(System.in);
        ArrayList<History> historyList = new ArrayList<>();
        //「yyyy/M/d」の形式で入力を受け付けるためのフォーマットを作成
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/M/d");

        //タイトルとメニューの表示
        IO.println("【メニュー画面】これいつやったっけ？");
        IO.println("1：行動を記録する");
        IO.println("2：履歴を確認する");
        IO.println("3：アプリを終了する");
        IO.println("メニュー番号を入力して下さい");

        //入力された数字を確認する
        int menuChoice = scanner.nextInt();

        //入力された数字によって処理を切り替える
        //ケース１：行動を記録する場合
        switch (menuChoice) {
            case 1:
                IO.println("何を記録しますか？");
                IO.println("1：美容院");
                IO.println("2：エアコン掃除");

                int recorderChoice = scanner.nextInt();

                switch (recorderChoice) {
                    case 1:
                        IO.println("美容院の記録をする");
                        IO.println("今日美容院へ行きましたか？（1：はい/2：別の日)");
                        int dayChoice = scanner.nextInt();

                        //入力した番号によって日付を変える
                        LocalDate visitDate;
                        if (dayChoice == 1) {
                            //今日の日付を入れる
                            visitDate = LocalDate.now();
                        } else {
                            //別日の場合、他の日付を入力できる処理にする
                            IO.println("行った日付を教えてください(例：2026/06/25)：");
                            String inputDate = scanner.next();

                            //入力された文字列(2026/06/25)をLocalDate型へ変換する
                            visitDate = LocalDate.parse(inputDate, formatter);
                        }

                        IO.println("美容院行った日：" + visitDate + "を記録しました");

                        //２か月後の次回予定日を自動計算する
                        LocalDate nextDate = visitDate.plusMonths(2);
                        IO.println("次回の目安は[ " + nextDate + " ]頃です！");

                        break;

                    default:
                        IO.println("無効な信号です");
                        break;


                }
        }
    }
}










































































