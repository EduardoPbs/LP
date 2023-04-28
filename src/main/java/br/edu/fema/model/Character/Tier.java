package br.edu.fema.model.Character;

import java.math.BigDecimal;

public enum Tier {
    TIER3(
            new BigDecimal("200"), // vida
            new BigDecimal("120"), // dano
            new BigDecimal("40"),  // critico
            new BigDecimal("10")   // taxa
    ),

    TIER4(
            new BigDecimal("350"),
            new BigDecimal("150"),
            new BigDecimal("45"),
            new BigDecimal("15")
    ),

    TIER5(
            new BigDecimal("500"),
            new BigDecimal("200"),
            new BigDecimal("50"),
            new BigDecimal("20")
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
