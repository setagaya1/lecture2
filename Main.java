
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //インスタンス化
        Bird bird = new Bird("ちゅん", 13, "オス");

        //getter チェック
        System.out.println(bird.getName());
        System.out.println(bird.getAge());
        System.out.println(bird.getSex());

        //setter チェック
        bird.setAge(14);
        System.out.println("変更した後の年齢は：" + bird.getAge());

        //メソッド チェック
        bird.twitter();

        //for文 if文
        List<Bird> birdList = List.of(new Bird("おはぎ", 10, "メス"),
                new Bird("だいふく", 14, "オス"),
                new Bird("おもち", 5, "メス"));
        for (Bird birds : birdList) {
            System.out.print("インコの名前：" + birds.getName() + "　");
            System.out.print("インコの年齢：" + birds.getAge() + "　");
            System.out.print("インコの性別：" + birds.getSex() + "　");
            System.out.println("");
            if(birds.getAge() >= 10) {
                System.out.println("長生きすごい！！");
            } else {
                System.out.println("若くて元気いっぱい！！");
            }
        }
    }
}