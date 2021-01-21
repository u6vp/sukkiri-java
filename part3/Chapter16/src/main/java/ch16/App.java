package ch16;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        // 16-2
        List<Hero> heros = new ArrayList<>();

        Hero hero1 = new Hero("斎藤");
        Hero hero2 = new Hero("鈴木");
        
        heros.add(hero1);
        heros.add(hero2);
        
        Iterator<Hero> it = heros.iterator();
        while (it.hasNext()) {
            Hero hero = it.next();
            System.out.println(hero.getName());
        }

        // 16-3
        Map<Hero, Integer> heroMap = new HashMap<>();

        heroMap.put(hero1, 3);
        heroMap.put(hero2, 7);

        for (Hero key : heroMap.keySet()) {
            String name = key.getName();
            int score = heroMap.get(key);
            System.out.println(name + "が倒した敵＝" + score);
        }
    }
}
