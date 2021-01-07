package ch11;

public class Hero extends Character {
  String name = "ミナト"; // 名前の宣言
  int hp = 100;      // HPの宣言

  // 戦う（抽象メソッドとして宣言する）
  public void attack(Matango m){
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージを与えた！");
  }
}
