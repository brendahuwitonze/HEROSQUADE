package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void myHero()throws Exception{
        Hero myHero = Hero.setNewHero();
        assertTrue(myHero instanceof Hero);
    }

    @Test
    public void HeroName()throws Exception{
        Hero myHero = Hero.setNewHero();
        assertEquals ("Jesus",myHero.getName ());
    }
    @Test
    public void HeroAge()throws Exception{
        Hero myHero = Hero.setNewHero();
        assertEquals (20,myHero.getAge ());
    }
    @Test
    public void HeroPower()throws Exception{
        Hero myHero = Hero.setNewHero();
        assertEquals ("flying",myHero.getPower ());
    }
    @Test
    public void HeroWeakness()throws Exception{
        Hero myHero = Hero.setNewHero();
        assertEquals ("swimming",myHero.getWeakness ());
    }

}