package br.com.fiap.game.model;

public class HabilidadeEspecial {
    private String nome;
    private int custoEnergia;
    private boolean habilitada;

    public HabilidadeEspecial(String nome, int custoEnergia, boolean habilitada) {
        this.nome = nome;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilitada;
    }

    public void ativarHabilidade() {
        habilitada = true;
    }

    public String getNome() {
        return nome;
    }

    public HabilidadeEspecial setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getCustoEnergia() {
        return custoEnergia;
    }

    public HabilidadeEspecial setCustoEnergia(int custoEnergia) {
        this.custoEnergia = custoEnergia;
        return this;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public HabilidadeEspecial setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
        return this;
    }
}
