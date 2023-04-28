package br.edu.fema.model.Character;


public enum Weapon {
    SWORD("Sword"),
    CLAYMORE("Claymore"),
    BOW("Bow"),
    SPEAR("Spear"),
    CATALYST("Catalyst");

    final String weaponType;

    Weapon(String weaponType){
        this.weaponType = weaponType;
    }
}
