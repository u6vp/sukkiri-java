package ch13;

public class Wand {
  private String name;
  private double power;
  private final int MIN_NAME_LEN = 3;
  private final double MIN_POWER = 0.5;
  private final double MAX_POWER = 100.0;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name == null || name.length() < MIN_NAME_LEN) {
      throw new IllegalArgumentException("名前は必ず3文字以上を指定してください！");
    }
    this.name = name;
  }

  public double getPower() {
    return this.power;
  }

  public void setPower(double power) {
    if (power < MIN_POWER || power > MAX_POWER) {
      throw new IllegalArgumentException("杖による増幅率は0.5以上100以下に制限されています！");
    }
    this.power = power;
  }
}
