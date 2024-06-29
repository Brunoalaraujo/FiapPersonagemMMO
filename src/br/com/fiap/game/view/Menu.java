package br.com.fiap.game.view;

import br.com.fiap.game.model.HabilidadeEspecial;
import br.com.fiap.game.model.PersonagemMagico;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Responsável por ler as informações digitadas pelo usuário
        PersonagemMagico personagem = new PersonagemMagico();

        int opcao; // Armazena a opção que o usuário vai escolher no menu.

        do { // Laço de repetição do-while
            System.out.println("""
                    Escolha uma opção:\

                    1-Cadastrar Personagem\

                    2-Exibir Personagem\

                    3-Atacar\

                    4-Aumentar Energia\

                    5-Ativar Habilidade Especial\

                    6-Habilitar Habilidade Especial\

                    0-Sair""");
            opcao = sc.nextInt(); //Leitor de inteiros utilizando a classe Scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do personagem: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o poder do personagem: ");
                    String poder = sc.next() + sc.nextLine();
                    System.out.println("Digite o nível de energia do personagem: ");
                    int energia = sc.nextInt();
                    personagem.setNome(nome).setPoderMagico(poder).setNivelEnergia(energia);

                    System.out.println("Digite o nome da habilidade especial: ");
                    String nomeHabilidade = sc.next() + sc.nextLine();
                    System.out.println("Digite o custo de energia para usar a habilidade especial: ");
                    int custoHablilidade = sc.nextInt();
                    System.out.println("A habilidade está ativada? (true/false): ");
                    boolean habilidadeAtiva = sc.nextBoolean();

                    // Criando o objeto que representa a habilidade especial com os valores informados pelo usuário
                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, custoHablilidade, habilidadeAtiva);
                    //Atribuindo o objeto habilidade especial ao personagem
                    personagem.setHabilidade(habilidadeEspecial);
                    break;
                case 2:
                    System.out.println("Nome: " + personagem.getNome() + " Poder: " + personagem.getPoderMagico() + " Energia: " + personagem.getNivelEnergia());
                    System.out.println("Habilidade: " + personagem.getHabilidade().getNome() + " Custo energia: " + personagem.getHabilidade().getCustoEnergia() + " Habilitada: " + personagem.getHabilidade().isHabilitada());
                    break;
                case 3:
                    System.out.println("Digite o nome do ataque: ");
                    String ataque = sc.next() + sc.nextLine();
                    personagem.atacar(ataque);
                    break;
                case 4:
                    System.out.println("Digite a quantidade de energia: ");
                    int quantidadeEnergia = sc.nextInt();
                    int nivelAtual = personagem.aumentarEnergia(quantidadeEnergia);
                    System.out.println("Nivel atual de energia: " + nivelAtual);
                    break;
                case 5:
                    personagem.ativarHabilidadeEspecial();
                    break;
                case 6:
                    personagem.getHabilidade().ativarHabilidade();
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
        sc.close(); //Fechamento do Scanner
    }
}
