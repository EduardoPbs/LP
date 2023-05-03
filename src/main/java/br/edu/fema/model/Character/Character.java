package br.edu.fema.model.Character;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Character extends BaseAttributes {
    private String name;
    private String sex;
    private Tier tier;
    private List<Weapon> weapons;

    public Character(
            String name,
            BigDecimal health,
            String sex,
            Tier tier,
            BigDecimal damage,
            BigDecimal critDamage,
            BigDecimal critRate

    ){
        super(health, damage, critDamage, critRate, tier);
        this.name = name;
        this.weapons = new ArrayList<>();
        this.sex = sex;
        this.tier = tier;
    }

    public String getName() {
        return name;
    }

    public List<Weapon> getWeapon() {
        return weapons;
    }

    public String getSex() {
        return sex;
    }

    public Tier getTier() {
        return tier;
    }

    public void addWeapon(Weapon weapon){
        this.weapons.add(weapon);
    }

    private String newLine = System.getProperty("line.separator");

    @Override
    public String toString() {
        return ("  _________Character_________  " + newLine +
                " | Name: " + this.getName() + newLine +
                " | Health: " + this.getHealth() + newLine +
                " | Weapon: " + this.getWeapon() + newLine +
                " | Damage: " + this.getDamage() + newLine +
                " | CritDamage: " + this.getCritDamage() + newLine +
                " | CritRate: " + this.getCritRate()
                );
    }


}