package ch10;

public class SuperHero extends Hero{
  boolean flying;

  public SuperHero() {
    //System.out.println("SuperHeroのコンストラクタが動作");
  }

  // 飛ぶ
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }

  // 着地する
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }

  // 逃げる
  public void run() {
    System.out.println(this.name + "は撤退した");
  }

  // 攻撃する
  public void attack(Matango m) {
    super.attack(m);
    // 飛んでいたら2回目の攻撃
    if (this.flying) {
      super.attack(m);
    }
  }
}
