import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Responsável por ler as informações digitadas pelo usuário
        PersonagemMagico personagem = new PersonagemMagico();

        int opcao; // Armazena a opção que o usuário vai escolher no menu.

        do { // Laço de repetição do-while
            System.out.println("Escolha uma opção:" +
                    "\n1-Cadastrar Personagem" +
                    "\n2-Exibir Personagem" +
                    "\n3-Atacar" +
                    "\n4-Aumentar Energia" +
                    "\n5-Ativar Habilidade Especial" +
                    "\n6-Habilitar Habilidade Especial" +
                    "\n0-Sair");
            opcao = sc.nextInt(); //Leitor de inteiros utilizando a classe Scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do personagem: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o poder do personagem: ");
                    String poder = sc.next() + sc.nextLine();
                    System.out.println("Digite o nível de energia do personagem: ");
                    int energia = sc.nextInt();
                    personagem.nome = nome;
                    personagem.poderMagico = poder;
                    personagem.nivelEnergia = energia;

                    System.out.println("Digite o nome da habilidade especial: ");
                    String nomeHabilidade = sc.next() + sc.nextLine();
                    System.out.println("Digite o custo de energia para usar a habilidade especial: ");
                    int custoHablilidade = sc.nextInt();
                    System.out.println("A habilidade está ativada? (true/false): ");
                    boolean habilidadeAtiva = sc.nextBoolean();

                    // Criando o objeto que representa a habilidade especial com os valores informados pelo usuário
                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, custoHablilidade, habilidadeAtiva);
                    //Atribuindo o objeto habilidade especial ao personagem
                    personagem.habilidade = habilidadeEspecial;
                    break;
                case 2:
                    System.out.println("Nome: " + personagem.nome + " Poder: " + personagem.poderMagico + " Energia: " + personagem.nivelEnergia);
                    System.out.println("Habilidade: " + personagem.habilidade.nome + " Custo energia: " + personagem.habilidade.custoEnergia + " Habilitada: " + personagem.habilidade.habilitada);
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
                    personagem.habilidade.ativarHabilidade();
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
