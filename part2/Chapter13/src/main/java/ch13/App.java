package ch13;

public class App 
{
    public static void main( String[] args )
    {
        Hero hero = new Hero();
        Wizard wizard = new Wizard();
        Wand wand = new Wand();

        wand.setPower(50);
        wizard.setWand(wand);
        wizard.heal(hero);
    }
}
