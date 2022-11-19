package pruebaGit;

public interface iCliente {

	abstract Boolean registrarGatoEnLaCentral(Gato gato, CentralGatuna central) throws GatoYaRegistradoException;
	abstract void enviarReview( String nombreCliente,String review,CentralGatuna central) throws YaSeEnvioEstaReviewException;
}
