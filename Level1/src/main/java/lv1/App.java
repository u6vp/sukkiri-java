package lv1;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        // 1-1
        System.out.println("――――――――――――――――――――――――――――");
        System.out.println("レベル1－1");
        System.out.println("----------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-2
        System.out.println("レベル1－2");
        System.out.println("----------------------------");
        for (int i = 0; i < 10; i=i+2) {
            System.out.println(i);
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-3
        System.out.println("レベル1－3");
        System.out.println("----------------------------");
        for (int i = 1; i < 10; i=i+2) {
            System.out.println(i);
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-4
        System.out.println("レベル1－4");
        System.out.println("----------------------------");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i + 1;
        }
        System.out.println(sum);
        System.out.println("――――――――――――――――――――――――――――");

        // 1-5
        System.out.println("レベル1－5");
        System.out.println("----------------------------");
        sum = 0;
        for (int i = 0; i < 10; i=i+2) {
            sum += i + 2;
        }
        System.out.println(sum);
        System.out.println("――――――――――――――――――――――――――――");

        // 1-6
        System.out.println("レベル1－6");
        System.out.println("----------------------------");
        sum = 0;
        for (int i = 1; i < 10; i=i+2) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("――――――――――――――――――――――――――――");

        // 1-7
        System.out.println("レベル1－7");
        System.out.println("----------------------------");
        sum = 0;
        for (int i = 1; sum < 1000; i++) {
            sum += i;
        }
        System.out.println("総和は" + sum);
        System.out.println("――――――――――――――――――――――――――――");

        // 1-8
        System.out.println("レベル1－8");
        System.out.println("----------------------------");
        System.out.println("1～3の数字を入力してください");
        try (Scanner scan = new Scanner(System.in)) {
            int x = scan.nextInt();
            System.out.println("x = " + x + " のとき");
            switch (x) {
                case 1:
                    System.out.println("凶");
                    break;
                case 2:
                    System.out.println("吉");
                    break;
                case 3:
                    System.out.println("大吉");
                    break;
                default:
                    System.out.println("エラー");
                    break;
            }
        } catch (Exception e) {
            System.out.println("1～3の数字を入力してください");
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-9
        System.out.println("レベル1－9");
        System.out.println("----------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("■ ");
            }
            System.out.println("");
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-10
        System.out.println("レベル1－10");
        System.out.println("----------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("■ ");
            }
            System.out.println("");
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-11
        System.out.println("レベル1－11");
        System.out.println("----------------------------");
        for (int i = 0; i < 10; i++) {
            if (i + 1 != 5) {
                System.out.println(i + 1);
            } else {
                System.out.println("五");
            }
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-12
        System.out.println("レベル1－12");
        System.out.println("----------------------------");
        boolean b = true;
        if (b) {
            System.out.println("真");
        } else {
            System.out.println("偽");
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-13
        System.out.println("レベル1－13");
        System.out.println("----------------------------");
        int i = 165;
        if ((i > 160) && (i < 170)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-14
        System.out.println("レベル1－14");
        System.out.println("----------------------------");
        i = 1;
        if (i != 0) {
            System.out.println("0ではない");
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-15
        System.out.println("レベル1－15");
        System.out.println("----------------------------");
        i = 0;
        System.out.println(i == 0 ? "i = 0 のとき\nぜろ" : "i != 0 のとき\nぜろじゃない");
        System.out.println("――――――――――――――――――――――――――――");

        // 1-16
        System.out.println("レベル1－16");
        System.out.println("----------------------------");
        b = true;
        for (int j = 0; j < 10; j++) {
            System.out.println(b);
            b = !b;
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-17
        System.out.println("レベル1－17");
        System.out.println("----------------------------");
        int[] data1 = {1, 2, 3, 4, 5};
        for (int j : data1) {
            System.out.print(j + " ");
        }
        System.out.println("\n――――――――――――――――――――――――――――");

        // 1-18
        System.out.println("レベル1－18");
        System.out.println("----------------------------");
        int[] data2 = {1, 2, 3, 4, 5};
        sum = 0;
        for (int j : data2) {
            sum += j;
        }
        System.out.println(sum);
        System.out.println("――――――――――――――――――――――――――――");

        // 1-19
        System.out.println("レベル1－19");
        System.out.println("----------------------------");
        i = 1;
        while (i <= 5) {
            System.out.println(i++);
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-20
        System.out.println("レベル1－20");
        System.out.println("----------------------------");
        int[] data3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j : data3) {
            for (int k : data3) {
                System.out.printf("%3d", j * k);
            }
            System.out.println("");
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-21
        System.out.println("レベル1－21");
        System.out.println("----------------------------");
        i = 1;
        System.out.print("i = " + i + " → ");
        switch (i) {
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            default:
                System.out.println("エラー");
                break;
        }
        System.out.println("――――――――――――――――――――――――――――");

        // 1-22
        System.out.println("レベル1－22");
        System.out.println("----------------------------");
        int varInt = 10;
        long varLong = 12345678910L;
        double varDouble = 10.0;
        float varFloat = 10.0F;
        char varChar = 'A';
        boolean varBoolean = true;
        System.out.println("int:" + varInt);
        System.out.println("long:" + varLong);
        System.out.println("double:" + varDouble);
        System.out.println("float:" + varFloat);
        System.out.println("char:" + varChar);
        System.out.println("boolean:" + varBoolean);
        System.out.println("――――――――――――――――――――――――――――");

    }
}
