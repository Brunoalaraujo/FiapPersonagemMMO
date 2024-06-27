import java.util.Scanner;

public class ItemVew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item item = new Item();
        int opcao = 0;
        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Item \n2-Exibir Item \n0-Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do item: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite a descrição do item: ");
                    String descricao = sc.next() + sc.nextLine();
                    System.out.println("O item é raro? (true ou false): ");
                    boolean raro = sc.nextBoolean();
                    System.out.println("Digite o nível do item: ");
                    int nivelPoder = sc.nextInt();
                    item.nome = nome;
                    item.descricao = descricao;
                    item.raro = raro;
                    item.nivelPoder = nivelPoder;
                    break;
                case 2:
                    if (item != null) {
                        System.out.println("Nome: " + item.nome + " Descrição: " + item.descricao + " Raro: " + item.raro + " Nivel de Poder: " + item.nivelPoder);
                    } else {
                        System.out.println("Nenhum item foi Cadastrado!");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando o Programa");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        } while (opcao != 0);
        sc.close();
    }
}
