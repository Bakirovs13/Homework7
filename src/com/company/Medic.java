package com.company;

public  class Medic extends Hero{
    public Medic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("\uD83E\uDDD1\u200D️" +"Medic применил суперспособность critical damage");
    }
}
