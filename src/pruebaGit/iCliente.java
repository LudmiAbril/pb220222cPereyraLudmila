package pruebaGit;

public interface iCliente {

	abstract Boolean registrarGatoEnLaCentral(Gato gato, CentralGatuna central) throws GatoYaRegistradoException; 
}
