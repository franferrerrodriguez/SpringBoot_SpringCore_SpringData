package spring.framework.escuchadores;

public abstract class Escuchador {

	private String nombre_comando;

	public Escuchador(String nombre_comando) {
		this.nombre_comando = nombre_comando;
	}

	public String getNombreComando() {
		return nombre_comando;
	}

	public void setNombreComando(String nombre_comando) {
		this.nombre_comando = nombre_comando;
	}

	public abstract void accionComando();

}