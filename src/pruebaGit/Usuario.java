package pruebaGit;

public class Usuario {
	protected String nombre;
	protected Integer id;
	
	public Usuario(String nombre, Integer id) {
		this.nombre=nombre;
		this.id=id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
