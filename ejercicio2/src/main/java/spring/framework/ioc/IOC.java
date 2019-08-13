package spring.framework.ioc;

import java.util.ArrayList;
import java.util.List;

import spring.framework.Util.Leer;
import spring.framework.escuchadores.Escuchador;
import spring.framework.pojo.Maletero;
import spring.framework.pojo.Motor;
import spring.framework.vehiculos.VehiculoDI;

public class IOC {

	List<Escuchador> listaEscuchadores = new ArrayList<Escuchador>();

	public void proceder() {

		Leer entradaComando = new Leer();

		boolean pedirEntrada = true;
		while (pedirEntrada) {

			String comando = entradaComando.recogerComando();

			boolean encontrado = false;
			for (Escuchador escuchadorComando : listaEscuchadores) {
				if (escuchadorComando.getNombreComando().equals(comando)) {
					encontrado = true;
					escuchadorComando.accionComando();
				}
			}

		}

	}

	public void annadirEscuchador(Escuchador escuchadorComando) {
		listaEscuchadores.add(escuchadorComando);
	}

	private void crearCoche() {
		Motor motor = new Motor("gasolina");
		Maletero maletero = new Maletero(200);
		VehiculoDI vehiculo = new VehiculoDI("Coche", motor, maletero);
		System.out.println("Creado --> " + vehiculo.identificate());
	}

	private void crearCamion() {
		Motor motor = new Motor("gasoil");
		Maletero maletero = new Maletero(500);
		VehiculoDI vehiculo = new VehiculoDI("Camión", motor, maletero);
		System.out.println("Creado --> " + vehiculo.identificate());
	}

}