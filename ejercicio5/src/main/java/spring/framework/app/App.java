package spring.framework.app;

import spring.framework.pojo.Maletero;
import spring.framework.pojo.Motor;
import spring.framework.vehiculos.VehiculoDI;
import spring.framework.vehiculos.VehiculoNoDI;

//Ejemplo de inyección de dependencias con spring bean
public class App {
	public static void main(String[] args) {
		// Ejemplo de Inyección de Dependencias sin Inversión de Control
		VehiculoNoDI vehiculo1 = new VehiculoNoDI("CamionNoDi", "gasoil", 500);
		System.out.println(vehiculo1.identificate());

		// Ejemplo de Inyección de Dependencias con Inversión de Control
		VehiculoDI vehiculo2 = new VehiculoDI("CocheDI", new Motor("gasolina"), new Maletero(200));
		System.out.println(vehiculo2.identificate());
	}
}