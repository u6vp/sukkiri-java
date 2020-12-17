public class Main4 {
  public static void main(String[] args) {
    //code4-10
    /**
    int[] scores = {20, 30, 40, 50, 60};
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int avg = sum / scores.length;
    System.out.println("合計点：" + sum);
    System.out.println("平均点：" + avg);
    */
    //code4-12
    /**
    int[] seq = new int[10];
    //塩基配列をランダムに生成
    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java.util.Random().nextInt(4);
    }
    //生成した塩基配列の記号を表示
    char[] base = {'A', 'T', 'G', 'C'};
    for (int i = 0; i < seq.length; i++){
      System.out.print(base[seq[i]] + " ");
    }
    */
    //code4-14
    /**
    int[] scores = {20, 30, 40, 50, 60};
    for (int value : scores) {
      System.out.println(value);
    }
    */

    /**ここから練習問題**/

    // pr4-1
    int[] points = new int[4];
    double[] weights = new double[5];
    boolean[] answers = new boolean[3];
    String[] names = new String[3];

    // pr4-2
    int[] moneyList = {121902, 8302, 55100};
    //通常のfor文
    for (int i = 0; i < moneyList.length; i++){
      System.out.println(moneyList[i]);
    }
    //拡張for文
    for (int money : moneyList){
      System.out.println(money);
    }

    //pr4-4
    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int num : numbers) {
      if(input == num) {
        System.out.println("アタリ！");
      }
    }
  }
}