package ch13;

public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;
  private final int MIN_NAME_LEN = 3;
  private final int MIN_HP = 0;
  private final int MIN_MP = 0;

  // getter & setter
  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    if (hp < MIN_HP) {
      this.hp = 0;
    } else {
      this.hp = hp;
    }
  }

  public int getMp() {
    return this.mp;
  }

  public void setMp(int mp) {
    if (mp < MIN_MP) {
      throw new IllegalArgumentException("魔法使いのMPは0以上に制限されています！");
    }
    this.mp = mp;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name == null || name.length() < MIN_NAME_LEN) {
      throw new IllegalArgumentException("名前は必ず3文字以上を指定してください！");
    }
    this.name = name;
  }

  public Wand getWand() {
    return this.wand;
  }

  public void setWand(Wand wand) {
    if (wand == null) {
      throw new IllegalArgumentException("魔法使いは必ず杖を装備してください！");
    }
    this.wand = wand;
  }

  // 杖を使って勇者のHPを回復する
  public void heal(Hero h) {
    int basePoint = 10;
    
    int recovPoint = (int) (basePoint * this.getWand().getPower());
    h.setHp(h.getHp() + recovPoint);
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }

}
