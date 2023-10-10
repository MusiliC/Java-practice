package com.myjavaprojects.mygame;

public class PlayerOne {
    private String name;
    private String weapon;
    private int health;
    private boolean canSwim;
    
    

    public PlayerOne(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health < 0 || health > 100){
            this.health = 100;
        }else  this.health = health;
    }

    public void damageByGunOne() {
        this.health -= 30;
        if (this.health <= 0) {
            this.health = 0;
        }

        System.out.println(getName() +  " Got hit by gun one, health is reduced by 30: New health is: " + this.health);

        if (this.health == 0) {
            System.out.println(getName() + " is dead.");
        }
    }

    public void damageByGunTwo() {
        this.health -= 50;
        if (this.health <= 0) {
            this.health = 0;
        }

        System.out.println(getName() + " Got hit by gun two, health is reduced by 50: New health is: " + this.health);

        if (this.health == 0) {
            System.out.println(getName() + " is dead.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "PlayerOne: name -> " + name + ", weapon -> " + weapon + ", health -> " + health;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    

}
