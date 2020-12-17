/**
 * This class describes a main 3.
 */
public class Main3 {
  public static void main(String[] args) {
    // text
    /**
    boolean tenki = false;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else {
      System.out.println("DVDを見ます");
    }
    */
    /**
    boolean dooeClose = false;
    while (dooeClose == true) {
      System.out.println("ノックする");
      System.out.println("1分待つ");
    }
    */
    /**
    for (i = 0; i < 10; i++) {
      System.out.println((i+1) + "こんにちは");
    }
    */
    /**
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(i*j);
        System.out.print(" ");
      }
      System.out.println("");
    }
    */
    
    //pr3-1
    int weight = 60;
    int age1 = 25; int age2 = 40;
    int age = 1;
    String name = "湊";
    if(weight == 60 && 2 * (age1 + age2) > 60 && age % 2 == 1 && name.equals("湊")) {
        System.out.println("正解");
    }
    
    //pr3-3
    int isHungry = 1;
    String food = "カレーライス";
    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです");
    } else {
      System.out.println("はらぺこです");
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそうさまでした");

    //pr3-4
    boolean tenki = false;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else {
      System.out.println("DVDを見ます");
      System.out.println("寝ます");
    }

    //pr3-5
    System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected) {
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
        break;
      case 3:
        System.out.println("削除します");
        break;
      case 4:
        System.out.println("変更します");
        break;
    }

    //pr3-6
    int ans = new java.util.Random().nextInt(10);
    System.out.println("【数当てゲーム】 ");
    for (int i = 0; i < 5; i++) {
      System.out.println("0～9の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if (num == ans) {
        System.out.println("アタリ！");
        break;
      } else {
        System.out.println("違います");
      }
    }
    System.out.println("ゲームを終了します");
  }
}