package spring.framework.escuchadores;

import spring.framework.pojo.Maletero;
import spring.framework.pojo.Motor;
import spring.framework.vehiculos.VehiculoDI;

public class EscuchadorCamion extends Escuchador {

	public EscuchadorCamion() {
		super("camion");
	}

	@Override
	public void accionComando() {
		Motor motor = new Motor("diesel");
		Maletero maletero = new Maletero(5000);
		VehiculoDI vehiculo = new VehiculoDI("Camión", motor, maletero);
		System.out.println("Creado --> " + vehiculo.identificate());
	}

}