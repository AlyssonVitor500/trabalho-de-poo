package interfaces;

import java.util.List;

import stream.Genero;


public interface GeneroDAO {

	public List<Genero> getAllGenero();
	
	public Genero getGeneroById(Long codigo);
	
	public Genero persisteGenero(Genero genero);
	
	public Genero updateGenero(Genero genero, boolean atualizaCamposNulos);
	
	public void deleteGenero(Genero genero);
	
}
