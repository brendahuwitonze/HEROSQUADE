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

    public static ArrayList<Hero> getAllInstances (){
        return instances;
    }
    public static void clearAllHeroes(){
        instances.clear();
    }
    public static Hero findById(int id) {return instances.get(id-1);}

    public int getId (){
        return id;
    }

    public String getWeakness (){
        return weakness;
    }


    public String getPower (){
        return power;
    }


    public int getAge (){
        return age;
    }

    public String getName (){
        return this.name;
    }
    public static Hero setNewHero(){
        return new Hero("Jesus",20,"flying","swimming");
    }

}
