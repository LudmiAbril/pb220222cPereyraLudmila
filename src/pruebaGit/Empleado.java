package pruebaGit;

public class Empleado extends Usuario implements iEmpleado {

	public Empleado(String nombre, Integer id) {
		super(nombre, id);
		
	}

	@Override
	public 	Boolean alimentarGato(String nombreGato, CentralGatuna central) throws NoSeEncontroElGatoConEseNombreException {
		for(Gato e: central.getCajaDeGatos()) {
			if(e.getNombre().equals(nombreGato)) {
				return true;
			}
		} throw new NoSeEncontroElGatoConEseNombreException("no se encontro ese gato");
		
	}

	@Override
	public Boolean entregarGatoAlCliente(String nombreGato, CentralGatuna central, Cliente cliente)
			throws NoSeEncontroElGatoConEseNombreException {
		for(Gato e:central.getCajaDeGatos()) {
			if(e.getNombre().equals(nombreGato)) {
				central.entregarGato(e, cliente);
				return true;
			}
		}
		throw new NoSeEncontroElGatoConEseNombreException("no se encontro al gato");
	}
	
	

}
