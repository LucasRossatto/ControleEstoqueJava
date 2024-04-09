package main;

import java.util.Scanner;
import java.util.InputMismatchException;
import model.Alimento;
import model.Eletronico;
import model.Produto;

public class FileTestUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder strB = new StringBuilder();
        menu();
        int escolha;
        try {
            escolha = sc.nextInt();
            switch (escolha) {
                case 1: {
                    try {
                        System.out.println("-- Criando produto");
                        Produto produto = new Produto();

                        System.out.println("-- Digite o Código do Produto");
                        produto.setCodigoProduto(sc.nextInt());

                        System.out.println("-- Digite o nome do Produto");
                        produto.setNomeProduto(sc.next());

                        System.out.println("-- Digite a descrição do Produto");
                        produto.setDescricaoProduto(sc.next());

                        System.out.println("-- Digite a quantidade do estoque do Produto");
                        produto.setQuantidadeEmEstoque(sc.nextInt());

                        System.out.println("-- Digite o preço unitário do produto");
                        produto.setPrecoUnitario(sc.nextDouble());

                        strB.append("Código: ").append(produto.getCodigoProduto() + ", ").append("Nome: ")
                                .append(produto.getNomeProduto() + ", ").append("Descrição: ")
                                .append(produto.getDescricaoProduto() + ", ").append("Quantidade Estoque: ")
                                .append(produto.getQuantidadeEmEstoque() + ", ").append("Preço unidade: ")
                                .append(produto.getPrecoUnitario()).append("\n");
                        produto.gravaEstoque("estoque.txt", strB.toString());
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: entrada inválida.");
                        sc.nextLine(); 
                    }
                    break;
                }

                case 2: {
                    try {
                        System.out.println("-- Criando alimento --");
                        Alimento alimento = new Alimento();

                        System.out.println("-- Digite o Código do Alimento");
                        alimento.setCodigoProduto(sc.nextInt());

                        System.out.println("-- Digite o nome do Alimento");
                        alimento.setNomeProduto(sc.next());

                        System.out.println("-- Digite a descrição do Alimento");
                        alimento.setDescricaoProduto(sc.next());

                        System.out.println("-- Digite a quantidade do estoque do Alimento");
                        alimento.setQuantidadeEmEstoque(sc.nextInt());

                        System.out.println("-- Digite a data de validade do Alimento (formato: dd/mm/aaaa)");
                        alimento.setStrDataValidade(sc.next());

                        System.out.println("-- Digite o preço unitário do Alimento");
                        alimento.setPrecoUnitario(sc.nextDouble());
                        strB.append("Código: ").append(alimento.getCodigoProduto() + ", ").append("Nome: ")
                                .append(alimento.getNomeProduto() + ", ").append("Descrição: ")
                                .append(alimento.getDescricaoProduto() + ", ").append("Quantidade Estoque: ")
                                .append(alimento.getQuantidadeEmEstoque() + ", ").append("Preço unidade: ")
                                .append(alimento.getStrDataValidade() + ", ").append("Data de validade: ")
                                .append(alimento.getPrecoUnitario()).append("\n");
                        alimento.gravaEstoque("estoque.txt", strB.toString());
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: entrada inválida.");
                        sc.nextLine();
                    }
                    break;
                }

                case 3: {
                    try {
                        System.out.println("-- Criando Eletrônico --");
                        Eletronico eletronico = new Eletronico();

                        System.out.println("-- Digite o Código do Eletrônico");
                        eletronico.setCodigoProduto(sc.nextInt());

                        System.out.println("-- Digite o nome do Eletrônico");
                        eletronico.setNomeProduto(sc.next());

                        System.out.println("-- Digite a descrição do Eletrônico");
                        eletronico.setDescricaoProduto(sc.next());

                        System.out.println("-- Digite a quantidade do estoque do Eletrônico");
                        eletronico.setQuantidadeEmEstoque(sc.nextInt());

                        System.out.println("-- Digite a Marca do Eletrônico");
                        eletronico.setStrMarca(sc.next());

                        System.out.println("-- Digite o Modelo do Eletrônico");
                        eletronico.setStrModelo(sc.next());

                        System.out.println("-- Digite o preço unitário do Eletrônico");
                        eletronico.setPrecoUnitario(sc.nextDouble());

                        strB.append("Código: ").append(eletronico.getCodigoProduto() + ", ").append("Nome: ")
                                .append(eletronico.getNomeProduto() + ", ").append("Descrição: ")
                                .append(eletronico.getDescricaoProduto() + ", ").append("Quantidade Estoque: ")
                                .append(eletronico.getQuantidadeEmEstoque() + ", ").append("Preço unidade: ")
                                .append(eletronico.getStrMarca() + ", ").append("Marca: ").append(eletronico.getStrModelo() + ", ")
                                .append("Modelo: ").append(eletronico.getPrecoUnitario()).append("\n");
                        eletronico.gravaEstoque("estoque.txt", strB.toString());
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: entrada inválidam");
                        sc.nextLine(); 
                    }
                    break;
                }

                case 4: {
                    String content = Produto.exibirDetalhes("estoque.txt");
                    System.out.println("Conteúdo lido do arquivo: ");
                    System.out.println(content);
                    break;
                }

                case 9: {
                    System.exit(0);
                }

                default:
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida");
        } finally {
            sc.close(); 
        }

    }

    static public void menu() {
        System.out.println("Digite");
        System.out.println("-- 1 - para criar um Produto --");
        System.out.println("-- 2 - para criar um Alimento --");
        System.out.println("-- 3 - para criar um Eletrônico --");
        System.out.println("-- 4 - Exibir as informações dos produtos do arquivo do estoque --");
        System.out.println("-- 9 - Sair do Sistema --");
    }
}
