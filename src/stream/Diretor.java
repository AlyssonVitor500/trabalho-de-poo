package stream;

import java.util.ArrayList;
import java.util.List;

public class Diretor {
	private String nomeDiretor;
	private List<Produto> portfolio = new ArrayList<Produto>();
	
	public String getNomeDiretor() {
		return nomeDiretor;
	}
	public void setNomeDiretor(String nomeDiretor) {
		this.nomeDiretor = nomeDiretor;
	}
	public List<Produto> getPortfolio() {
		return portfolio;
	}
	public void adicionarProduto(Produto produto) {
		this.portfolio.add(produto);
	}
}
