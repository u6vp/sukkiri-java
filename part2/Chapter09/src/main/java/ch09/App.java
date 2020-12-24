package ch09;

public class App 
{
    public static void heal(int hp) {
        hp += 10; // このメソッド内でしか存在しない変数hpが変化するだけ
    }

    public static void heal(Thief thief) {
        thief.hp += 10; // 参照されたthief型のインスタンスのhpフィールドに変化を与えている
    }

    public static void main( String[] args )
    {
        /** text sample
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damege = 10;
        Hero h1 = new Hero("ミナト");
        //h1.name = "ミナト";
        h1.hp = 100;
        h1.sword = s;
        System.out.println("現在の武器は" + h1.sword.name);
        h1.attack();
        Hero h2 = new Hero();
        //h2.name = "アサカ";
        h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1); // ミナトを回復 (HP:100 -> 110)
        w.heal(h2); // アサカを回復 (HP:100 -> 110)
        w.heal(h2); // アサカを回復 (HP:110 -> 120)
        System.out.println(h2.hp);
        */

        // pr9-2
        int baseHp = 25;
        Thief t = new Thief("アサカ", baseHp); // 生成されたthief型のインスタンスのアドレス情報を持つ
        System.out.println(baseHp + " : " + t.hp);
        heal(baseHp); // t.hpは変化しない
        heal(t); // t.hpが10加算される
        System.out.println(baseHp + " : " + t.hp);
    }
}
