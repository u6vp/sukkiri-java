package ch10;

public class Hero {
  String name = "ミナト"; // 名前の宣言
  int hp = 100;      // HPの宣言

  /**
  public Hero(String name) {
    this.hp = 100; // hpフィールドを100で初期化
    this.name = name; // 引数の値でnameフィールドを初期化
  }
   */

  // 引数がない場合に動作するコンストラクタ
  public Hero() {
    //System.out.println("Heroのコンストラクタが動作");
  }

  // 戦う
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージを与えた！");
  }

  /**
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は，眠って回復した！");
  }

  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は，" + sec + "秒座った！");
    System.out.println("HPが" + sec + "ポイント回復した");
  }
  */

  // 子クラスでオーバーライド不可なメソッド
  public final void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は，転んだ！");
    System.out.println("5のダメージ！");
  }


  // 逃げる
  public void run() {
    System.out.println(this.name + "は，逃げ出した！");
    //System.out.println("GAMEOVER");
    //System.out.println("最終HPは" + this.hp + "でした");
  }
}
