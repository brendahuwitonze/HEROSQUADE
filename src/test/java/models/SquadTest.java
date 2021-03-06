
package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void newSquad_instantiatesCorrectly_true() {
        Squad newSquad = Squad.setSquad();
        assertTrue(newSquad instanceof Squad);
    }
    @Test
    public void newSquad_getName_String() {
        Squad newSquad = Squad.setSquad();
        assertEquals("Starwars",newSquad.getSquadName());
    }
    @Test
    public void newSquad_getSize_Int() {
        Squad newSquad = Squad.setSquad();
        assertEquals(2,newSquad.getSize());
    }
    @Test
    public void newSquad_getPower_String() {
        Squad newSquad = Squad.setSquad();
        assertEquals("fighter",newSquad.getCause());
    }
    @Test
    public void newSquad_getInstances_true() {
        Squad newSquad = Squad.setSquad();
        Squad another = Squad.setSquad();
        assertTrue(Squad.getInstances().contains(newSquad));
        assertTrue(Squad.getInstances().contains(another));
    }
    @Test
    public void newSquad_getSquadMembers_Array() {
        Squad newSquad = Squad.setSquad();
        Hero newHero = Hero.setHero();
        Hero newHero1 = Hero.setHero1();
        newSquad.setSquadMembers(newHero);
        assertEquals("Brendah",newSquad.getSquadMembers().get(0).getName());
    }

    @Test
    public void newSquad_allTestSquadMembers_Array() {
        Hero newHero = Hero.setHero();
        Squad newSquad = Squad.setSquad();
        newSquad.clearAllSquadMembers();
        newSquad.getSquadMembers().add(newHero);
        newSquad.getSquadMembers().add(newHero);
        assertEquals("Brendah",newSquad.getSquadMembers().get(0).getName());
    }
    @Test
    public void addMember_addsMemberToSquad_Hero(){
        Hero newHero = Hero.setHero();
        Squad testSquad = Squad.setSquad();
        Squad newSquad = Squad.findBySquadId(1);
        newSquad.clearAllSquadMembers();
        newSquad.getSquadMembers().add(newHero);
        newSquad.getSquadMembers().add(newHero);
        assertEquals(2,newSquad.getSquadMembers().size());
    }

    @Test
    public void setNewMember_hero(){
        Hero.clearAllHeroes();
        Hero newHwero = Hero.setHero();
        Squad testSquad = Squad.setSquad();
        testSquad.setSquadMembers(newHwero);

        assertEquals(1,testSquad.getSquadMembers().get(0).getId());
    }

}

























//package models;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class SquadTest {
//    public void mySquade() throws Exception{
//        Squad mySquad = Squad.setNewSquad();
//        assertTrue(mySquad instanceof Squad);
//    }
//    @Test
//    public void sName()throws Exception{
//        Squad mySquad = Squad.setNewSquad();
//        assertEquals ("captainmiles",mySquad.getSquadName ());
//    }
//
//    @Test
//    public void sSize()throws Exception{
//        Squad mySquad = Squad.setNewSquad();
//        assertEquals (3,mySquad.getSize ());
//    }
//    @Test
//    public void sCause()throws Exception{
//        Squad mySquad = Squad.setNewSquad();
//        assertEquals ("computer illiteracy",mySquad.getCause ());
//    }
//
//    @Test
//    public void newSquad_getInstances_true() {
//        Squad newSquad = Squad.setNewSquad();
//        Squad another = Squad.setNewSquad();
//        assertTrue(Squad.getInstances().contains(newSquad));
//        assertTrue(Squad.getInstances().contains(another));
//    }
//    @Test
//    public void newSquad_getSquadMembers_Array() {
//        Squad mySquad = Squad.setNewSquad();
//        Hero myHero = Hero.setNewHero();
//        mySquad.setSquadMembers(myHero);
//        assertEquals("Jesus",mySquad.getSquadMembers().get(0).getName());
//    }
//    @Test
//    public void newSquad_allTestSquadMembers_Array() {
//        Hero newHero = Hero.setNewHero();
//        Squad newSquad = Squad.setNewSquad();
//        newSquad.clearAllSqMembers();
//        newSquad.getSquadMembers().add(newHero);
//        newSquad.getSquadMembers().add(newHero);
//        assertEquals("Jesus",newSquad.getSquadMembers().get(0).getName());
//    }
//    @Test
//    public void addMember_addsMemberToSquad_Hero(){
//        Hero newHero = Hero.setNewHero();
//        Squad testSquad = Squad.setNewSquad();
//        Squad newSquad = Squad.findBySquadId(1);
//        newSquad.clearAllSqMembers();
//        newSquad.getSquadMembers().add(newHero);
//        newSquad.getSquadMembers().add(newHero);
//        assertEquals(2,newSquad.getSquadMembers().size());
//    }
//
//    @Test
//    public void setNewMember_hero(){
//        Hero.clearAllHeroes();
//        Hero newHwero = Hero.setNewHero();
//        Squad testSquad = Squad.setNewSquad();
//        testSquad.setSquadMembers(newHwero);
//
//        assertEquals(1,testSquad.getSquadMembers().get(0).getId());
//    }
//
//}
