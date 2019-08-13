package spring.framework.vehiculos;

import spring.framework.pojo.Maletero;
import spring.framework.pojo.Motor;

public class VehiculoDI {

	private String tipoVehiculo;
	private Motor motor;
	private Maletero maletero;
	
	public VehiculoDI(String tipoVehiculo, Motor motor, Maletero maletero) {
		this.tipoVehiculo = tipoVehiculo;
		this.motor = motor;
		this.maletero = maletero;
	}
	
	public String identificate() {
		return "Soy un '" + tipoVehiculo + "' con motor '" + motor.getTipo() + "' y capacidad de maletero '" + maletero.getCapacidad() + "' litros";
	}
	
}
