package spring.framework.app;

import spring.framework.escuchadores.EscuchadorCamion;
import spring.framework.escuchadores.EscuchadorCoche;
import spring.framework.ioc.IOC;
import spring.framework.ioc.NoIOC;

// Ejemplo de inversión de control
public class App {
	public static void main(String[] args) {

		// Ejemplo sin Inversión de Control
		NoIOC noioc = new NoIOC();
		noioc.proceder();

		// Ejemplo con Inversión de Control
		IOC ioc = new IOC();

		ioc.annadirEscuchador(new EscuchadorCoche());
		ioc.annadirEscuchador(new EscuchadorCamion());

		ioc.proceder();
	}
}
