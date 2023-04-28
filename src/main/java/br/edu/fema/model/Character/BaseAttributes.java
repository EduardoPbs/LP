package br.edu.fema.model.Character;

import br.edu.fema.model.Interface.Buff;

import java.math.BigDecimal;

public abstract class BaseAttributes implements Buff {
    private  BigDecimal health;
    private  BigDecimal damage;
    private  BigDecimal critDamage;
    private  BigDecimal critRate;
    private  Tier additionalValue;


    public BaseAttributes(
            BigDecimal health,
            BigDecimal damage,
            BigDecimal critDamage,
            BigDecimal critRate,
            Tier additionalValue

    ){
        this.health = health;
        this.damage = damage;
        this.critDamage = critDamage;
        this.critRate = critRate;
        this.additionalValue = additionalValue;
    }

    public BigDecimal getHealth() {
        return health.add(additionalValue.getBaseHealth());
    }

    public BigDecimal getDamage() {
        return damage.add(additionalValue.getBaseDamage());
    }

    public BigDecimal getCritDamage() {
        return critDamage.add(additionalValue.getCritDamage());
    }

    public BigDecimal getCritRate() {
        return critRate.add(additionalValue.getCritRate());
    }

    @Override
    public void buffDamage() {
        this.damage = this.damage.multiply(new BigDecimal("1.10"));
    }

}
