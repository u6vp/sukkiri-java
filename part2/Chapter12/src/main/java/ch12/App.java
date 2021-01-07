package ch12;

public class App 
{
    public static void main( String[] args )
    {
        // 12-2-1
        X obj = new A();
        obj.a(); // a()のみ動作
        //obj.b(); // 動作しない
        //obj.c(); // 動作しない

        // 12-2-2 動作確認
        Y y1 = new A();
        Y y2 = new B();
        y1.a();
        y2.a();

        // 12-3
        Y[] ys = new Y[2];
        ys[0] = new A();
        ys[1] = new B();

        // 拡張for文でそれぞれのインスタンスのb()を呼び出す
        for (Y y : ys) {
            y.b();
        }
    }
}
