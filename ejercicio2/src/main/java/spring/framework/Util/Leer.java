package spring.framework.Util;

import java.util.Scanner;

public class Leer {

	Scanner scanner = new Scanner(System.in);

	public String recogerComando() {
		System.out.print("Introduce vehículo: ");
		return scanner.next();
	}

}