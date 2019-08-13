package spring.framework.ioc;

import spring.framework.Util.Leer;
import spring.framework.pojo.Maletero;
import spring.framework.pojo.Motor;
import spring.framework.vehiculos.VehiculoDI;

public class NoIOC {

	public void proceder() {

		Leer entradaComando = new Leer();

		boolean pedirEntrada = true;
		while (pedirEntrada) {

			String comando = entradaComando.recogerComando();

			switch (comando) {
			case "coche":
				crearCoche();
				break;
			case "camion":
				crearCamion();
				break;
			}

		}

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