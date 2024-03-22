package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Produto {

	private int codigoProduto;
	private String nomeProduto;
	private String descricaoProduto;
	private int quantidadeEmEstoque;
	private double precoUnitario;

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	// exibirDetalhes(): Retorna uma String com as informações do produto no arquivo
	// estoque.txt
	// gravaEstoque(int codigo, String nome): Grava os dados informados no arquivo
	// estoque.txt

	public static String exibirDetalhes(String fileName) {
	        StringBuilder content = new StringBuilder(); // Cria um objeto StringBuilder para armazenar o conteúdo do arquivo
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { // Abre o arquivo para leitura
	            String line; // Declara uma variável para armazenar cada linha lida do arquivo
	            while ((line = reader.readLine()) != null) { // Lê cada linha do arquivo até o final
	                content.append(line).append("\n"); // Adiciona a linha lida ao StringBuilder
	            }
	        } catch (IOException e) { // Captura exceções de entrada/sa

				System.out.println("Erro ao ler o arquivo: " + e.getMessage());
			}
			return content.toString();
		}

	public static void gravaEstoque(String fileName, String content) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) { // Abre o arquivo para escrita
	            writer.newLine(); // Adicionar novo conteudo
	        	writer.write(content); // Escreve o conteúdo no arquivo
	            System.out.println("Conteúdo escrito no arquivo com sucesso"); // Exibe uma mensagem indicando que a operação foi bem-sucedida
	        } catch (IOException e) { // Captura exceções de entrada/saída
	            System.out.println("Erro ao escrever no arquivo: " + e.getMessage()); // Exibe uma mensagem de erro caso ocorra uma exceção
	        }
	    }
}
