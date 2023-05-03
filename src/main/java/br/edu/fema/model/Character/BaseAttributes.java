package br.edu.fema.model.Character;

import br.edu.fema.model.Interface.Buff;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        return health.add(additionalValue.getBaseHealth()).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getDamage() {
        return damage.add(additionalValue.getBaseDamage()).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getCritDamage() {
        return critDamage.add(additionalValue.getCritDamage()).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getCritRate() {
        return critRate.add(additionalValue.getCritRate()).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public void buffDamage() {
        this.damage = this.getDamage().multiply(new BigDecimal("1.10"));
    }

}
