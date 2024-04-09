package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Produto {

	private int intCodigoProduto;
	private String strNomeProduto;
	private String strDescricaoProduto;
	private int intQuantidadeEmEstoque;
	private double doublePrecoUnitario;

	public int getCodigoProduto() {
		return intCodigoProduto;
	}

	public void setCodigoProduto(int intCodigoProduto) {
		this.intCodigoProduto = intCodigoProduto;
	}

	public String getNomeProduto() {
		return strNomeProduto;
	}

	public void setNomeProduto(String strNomeProduto) {
		this.strNomeProduto = strNomeProduto;
	}

	public String getDescricaoProduto() {
		return strDescricaoProduto;
	}

	public void setDescricaoProduto(String strDescricaoProduto) {
		this.strDescricaoProduto = strDescricaoProduto;
	}

	public int getQuantidadeEmEstoque() {
		return intQuantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int intQuantidadeEmEstoque) {
		this.intQuantidadeEmEstoque = intQuantidadeEmEstoque;
	}

	public double getPrecoUnitario() {
		return doublePrecoUnitario;
	}

	public void setPrecoUnitario(double doublePrecoUnitario) {
		this.doublePrecoUnitario = doublePrecoUnitario;
	}

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
