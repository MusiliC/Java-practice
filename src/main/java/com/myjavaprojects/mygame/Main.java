package com.myjavaprojects.mygame;

public class Main {
    public static void main(String[] args) {
        PlayerOne playerOne = new PlayerOne("Musili", "Short gun", 500);
        // System.out.println(playerOne);
        // playerOne.damageByGunTwo();       
        // playerOne.damageByGunOne();
        // System.out.println(playerOne);

        PlayerTwo playerTwo = new PlayerTwo("Brian", "machete", 70, true);
        System.out.println(playerTwo);
        playerTwo.damageByGunTwo();
        playerTwo.Heal();
        System.out.println(playerTwo);
    }
}
