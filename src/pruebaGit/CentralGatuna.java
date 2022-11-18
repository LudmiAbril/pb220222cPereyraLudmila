package pruebaGit;

import java.util.HashSet;
import java.util.Set;

public class CentralGatuna {
private String nombreCentral;
private Set<Animal> cajaDeGatos;

public CentralGatuna(String nombre) {
	this.nombreCentral=nombre;
	this.cajaDeGatos=new HashSet<>();
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

public Set<Animal> getCajaDeGatos() {
	return cajaDeGatos;
}

public void setCajaDeGatos(Set<Animal> cajaDeGatos) {
	this.cajaDeGatos = cajaDeGatos;
}


}
