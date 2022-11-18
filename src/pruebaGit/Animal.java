package pruebaGit;

import java.util.Objects;

public abstract class Animal {
	protected String nombre;
	
	public Animal(String nombre){
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	abstract void hablar();

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass()!= obj.getClass()) {
			return false;
		} Animal other=(Animal)obj;
		return Objects.equals(nombre, other.nombre);
	}
}
