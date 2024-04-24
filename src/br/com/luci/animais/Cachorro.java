package br.com.luci.animais;

public class Cachorro extends Animal{
    private String tipoDePelo;
    private String tipoAlimentacao;

    public Cachorro(String nome, int idade, String sexo, double altura, int quantidadePatas) {
        super(nome, idade, sexo, altura, quantidadePatas);
    }

    public String getTipoDePelo() {
        return tipoDePelo;
    }

    public void setTipoDePelo(String tipoDePelo) {
        this.tipoDePelo = tipoDePelo;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }
}
