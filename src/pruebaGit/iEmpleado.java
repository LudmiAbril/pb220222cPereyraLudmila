package pruebaGit;

public interface iEmpleado {

	abstract Boolean alimentarGato(String nombreGato, CentralGatuna central) throws NoSeEncontroElGatoConEseNombreException;
	
	abstract Boolean entregarGatoAlCliente(String nombreGato, CentralGatuna central,Cliente cliente) throws NoSeEncontroElGatoConEseNombreException;


}
