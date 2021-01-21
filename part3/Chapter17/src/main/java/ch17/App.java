package ch17;

import java.io.IOException;

public class App 
{
    public static void main ( String[] args ) throws IOException
    {
        // 17-1
        // String s = null;
        // System.out.println(s.length());

        // 17-2
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException例外をcatchしました");
            System.out.println("－－スタックトレース（ここから）－－");
            e.printStackTrace();
            System.out.println("－－スタックトレース（ここまで）－－");
        }

        // 17-3
        try {
            String str = "三";
            int i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException例外をcatchしました");
        }

        // 17-4
        throw new IOException("IOException例外が発生しました");
    }
}
