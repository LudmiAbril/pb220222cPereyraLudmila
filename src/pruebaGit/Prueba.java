package pruebaGit;

public class Prueba {

	public static void main(String[] args) {
//		System.out.println("holass");
		// esto es un prueba de git para el parcial
		// aca hice otro comentario
		
		
		//pruebas de herencia y casteo/polimorfismo
//		Animal gato1=new Gato("pipo");
//		Gato gato2=new Persa("mimi");
//		Persa gato3=new Persa("pepe");
//		
		
//		System.out.println("el gato dos dice: ");gato2.hablar();
//		System.out.println("el gato uno dice: ");gato1.hablar();
//		System.out.println("el gato tres dice: ");gato3.hablar();
//		System.out.println("el gato 2 dice: ");((Persa)gato2).saltar();
//		System.out.println("el gato 3 dice:");gato3.saltar();
		
		//central gatuna
		
		CentralGatuna central=new CentralGatuna("Michigan");
		System.out.println("se creo la central " +central.getNombreCentral());
		
		// agregar gatos de distintos tipo a una caja y chequeao que no se repitan
		Gato gato1=new Gato("pelusa");
		Gato gato2=new Persa("persita");
		Gato gato3= new MaineCoon("mishi");
		
		central.agregarGatoAlaCaja(gato1);
		central.agregarGatoAlaCaja(gato2);
		central.agregarGatoAlaCaja(gato3);
		central.agregarGatoAlaCaja(gato3);
		System.out.println("se agregaron " + central.getCantidadDeGatos() + " gatos a la caja");
		
		// busco un gato de un tipo
		
		Gato prs;
		try {
			prs=central.buscarGatoPersa();
			System.out.println("el gato persa es : " + prs.getNombre());
		} catch (NoHayGatosPersasEnLaCajaException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		Gato maine;
		try {
			maine = central.buscarGatoMaineCoon();
			System.out.println("el gato maine coon es : " + maine.getNombre());
		} catch (NoHayGatosMaineCoonEnLaCajaException e) {
			System.out.println(e.getMessage());
		}
		
		// busco un gato por nombre
		
		try {
			Gato gatoBuscado=central.buscarGatoPorNombre("mishi");
			System.out.println("se encontro a " + gatoBuscado.getNombre());
		} catch (NoSeEncontroElGatoConEseNombreException e) {
			System.out.println(e.getMessage());
		}
		
		//Creo usuarios empleado de la Central y cliente de la central
		
		Usuario empleado = new Empleado("richard", 12);
		Usuario cliente=new Cliente("lucia",23);
		
		// le agrego un gato al cliente y hago que el cliente lo registre en la central
		Gato gatoDelCliente=new Persa("pipi");
		((Cliente)cliente).agregarGato(gatoDelCliente);
		try {
//			central.agregarGatoAlaCaja(gatoDelCliente);
			((Cliente)cliente).registrarGatoEnLaCentral(gatoDelCliente, central);
			System.out.println("se registro el gato en la central, ahora mismo se encuentra en la caja");
		} catch (GatoYaRegistradoException e) {
			System.out.println(e.getMessage());
		}
		
		// el empleado puede alimentar a los gatos buscandolos por su nombre
		try {
			((Empleado)empleado).alimentarGato(gatoDelCliente.getNombre(), central);
			System.out.println("se alimento a " + gatoDelCliente.getNombre());
		} catch (NoSeEncontroElGatoConEseNombreException e) {
			System.out.println(e.getMessage());
		}
		
		//el usuario puede dejar un review en la central y retirarlo
		try {
			((Empleado)empleado).entregarGatoAlCliente(gatoDelCliente.getNombre(), central, (Cliente) cliente);
			System.out.println("se entrego el gato al cliente " + cliente.getNombre());
		} catch (NoSeEncontroElGatoConEseNombreException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		

	}

}
