import java.math.BigDecimal;

public enum Tier {
    TIER3(
            new BigDecimal("200"),
            new BigDecimal("120"),
            new BigDecimal("40"),
            new BigDecimal("10")

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


    final BigDecimal vida;
    final BigDecimal dano;
    final BigDecimal danoCritico;
    final BigDecimal taxaCritica;

    Tier(BigDecimal vida, BigDecimal dano, BigDecimal danoCritico, BigDecimal taxaCritica){
        this.vida = vida;
        this.dano = dano;
        this.danoCritico = danoCritico;
        this.taxaCritica = taxaCritica;
    }

    public BigDecimal getVidaBase(){
        return this.vida;
    }

    public BigDecimal getDanoBase(){
        return this.dano;
    }

    public BigDecimal getDanoCritico(){
        return this.danoCritico;
    }

    public BigDecimal getTaxaCritica(){
        return this.taxaCritica;
    }

}
