//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando um objeto do tipo Personagem Mágico
        PersonagemMagico mago = new PersonagemMagico("Gandalf", 100, "Magia");

//        Atribuindo valores aos atributos do objeto
//        mago.nome = "Gandalf";
//        mago.nivelEnergia = 100;
//        mago.poderMagico = "Magia";

        //Exibindo valores dos atributos do objeto
        System.out.println(mago.nome + " Energia: " + mago.nivelEnergia + " Poder: " + mago.poderMagico);//Atribuindo valores aos atributos do objeto

        // Novo Personagem
        PersonagemMagico elfo = new PersonagemMagico("Legoas", 50, "Arqueiro");

        //Exibindo valores dos atributos do objeto
        System.out.println(elfo.nome + " Energia: " + elfo.nivelEnergia + " Poder: " + elfo.poderMagico);

        //Usando construtor alternativo
        PersonagemMagico orc = new PersonagemMagico("Saruman");

        System.out.println("Nome do orc: " + orc.nome);

    }
}