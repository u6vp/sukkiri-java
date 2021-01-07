package ch11;

public abstract class Character {
  String name;
  int hp;

  // 逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }

  // 戦う（抽象メソッドとして宣言する）
  public abstract void attack(Matango m);
}
