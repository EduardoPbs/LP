import java.math.BigDecimal;

public abstract class BaseAttributes {
    private BigDecimal Vida;
    private String Sexo;
    private Tier tier;
    private BigDecimal Dano;
    private BigDecimal DanoCritico;
    private BigDecimal TaxaCritica;

    public BaseAttributes(
            BigDecimal Vida,
            String Sexo,
            Tier Tier,
            BigDecimal Dano,
            BigDecimal DanoCritico,
            BigDecimal TaxaCritica
    ){
        this.Vida = Vida;
        this.Sexo = Sexo;
        this.tier = Tier;
        this.Dano = new BigDecimal("0.00");
        this.DanoCritico = new BigDecimal("0.00");
        this.TaxaCritica = new BigDecimal("0.00");
    }
}
