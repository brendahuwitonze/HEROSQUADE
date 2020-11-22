package models;

import java.util.ArrayList;

public class Squad {
    private String sqName;
    private int maxSize;
    private String cause;
    private  int sqId;
    private ArrayList<Hero> sqMembers = new ArrayList<>();
    private static ArrayList<Squad> instances = new ArrayList<>();


    public Squad(String name, int size, String cause ){
        sqName=name;
        maxSize=size;
        this.cause=cause;
        this.sqMembers=new ArrayList<> ();
        instances.add (this);
        this.sqId=instances.size ();
    }
    public int getSquadId(){
        return sqId;
    }

    public static Squad findBySquadId(int id) {
        return instances.get(id-1);
    }
    public String getSquadName() {
        return sqName;
    }
    public int getSize() {
        return maxSize;
    }
    public String getCause() {
        return this.cause;
    }
    public static ArrayList<Squad> getInstances(){
        return instances;
    }
    public ArrayList<Hero> getSquadMembers(){
        return sqMembers;
    }
    public void setSquadMembers(Hero newMember) {
        sqMembers.add(newMember);
    }
    public static void clearAllSquads(){
        instances.clear();
    }
    public void clearAllSqMembers(){
        getSquadMembers().clear();
    }
    public static Squad setNewSquad(){
        return new Squad("captainmiles",3,"computer illiteracy");
    }
    }

