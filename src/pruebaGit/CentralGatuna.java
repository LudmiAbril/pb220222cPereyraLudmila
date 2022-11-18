package pruebaGit;

import java.util.HashSet;
import java.util.Set;

public class CentralGatuna {
private String nombreCentral;
private Set<Gato> cajaDeGatos;

public CentralGatuna(String nombre) {
	this.nombreCentral=nombre;
	this.cajaDeGatos=new HashSet<>();
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


}
