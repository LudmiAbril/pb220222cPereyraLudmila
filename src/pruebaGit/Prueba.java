package pruebaGit;

public class Prueba {

	public static void main(String[] args) {
		System.out.println("holass");
		// esto es un prueba de git para el parcial
		// aca hice otro comentario
		
		
		//pruebas de herencia y casteo/polimorfismo
		Animal gato1=new Gato("pipo");
		Gato gato2=new Persa("mimi");
		Persa gato3=new Persa("pepe");
		
		
		System.out.println("el gato dos dice: ");gato2.hablar();
		System.out.println("el gato uno dice: ");gato1.hablar();
		System.out.println("el gato tres dice: ");gato3.hablar();
		System.out.println("el gato 2 dice: ");((Persa)gato2).saltar();
		System.out.println("el gato 3 dice:");gato3.saltar();
		
		//central gatuna
		
		CentralGatuna central=new CentralGatuna();
		

	}

}
