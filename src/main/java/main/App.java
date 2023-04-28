package main;

import br.edu.fema.model.Character.Character;
import br.edu.fema.model.Character.Tier;
import br.edu.fema.model.Character.Weapon;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        Character p1 = new Character(
                "HuTao",
                new BigDecimal("2000.00"),// vida
                "Fem",//sexo
                Tier.TIER5,
                new BigDecimal("2000.00"),// dano
                new BigDecimal("2000.00"),// dano crit
                new BigDecimal("2000.00")// tax crit
        );

        p1.addWeapon(Weapon.SPEAR);

        System.out.println(p1);

        p1.buffDamage();

        System.out.println(p1);
    }
}
