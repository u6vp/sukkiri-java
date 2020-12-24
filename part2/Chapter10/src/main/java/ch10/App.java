package ch10;

public class App 
{
    public static void main( String[] args )
    {
        Hero h = new Hero();
        //h.run();
        SuperHero sh = new SuperHero();
        sh.name = "超ミナト";
        sh.hp = 150;
        //sh.run();

        //Weapon w = new Weapon();
        //System.out.println(w.name);

        // 毒キノコの攻撃によるHPの変動の確認
        System.out.println("ミナトの現在のHP：" + h.hp + ", 超ミナトの現在のHP：" + sh.hp);
        PoisonMatango pm = new PoisonMatango('A');
        pm.attack(h);
        pm.attack(sh);
        System.out.println("ミナトの現在のHP：" + h.hp + ", 超ミナトの現在のHP：" + sh.hp);
    }
}
