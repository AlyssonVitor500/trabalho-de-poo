package interfaces;

import java.util.List;

import stream.Produto;


public interface ProdutoDAO {

	public List<Produto> getAllProdutos();
	
	public Produto getAtorById(Long codigo);
	
	public Produto persisteProduto(Produto produto);
	
	public Produto updateProduto(Produto produto, boolean atualizaCamposNulos);
	
	public void deleteProduto(Produto produto);
	
}
