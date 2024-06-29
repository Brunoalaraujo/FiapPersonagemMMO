package br.com.fiap.game.view;

import br.com.fiap.game.model.Item;

import java.util.Scanner;

public class ItemView {
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
                    item.setNome(nome).setDescricao(descricao).setRaro(raro).setNivelPoder(nivelPoder);
                    break;
                case 2:
                    if (item != null) {
                        System.out.println("Nome: " + item.getNome() + " Descrição: " + item.getDescricao() + " Raro: " + item.isRaro() + " Nivel de Poder: " + item.getNivelPoder());
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
