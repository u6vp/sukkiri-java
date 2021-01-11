package ch14;

public class App 
{
    public static void main( String[] args )
    {
        // 14-1-1
        Account a = new Account();
        a.accountNumber = "4649";
        a.balance = 1592;
        // toString()の内容の表示
        System.out.println(a);

        // 14-1-2
        Account b = new Account();
        b.accountNumber = " 4649";
        b.balance = 1592;

        if(a.equals(b)) {
            System.out.println("aとbは同一の銀行口座です");
        } else {
            System.out.println("aとbは同一の銀行口座ではありません");
        }

        // 14-2
        System.out.println("Clericの最大HPは：" + Cleric.MAX_HP);
        System.out.println("Clericの最大MPは：" + Cleric.MAX_MP);
    }
}
