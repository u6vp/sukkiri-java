package ch11;

public abstract class TangibleAsset extends Asset implements Thing {
  //String name; // 11-1
  //int price; // 11-1
  String color;
  double weight; // 11-4

  // コンストラクタ
  public TangibleAsset (String name, int price, String color) {
    super(name, price);
    this.color = color;
  }

  // メソッド
  //public String getName() { return this.name; } // 11-1
  //public int getPrice() { return this.price; } // 11-1
  public String getColor() { return this.color; }
  public double getWeight() { return this.weight; } // 11-4
  public void setWeight(double weight) { this.weight = weight; } // 11-4
}
