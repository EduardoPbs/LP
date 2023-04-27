package main;

import br.edu.fema.model.character.Personagem;
import br.edu.fema.model.character.Tier;
import br.edu.fema.model.character.Weapon;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        Personagem p1 = new Personagem(
                "Diluc",
                Weapon.CLAYMORE.getWeaponType(),
                new BigDecimal("2000"), // vida
                "Masc",
                Tier.TIER5,
                new BigDecimal("200"),  // dano
                new BigDecimal("50"),   // critico
                new BigDecimal("20")    // taxa
        );


        System.out.println(p1.getNome());
        System.out.println(p1.getVida());
        System.out.println(p1.getDano());
        System.out.println(p1.getArma());
        System.out.println(p1);
    }
}
