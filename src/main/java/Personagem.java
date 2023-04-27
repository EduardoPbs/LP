import java.math.BigDecimal;


public abstract class Personagem {
    final String Nome;
    private BigDecimal Vida;
    // Instancia elemento do personagem
    // Instancia arma do personagem Lista
    private String Sexo;
    private Tier tier;
    private BigDecimal Dano;
    private BigDecimal DanoCritico;
    private BigDecimal TaxaCritica;

    public Personagem(
            String Nome,
            BigDecimal Vida,
            String Sexo,
            Tier tier,
            BigDecimal Dano,
            BigDecimal DanoCritico,
            BigDecimal TaxaCritica
    ){
        this.Nome = Nome;
        this.Vida = Vida;
        this.Sexo = Sexo;
        this.tier = tier;
        this.Dano = new BigDecimal("0.00");
        this.DanoCritico = new BigDecimal("0.00");
        this.TaxaCritica = new BigDecimal("0.00");
    }

    @Override
    public String toString() {
        return "O personagem " + this.Nome + " foi criado com sucesso!";
    }
}