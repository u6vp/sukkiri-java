package cb15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class App 
{
    public static void main( String[] args )
    {
        // String s1 = "Java and Javascript";
        // if (s1.endsWith("Java")) {
        //     System.out.println("文字列s1は，Javaが末尾にあります");
        // }
        // System.out.println( "文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
        // System.out.println( "文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

        // String Builder
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 10; i++) {
        //     sb.append("Java");
        // }
        // String s = sb.toString();
        // System.out.println(s);

        // 15-1
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(i + 1).append(",");
        }
        String s = sb.toString();
        String [] a = s.split(",");
        System.out.println(s);
        for (String i : a) {
            System.out.print(i);
        }

        // 改行
        System.out.println("\n");

        // 15-2動作確認
        String folderName = "c:\\javadev\\";
        String fileName = "readme.txt";
        System.out.println(concatPath(folderName, fileName));

        // 改行
        System.out.println("");

        // 15-3
        String targetString = "UABC";
        System.out.println(targetString);
        if(targetString.matches(".*")){
            System.out.println("全ての文字列：パターンに一致します");
        } else {
            System.out.println("全ての文字列：パターンに一致しませんでした");
        }
        if(targetString.matches("^A\\d\\d?")){
            System.out.println("最初の1文字はA，2文字目は数字，3文字目は数字か無し：パターンに一致します");
        } else {
            System.out.println("最初の1文字はA，2文字目は数字，3文字目は数字か無し：パターンに一致しませんでした");
        }
        if(targetString.matches("^U[A-Z]{3}.*")){
            System.out.println("最初の1文字はU，2～4文字目は英大文字：パターンに一致します");
        } else {
            System.out.println("最初の1文字はU，2～4文字目は英大文字：パターンに一致しませんでした");
        }

        // 改行
        System.out.println("");
        
        // 15-4
        // 1. 現在の日時をDate型で取得
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        // 2. 取得した日時情報をCalendarにセット
        calendar.setTime(now);
        // 3. Calenderから「日」の数値を取得
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        // 4. 取得した値に100を足した値をCalendarの「日」にセット
        day += 100;
        calendar.set(Calendar.DAY_OF_MONTH, day);
        // 5. Calendarの日時情報をDate型に変換
        Date future = calendar.getTime();
        // 6. SimpleDateFormatを用いて，指定された形式でDateインスタンスの内容を表示
        SimpleDateFormat fmt = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(fmt.format(future));

        // 15-5
        // 1. 現在の日時をLocalDate型で取得
        LocalDate now2 = LocalDate.now();
        // 2. 取得した値に100を足した値をLocaldate型で取得
        LocalDate future2 = now2.plusDays(100);
        // 3. DateTimeFormatterを用いて，指定された形式でLocalDateインスタンスの内容を表示
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(future2.format(fmt2));
    }

    // 15-2
    public static String concatPath(String folder, String file) {
        // folderの末尾に\マークなければ付け足す
        if (!folder.endsWith("\\")) {
            folder += "\\";
        }
        String fullPath = folder + file;
        return fullPath; 
    }
}
