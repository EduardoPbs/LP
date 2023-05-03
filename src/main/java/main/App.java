package main;

import br.edu.fema.model.Character.Character;
import br.edu.fema.model.Character.Tier;
import br.edu.fema.model.Character.Weapon;

import java.math.BigDecimal;

// Eduardo Soares - 2211550171
// João Pedro - 2211550211

public class App {
    public static void main(String[] args) {

        Character personagem1 = new Character(
                "Saber",
                new BigDecimal("4750.25"),// vida
                "F",//sexo
                Tier.TIER5,
                new BigDecimal("1425.55"),// dano
                new BigDecimal("197.49"),// dano crit
                new BigDecimal("38.63")// tax crit
        );
        personagem1.addWeapon(Weapon.SWORD);

        Character personagem2 = new Character(
                "Emiya",
                new BigDecimal("2127.79"),// vida
                "M",//sexo
                Tier.TIER4,
                new BigDecimal("888.64"),// dano
                new BigDecimal("125.23"),// dano crit
                new BigDecimal("30.97")// tax crit
        );
        personagem2.addWeapon(Weapon.BOW);

        System.out.println(personagem1);
        System.out.println(personagem2);

        personagem1.buffDamage();
        personagem2.buffDamage();
        System.out.println("=".repeat(31));

        System.out.println(personagem1);
        System.out.println(personagem2);
    }
}
