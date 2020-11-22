package models;

import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static ArrayList<Hero>instances=new ArrayList<> ();
    public Hero(String name,int age,String power,String weakness){
        this.name=name;
        this.age=age;
        this.power=power;
        this.weakness=weakness;
        instances.add(this);
        this.id=instances.size ();
    }

    public static ArrayList<Hero> getInstances (){
        return instances;
    }

    public static void setInstances (ArrayList<Hero> instances){
        Hero.instances=instances;
    }

    public int getId (){
        return id;
    }

    public void setId (int id){
        this.id=id;
    }

    public String getWeakness (){
        return weakness;
    }

    public void setWeakness (String weakness){
        this.weakness=weakness;
    }

    public String getPower (){
        return power;
    }

    public void setPower (String power){
        this.power=power;
    }

    public int getAge (){
        return age;
    }

    public void setAge (int age){
        this.age=age;
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name=name;
    }
}
