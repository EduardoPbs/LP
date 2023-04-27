package br.edu.fema.model.character;

import java.math.BigDecimal;

public abstract class BaseAttributes {
    private  BigDecimal Vida;
    private  BigDecimal Dano;
    private  BigDecimal DanoCritico;
    private  BigDecimal TaxaCritica;
    private  Tier valoresAdicionais;


//    public br.edu.fema.model.character.BaseAttributes(){}

    public BaseAttributes(
            BigDecimal Vida,
            BigDecimal Dano,
            BigDecimal DanoCritico,
            BigDecimal TaxaCritica,
            Tier valoresAdicionais

    ){
        this.Vida = Vida;
        this.Dano = Dano;
        this.DanoCritico = DanoCritico;
        this.TaxaCritica = TaxaCritica;
        this.valoresAdicionais = valoresAdicionais;
    }

    public BigDecimal getVida() {
        return Vida.add(valoresAdicionais.getVidaBase());
    }

    public BigDecimal getDano() {
        return Dano.add(valoresAdicionais.getDanoBase());
    }

    public BigDecimal getDanoCritico() {
        return DanoCritico.add(valoresAdicionais.getDanoCritico());
    }

    public BigDecimal getTaxaCritica() {
        return TaxaCritica.add(valoresAdicionais.getTaxaCritica());
    }

    //public BigDecimal getValoresAdicionais() {
    //    return valoresAdicionais;
    //}
}
