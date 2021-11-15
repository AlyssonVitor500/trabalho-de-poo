package stream;

import java.util.ArrayList;
import java.util.List;

public class Atores extends Pessoa{
	
	
    private Long anoDeNascimento;
    private List<Produto> portifolio = new ArrayList<Produto>();

    public Long getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(Long anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public List<Produto> getPortifolio() {
        return portifolio;
    }

    public void adicionarProduto(Produto produto) {
        this.portifolio.add(produto);
    }
}
