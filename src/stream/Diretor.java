package stream;

import java.util.ArrayList;
import java.util.List;

public class Diretor extends Pessoa{

	private List<Produto> portfolio = new ArrayList<Produto>();

    public List<Produto> getPortfolio() {
        return portfolio;
    }

    public void adicionarProduto(Produto produto) {
        this.portfolio.add(produto);
    }
}
