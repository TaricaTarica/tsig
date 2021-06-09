package datos;

import java.util.List;

import javax.ejb.Local;

import datatypes.DTLineaSimple;
import entities.Linea;

@Local
public interface DatosLineaLocal {
	
	public void altaLinea(Linea linea);
	
	public void modificarLinea(Linea linea);
	
	public void eliminarLinea(Linea linea);
	
	public Linea buscarLinea(int gid);
	
	public List<DTLineaSimple> listarLineas();
	
	List<DTLineaSimple> listarLineaCompania(int id);
}
