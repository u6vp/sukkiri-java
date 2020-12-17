public class Main5 {
  //code5-13
  public static void incArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i]++;
    }
  }
  //code5-14
  public static int[] makeArray(int size) {
    int[] newArray = new int[size];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = i;
    }
    return newArray;
  }
  //pr5-1
  public static void introduceOneself() {
    String name = "橋爪直寛";
    int age = 25;
    double height = 170.0;
    char zodiac = '亥';
    System.out.println("私の名前は" + name + "です．");
    System.out.println("年齢は"+ age + "歳，身長は" + height + "cmで" + zodiac + "年生まれです．");
  }
  //pr5-2
  public static void email(String title, String address, String text) {
    System.out.println(address + "に，以下のメールを送信しました．");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
  //pr5-3
  public static void email(String address, String text) {
    System.out.println(address + "に，以下のメールを送信しました．");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }
  //pr5-4
  public static double calcTriangleArea(double bottom, double height) {
    return bottom * height / 2;
  }
  public static double calcCircleArea(double radius) {
    return radius * radius * 3.14;
  }
  public static void main(String[] args) {
    /**code5-13
    int[] array = {1, 2, 3};
    incArray(array);
    for (int i : array){
      System.out.println(i);
    }
    */
    /**code5-14
    int[] array = makeArray(3);
    for (int i : array) {
      System.out.println(i);
    }
    */
    //pr5-1
    introduceOneself();
    //pr5-2
    email("テスト", "temp@gmail.com", "正しく送信されました");
    //pr5-3
    email("temp@gmail.com", "正しく送信されました");
    //pr5-4
    double bottom = 10.0;
    double height = 5.0;
    double radius = 5.0;
    double triArea = calcTriangleArea(bottom, height);
    double circleArea = calcCircleArea(radius);
    System.out.println("・三角形の底辺の長さが" + bottom + "cm，高さが" + height + "cmの場合，面積は" + triArea + "cm^2");
    System.out.println("・円の半径が" + radius + "cmの場合，面積は" + circleArea + "cm^2");
  }
}