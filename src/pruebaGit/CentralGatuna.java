package pruebaGit;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CentralGatuna {
private String nombreCentral;
private Set<Gato> cajaDeGatos;
private Map<String,String>reviews;

public CentralGatuna(String nombre) {
	this.nombreCentral=nombre;
	this.cajaDeGatos=new HashSet<>();
    this.reviews=new TreeMap<String,String>();
}



public Map<String, String> getReviews() {
	return reviews;
}



public void setReviews(Map<String, String> reviews) {
	this.reviews = reviews;
}

public void registrarReview(String nombreCliente,String review) {
	
}

public void agregarGatoAlaCaja(Gato gato) {
	cajaDeGatos.add(gato);
}

public Integer getCantidadDeGatos() {
	return cajaDeGatos.size();
}

public String getNombreCentral() {
	return nombreCentral;
}

public void setNombreCentral(String nombreCentral) {
	this.nombreCentral = nombreCentral;
}

public Set<Gato> getCajaDeGatos() {
	return cajaDeGatos;
}

public void setCajaDeGatos(Set<Gato> cajaDeGatos) {
	this.cajaDeGatos = cajaDeGatos;
}

public Gato buscarGatoPersa() throws NoHayGatosPersasEnLaCajaException {
	for(Gato g : cajaDeGatos) {
		if(g instanceof Persa) {
			return g;
		}
	} throw new NoHayGatosPersasEnLaCajaException("no hay gatitos persas en la caja aun");
	
}

public Gato buscarGatoMaineCoon() throws NoHayGatosMaineCoonEnLaCajaException {
	for(Gato g : cajaDeGatos) {
		if(g instanceof MaineCoon) {
			return g;
		}
	} throw new NoHayGatosMaineCoonEnLaCajaException("no hay gatitos maine coon en la caja aun");
	
}

public Gato buscarGatoPorNombre(String nombre) throws NoSeEncontroElGatoConEseNombreException {
	for(Gato g :cajaDeGatos) {
		if(g.getNombre().equals(nombre)) {
			return g;
		}
	} throw new NoSeEncontroElGatoConEseNombreException("no se encontro el gato con ese nombre");
	
}

public void entregarGato(Gato gato,Cliente cliente) {
	this.cajaDeGatos.remove(gato);
	cliente.agregarGato(gato);
}



public void agregarReview(String nombreCliente, String review) throws YaSeEnvioEstaReviewException {
	for(Map.Entry<String, String> entry : this.reviews.entrySet()) {
		if(entry.getValue().equals(review)) {
			throw new YaSeEnvioEstaReviewException("esta review ya se envio");
		}
	} this.reviews.put(nombreCliente, review);

}



public String verReviews() {
	String reviews="REVIEWS DE LA CENTRAL";
	for(Map.Entry<String, String> entry : this.reviews.entrySet()) {
		
		reviews+="\n"+entry.getKey()+": "+entry.getValue();
	} return reviews;
	
}

}
