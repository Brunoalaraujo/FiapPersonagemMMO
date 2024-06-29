package br.com.fiap.game.model;

public class PersonagemMagico {

    private String nome;

    private int nivelEnergia;

    private String poderMagico;

    private HabilidadeEspecial habilidade;

    //Criação de um construtor
    public PersonagemMagico(String nome, int nivelEnergia, String poderMagico) {
        this.nome = nome; //this server para ligar o parâmetro do construtor ao atributo. Observar a diferença de cores
        this.nivelEnergia = nivelEnergia;
        this.poderMagico = poderMagico;
    }

    //Outra opção de inicar o construtor da classe
    public PersonagemMagico(String nome) {
        this.nome = nome;
    }

    //Construtor padrão do Java
    public PersonagemMagico() {
    }

    //Criando método para atacar
    public void atacar(String ataque) {
        if(nivelEnergia >= habilidade.getCustoEnergia()) {
            System.out.println(nome + " realizou um ataque: " + ataque + "!");
            nivelEnergia -= habilidade.getCustoEnergia();
        } else {
            System.out.println(nome + " está sem energia para atacar.");
        }
    }

    public int aumentarEnergia(int energia) {
        nivelEnergia += energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial() {
        if(!habilidade.isHabilitada()){
            System.out.println("Habilidade especial não está ativada");
        } else if (nivelEnergia >= habilidade.getCustoEnergia()) {
            System.out.println("Ativando a habilidade especial: " + habilidade.getNome());
            nivelEnergia -= habilidade.getCustoEnergia();
        } else {
            System.out.println(nome + " está sem energia para a habilidade especial.");
        }
    }

    public String getNome() {
        return nome;
    }

    public PersonagemMagico setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public PersonagemMagico setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
        return this;
    }

    public String getPoderMagico() {
        return poderMagico;
    }

    public PersonagemMagico setPoderMagico(String poderMagico) {
        this.poderMagico = poderMagico;
        return this;
    }

    public HabilidadeEspecial getHabilidade() {
        return habilidade;
    }

    public PersonagemMagico setHabilidade(HabilidadeEspecial habilidade) {
        this.habilidade = habilidade;
        return this;
    }
}
