package spring.framework.escuchadores;

import spring.framework.pojo.Maletero;
import spring.framework.pojo.Motor;
import spring.framework.vehiculos.VehiculoDI;

public class EscuchadorCoche extends Escuchador {

	public EscuchadorCoche() {
		super("coche");
	}

	@Override
	public void accionComando() {
		Motor motor = new Motor("gasolina");
		Maletero maletero = new Maletero(2000);
		VehiculoDI vehiculo = new VehiculoDI("Coche", motor, maletero);
		System.out.println("Creado --> " + vehiculo.identificate());
	}

}