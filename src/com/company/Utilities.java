package com.company;

public class Utilities {

    //Healing
    private int firstAid;
    private int firstAidAmount = 0;
    private int adrenalineSyringe;
    private int adrenalineSyringeAmount = 0;

    //Weapon
    private int weaponDamageMin;
    private int weaponDamageMax;
    private int mag;
    private final int HANDGRENADE = 100;
    private int handgrenadeAmount = 0;


    //Default constructor
    public Utilities() {
    }

    //HÃ¥ndgranat Contructor
    public Utilities(int handgrenadeAmount) {
        this.handgrenadeAmount = handgrenadeAmount;
    }

    //Weapon Constructor
    public Utilities(int weaponDamageMin, int weaponDamageMax, int mag) {

        this.weaponDamageMin = weaponDamageMin;
        this.weaponDamageMax = weaponDamageMax;
        this.mag = mag;
    }

    //Metoder
    public void firstAidKit(Player player) {

        if (getFirstAidAmount() >= 1) {
            player.setPlayerHP(player.getPlayerHP() + 65);
            System.out.println(player.getPlayerName() + " healed for: 65");

            setFirstAidAmount(getFirstAidAmount() - 1);
        } else {
            System.out.println("You don't have a first aid kit!");
        }
    }

    public void adrenalineSyringe(Player player) {

        if (getAdrenalineSyringe() >= 1) {
            player.setPlayerHP(player.getPlayerHP() + 35);
            System.out.println(player.getPlayerName() + " healed for: " + getAdrenalineSyringe());
            setAdrenalineSyringeAmount(getAdrenalineSyringe() - 1);
        } else {
            System.out.println("You don't have any adrenaline syringes!");
        }
    }


    //Getters and setters
    public int getFirstAid() {
        return firstAid;
    }
    public void setFirstAid(int firstAid) {
        this.firstAid = firstAid;
    }

    public int getFirstAidAmount() {
        return firstAidAmount;
    }
    public void setFirstAidAmount(int firstAidAmount) {
        this.firstAidAmount = firstAidAmount;
    }

    public int getAdrenalineSyringe() {
        return adrenalineSyringe;
    }
    public void setAdrenalineSyringe(int adrenalineSyringe) {
        this.adrenalineSyringe = adrenalineSyringe;
    }
    public int getAdrenalineSyringeAmount() {
        return adrenalineSyringeAmount;
    }

    public void setAdrenalineSyringeAmount(int adrenalineSyringeAmount) {
        this.adrenalineSyringeAmount = adrenalineSyringeAmount;
    }
    public int getWeaponDamageMin() {
        return weaponDamageMin;
    }

    public void setWeaponDamageMin(int weaponDamageMin) {
        this.weaponDamageMin = weaponDamageMin;
    }
    public int getWeaponDamageMax() {
        return weaponDamageMax;
    }

    public void setWeaponDamageMax(int weaponDamageMax) {
        this.weaponDamageMax = weaponDamageMax;
    }
    public int getMag() {
        return mag;
    }

    public void setMag(int mag) {
        this.mag = mag;
    }
    public int getHANDGRENADE() {
        return HANDGRENADE;
    }

    public int getHandgrenadeAmount() {
        return handgrenadeAmount;
    }
    public void setHandgrenadeAmount(int handgrenadeAmount) {
        this.handgrenadeAmount = handgrenadeAmount;
    }
}