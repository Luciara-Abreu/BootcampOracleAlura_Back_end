package br.com.luci.animais;

public class Animal {
    private String nome;
    private int idade;
    private String sexo;
    private double altura;
    private int quantidadePatas;

    public Animal(String nome, int idade, String sexo, double altura, int quantidadePatas) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.quantidadePatas = quantidadePatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome= '" + nome + '\'' +
                ", idade= " + idade +
                ", sexo= '" + sexo + '\'' +
                ", altura= " + altura +
                ", quantidadePatas= " + quantidadePatas +
                '}';
    }
}
