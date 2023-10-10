package com.myjavaprojects.mygame;

public class PlayerTwo extends PlayerOne {
    private int health;
    private boolean armour;

    public PlayerTwo(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    public void Heal(){
        if(this.health <= 0){
            System.out.println("Player cannot heal is dead");
        }else{
            this.health = 100;
            setHealth(100);
            System.out.println("Player healed " + this.health);
        }
    }



    @Override
    public void damageByGunOne() {
        if (armour) {
            this.health -= 20;
            if (this.health <= 0)
                this.health = 0;
            System.out
                    .println("Armour is on and got hit by gun one, health reduced by 20. New health is " + this.health);
        }
        if (!armour) {
            this.health -= 30;
            if (this.health <= 0)
                this.health = 0;
            System.out
                    .println("Armour is on and got hit by gun one, health reduced by 30. New health is " + this.health);
        }

        if (this.health == 0) {
            System.out.println(getName() + " is dead.");
        }

    }

    @Override
    public void damageByGunTwo() {
        if (armour) {
            this.health -= 40;
            if (this.health <= 0)
                this.health = 0;
            System.out
                    .println("Armour is on and got hit by gun one, health reduced by 40. New health is " + this.health);
        }
        if (!armour) {
            this.health -= 50;
            if (this.health <= 0)
                this.health = 0;
            System.out
                    .println("Armour is on and got hit by gun one, health reduced by 50. New health is " + this.health);
        }

        if (this.health == 0) {
            System.out.println(getName() + " is dead.");
        }
    }



    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "PlayerTwo: name -> " + getName() + ", weapon -> " + getWeapon() + ", health -> " + getHealth();
    }




}
