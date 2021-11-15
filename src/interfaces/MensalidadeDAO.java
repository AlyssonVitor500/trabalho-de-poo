package interfaces;

import java.util.List;

import stream.Mensalidade;


public interface MensalidadeDAO {
	
	public List<Mensalidade> getAllMensalidade();
	
	public Mensalidade getAtorById(Long codigo);
	
	public Mensalidade persisteMensalidade(Mensalidade mensalidade);
	
	public Mensalidade updateMensalidade(Mensalidade mensalidade, boolean atualizaCamposNulos);
	
	public void deleteMensalidade(Mensalidade mensalidade);

}
