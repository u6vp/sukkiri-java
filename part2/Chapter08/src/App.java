public class App {
  public static void main(String[] args) {
    // 1. 勇者を生成
    Hero h = new Hero();
    // 2. フィールドに初期値を設定
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");

    // 3. お化けキノコ1を生成
    Matango m1 = new Matango();
    // 4. フィールドに初期値を設定
    m1.hp = 50;
    m1.suffix = 'A';
    // 5. お化けキノコ2を生成
    Matango m2 = new Matango();
    // 6. フィールドに初期値を設定
    m2.hp = 48;
    m2.suffix = 'B';

    // 7. 冒険の始まり
    h.slip();
    m1.run();
    m2.run();
    h.run();

    // 8. 練習8-4動作確認
    Cleric c1 = new Cleric();
    c1.name = "クレリック1";
    c1.selfAid();
    int recoverMp = c1.pray(2);
    System.out.println(c1.name + "はMPが" + recoverMp + "回復した");
  }
}