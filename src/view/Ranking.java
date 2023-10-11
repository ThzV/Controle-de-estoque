package view;

import javax.swing.JOptionPane;

import controle.Estoque;
import modelo.Produto;

public class Ranking {
	public Ranking(Estoque estoque) {

		Produto produto = estoque.produtoMaisVendido();
		int valor = produto.getQuantidadeVendida();

		JOptionPane.showMessageDialog(null, "Produto que mais vendeu.\n " + "\nNome: " + produto.getNome() + "\nCategoria: " + produto.getCategoria() + "\nPreço: "
				+ produto.getPreco() + "\nQunt. disponível: " + produto.getQuantidade() + "\nTotal Vendido: " + valor 
				+ "\nOpiniões: " + produto.getComentario());

	}
}
