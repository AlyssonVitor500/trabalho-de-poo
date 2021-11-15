package interfaces;

import java.util.List;

import stream.Cliente;


public interface ClienteDAO {

	public List<Cliente> getAllCliente();
	
	public Cliente getAtorById(Long codigo);
	
	public Cliente persisteCliente(Cliente cliente);
	
	public Cliente updateCliente(Cliente cliente, boolean atualizaCamposNulos);
	
	public void deleteCliente(Cliente cliente);
	
}
