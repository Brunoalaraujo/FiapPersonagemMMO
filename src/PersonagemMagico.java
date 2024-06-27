public class PersonagemMagico {

    String nome;

    int nivelEnergia;

    String poderMagico;

    HabilidadeEspecial habilidade;

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
        if(nivelEnergia >= 10) {
            System.out.println(nome + " realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10;
        } else {
            System.out.println(nome + " está sem energia para atacar.");
        }
    }

    public int aumentarEnergia(int energia) {
        nivelEnergia += energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial() {
        if(!habilidade.habilitada){
            System.out.println("Habilidade especial não está ativada");
        } else if (nivelEnergia >= habilidade.custoEnergia) {
            System.out.println("Ativando a habilidade especial: " + habilidade.nome);
            nivelEnergia -= habilidade.custoEnergia;
        } else {
            System.out.println(nome + " está sem energia para a habilidade especial.");
        }
    }
}
