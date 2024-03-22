package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

import model.Produto;

public class FileTestUser {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Produto	produto = new Produto();
	
	//private int codigoProduto;
	//private String  nomeProduto;
	//private String descricaoProduto;
	//private int quantidadeEmEstoque;
	//private double precoUnitario;
	
	System.out.println("Digite o nome do Produto");
	produto.setNomeProduto(sc.next());
	System.out.println("Digite a descricao do Produto");
	produto.setDescricaoProduto(sc.next());
	System.out.println("Digite a qauntidade do estoque do Produto");
	produto.setQuantidadeEmEstoque(sc.nextInt());
	System.out.println();
	}

}
