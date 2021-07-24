package com.company;

public abstract class Hero implements HavingSuperAbiliity {

    int Health;
    int Damage;
    String typeofAttack;

    public Hero (int health,int damage){
        this.Health = health;
        this.Damage = damage;
    }

}
