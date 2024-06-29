package br.com.fiap.game.model;

public class Item {
    private String nome;
    private String descricao;
    private boolean raro;
    private int nivelPoder;

    public Item(String nome, String descricao, boolean raro, int nivelPoder) {
        this.nome = nome;
        this.descricao = descricao;
        this.raro = raro;
        this.nivelPoder = nivelPoder;
    }

    public Item() {
    }

    public String getNome() {
        return nome;
    }

    public Item setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Item setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public boolean isRaro() {
        return raro;
    }


    public Item setRaro(boolean raro) {
        this.raro = raro;
        return this;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }
}
