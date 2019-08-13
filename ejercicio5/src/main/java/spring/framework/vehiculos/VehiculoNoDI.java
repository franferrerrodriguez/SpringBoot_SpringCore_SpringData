package spring.framework.vehiculos;

import spring.framework.pojo.Maletero;
import spring.framework.pojo.Motor;

public class VehiculoNoDI {

	private String tipoVehiculo;
	private Motor motor;
	private Maletero maletero;

	public VehiculoNoDI(String tipoVehiculo, String tipoMotor, int capacidadMaletero) {
		this.tipoVehiculo = tipoVehiculo;
		this.motor = new Motor(tipoMotor);
		this.maletero = new Maletero(capacidadMaletero);
	}

	public String identificate() {
		return "Soy un '" + tipoVehiculo + "' con motor '" + motor.getTipo() + "' y capacidad de maletero '"
				+ maletero.getCapacidad() + "' litros";
	}

}