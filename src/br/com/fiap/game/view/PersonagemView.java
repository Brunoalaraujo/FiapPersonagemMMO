package br.com.fiap.game.view;

import br.com.fiap.game.model.PersonagemMagico;

public class PersonagemView {
    public static void main(String[] args) {
        // Criando um objeto do tipo Personagem Mágico
        PersonagemMagico mago = new PersonagemMagico("Gandalf", 100, "Magia");

//        Atribuindo valores aos atributos do objeto
//        mago.nome = "Gandalf";
//        mago.nivelEnergia = 100;
//        mago.poderMagico = "Magia";

        //Exibindo valores dos atributos do objeto
        System.out.println(mago.getNome() + " Energia: " + mago.getNivelEnergia() + " Poder: " + mago.getPoderMagico());//Atribuindo valores aos atributos do objeto

        // Novo Personagem
        PersonagemMagico elfo = new PersonagemMagico("Legoas", 50, "Arqueiro");

        //Exibindo valores dos atributos do objeto
        System.out.println(elfo.getNome() + " Energia: " + elfo.getNivelEnergia() + " Poder: " + elfo.getPoderMagico());

        //Usando construtor alternativo
        PersonagemMagico orc = new PersonagemMagico("Saruman");

        System.out.println("Nome do orc: " + orc.getNome());

    }
}