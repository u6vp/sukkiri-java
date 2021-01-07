package ch11;

public class Dancer extends Character {
  // 踊る
  public void dance() {
    System.out.println(this.name + "は情熱的に踊った");
  }

  // 攻撃
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("敵に3ポイントのダメージ");
    m.hp -= 3;
  }
}
