import java.math.BigDecimal;


public class Personagem {
    private String Nome;
    private BigDecimal Vida;
    // Instancia elemento do personagem
    private Weapon arma;
    private String Sexo;
    private Tier tier;
    private BigDecimal Dano;
    private BigDecimal DanoCritico;
    private BigDecimal TaxaCritica;

    public Personagem(
            String Nome,
            BigDecimal Vida,
            String Sexo,
            Tier Tier,
            BigDecimal Dano,
            BigDecimal DanoCritico,
            BigDecimal TaxaCritica
    ){
        this.Nome = Nome;
        this.Vida = Vida;
        this.Sexo = Sexo;
        this.tier = Tier;
        this.Dano = new BigDecimal("0.00");
        this.DanoCritico = new BigDecimal("0.00");
        this.TaxaCritica = new BigDecimal("0.00");
    }

    @Override
    public String toString() {
        return "Personagem " + this.Nome + " criado!";
    }
}