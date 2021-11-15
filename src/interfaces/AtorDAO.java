package interfaces;

import java.util.List;

import stream.Atores;

public interface AtorDAO {
	
	public List<Atores> getAllAtores();
	
	public Atores getAtorById(Long codigo);
	
	public Atores persisteAtor(Atores ator);
	
	public Atores updateAtor(Atores ator, boolean atualizaCamposNulos);
	
	public void deleteAtor(Atores ator);

}
