package br.edu.fema.model.character;

import java.math.BigDecimal;

public class Personagem extends BaseAttributes{
    private String Nome;
    private String Arma;
    private String Sexo;
    private Tier Tier;


    public Personagem(
            String Nome,
            String Arma,
            BigDecimal Vida,
            String Sexo,
            Tier Tier,
            BigDecimal Dano,
            BigDecimal DanoCritico,
            BigDecimal TaxaCritica

    ){
        super(Vida, Dano, DanoCritico, TaxaCritica, Tier);
        this.Nome = Nome;
        this.Arma = Arma;
        this.Sexo = Sexo;
        this.Tier = Tier;
    }

    public String getNome() {
        return Nome;
    }

    public String getArma() {
        return Arma;
    }

    public String getSexo() {
        return Sexo;
    }

    public Tier getTier() {
        return Tier;
    }

    private String newLine = System.getProperty("line.separator");

    @Override
    public String toString() {
        return ("  _________Personagem_________  " + newLine +
                " | Nome: " + this.getNome() + newLine +
                " | Vida: " + this.getVida() + newLine +
                " | Arma: " + this.getArma() + newLine +
                " | Dano: " + this.getDano() + newLine +
                " | Dano Critico: " + this.getDanoCritico() + newLine +
                " | Taxa Critica: " + this.getTaxaCritica()
                );
    }
}