package interfaces;

import java.util.List;

import stream.Diretor;


public interface DiretorDAO {

	public List<Diretor> getAllDiretores();
	
	public Diretor getAtorById(Long codigo);
	
	public Diretor persisteDiretor(Diretor deiretor);
	
	public Diretor updateDiretor(Diretor diretor, boolean atualizaCamposNulos);
	
	public void deleteDiretor(Diretor diretor);
	
}
