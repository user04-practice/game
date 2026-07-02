import java.util.Scanner;

public class Main {
    static void main() {
        //プレイヤーと敵のHpを設定し、1から4の選択肢を入力したらコマンドが実行する。
        //プレイヤーのHp100
        int playerHp = 100;
        //敵のHp10
        int enemyLv1Hp = 10;

        Scanner scanner = new Scanner(System.in);

        IO.println("敵Lv1が現れた！" + "HP" + enemyLv1Hp);
        IO.println("どうする？");

        IO.println("1：たたかう");
        IO.println("2：逃げる");
        IO.println("1か2を入力する");

        //入力された文字を読み込む
        int command = scanner.nextInt();

        //入力された数字によって条件分岐する
        if (command == 1) {
            IO.println("プレイヤーの攻撃！敵に５のダメージ！");
            enemyLv1Hp = enemyLv1Hp - 5;
            IO.println("敵の残りHP5");
        } else if (command == 2) {
            IO.println("逃げる...失敗！");

            //繰り返しwhileを足して、どちらかHPが0になるまで繰り返す。
            while (playerHp > 0 && enemyLv1Hp > 0) {
                IO.println("どうする？");
                IO.println("1：たたかう");
                IO.println("2：にげる");

                if (command == 1) {
                    IO.println("プレイヤーの攻撃！敵に５のダメージ！");
                    playerHp = playerHp - 5;
                    IO.println("敵を倒した！プレイヤーの勝利！");
                } else if (command == 2) {
                    IO.println("逃げる...成功！");
                }
                if (enemyLv1Hp <= 0) ;
                break;

            }
            }
        }
    }



