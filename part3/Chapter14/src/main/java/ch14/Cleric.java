package ch14;

public class Cleric {
  String name;
  int hp = 50;
  static final int MAX_HP = 50;
  int mp = 10;
  static final int MAX_MP = 10;

  public void selfAid() {
    // MPを5消費する
    System.out.println(this.name + "はセルフエイドを唱えた！");
    this.mp -= 5;
    // 自身のHPを最大HPまで回復
    this.hp = MAX_HP;
    System.out.println("HPが最大まで回復した");
  }

  public int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間祈りをささげた！");
    // 回復前のMP
    int temp = this.mp;
    // ０～２の間で乱数を生成
    int rand = new java.util.Random().nextInt(3);
    // 祈った秒数＋rand 分のMPの回復
    this.mp += sec + rand;
    // 回復後，最大MPを超える場合はMPを最大MPに置き換える
    if (this.mp > MAX_MP) {
      this.mp = MAX_MP;
    }
    // MPの回復量を返す
    return this.mp - temp;
  }
}
