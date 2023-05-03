package br.edu.fema.model.Character;

import java.math.BigDecimal;

public enum Tier {
    TIER3(
            new BigDecimal("238.68"), // vida
            new BigDecimal("168.26"), // dano
            new BigDecimal("44.21"),  // critico
            new BigDecimal("10.68")   // taxa
    ),

    TIER4(
            new BigDecimal("364.13"),
            new BigDecimal("228.44"),
            new BigDecimal("50.97"),
            new BigDecimal("16.52")
    ),

    TIER5(
            new BigDecimal("496.52"),
            new BigDecimal("293.96"),
            new BigDecimal("59.71"),
            new BigDecimal("23.53")
    );

    final BigDecimal health;
    final BigDecimal damage;
    final BigDecimal critDamage;
    final BigDecimal critRate;

    Tier(BigDecimal health, BigDecimal damage, BigDecimal critDamage, BigDecimal critRate){
        this.health = health;
        this.damage = damage;
        this.critDamage = critDamage;
        this.critRate = critRate;
    }

    public BigDecimal getBaseHealth(){
        return this.health;
    }

    public BigDecimal getBaseDamage(){
        return this.damage;
    }

    public BigDecimal getCritDamage(){
        return this.critDamage;
    }

    public BigDecimal getCritRate(){
        return this.critRate;
    }

}
