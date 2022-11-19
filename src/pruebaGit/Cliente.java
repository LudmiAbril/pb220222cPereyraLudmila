package pruebaGit;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public class Cliente extends Usuario implements iCliente {
	private ArrayList<Gato> GatosDelCliente;

	public Cliente(String nombre, Integer id) {
		super(nombre, id);
		this.GatosDelCliente=new ArrayList<Gato>();
	}

	@Override
	public Boolean registrarGatoEnLaCentral(Gato gato, CentralGatuna central) throws GatoYaRegistradoException {
		for(Gato e : central.getCajaDeGatos()) {
			if(e.equals(gato)) {
				throw new GatoYaRegistradoException("el gato ya esta registrado en la central");
			} 
		}central.agregarGatoAlaCaja(gato);
		return true;
	}

	public ArrayList<Gato> getGatosDelCliente() {
		return GatosDelCliente;
	}

	public void setGatosDelCliente(ArrayList<Gato> gatosDelCliente) {
		GatosDelCliente = gatosDelCliente;
	}
	
	public void agregarGato(Gato gato) {
		this.GatosDelCliente.add(gato);
	}

	@Override
	public void enviarReview(String nombreCliente, String review, CentralGatuna central)
			throws YaSeEnvioEstaReviewException {
		
		central.agregarReview(nombreCliente,review);
	}

	
}
