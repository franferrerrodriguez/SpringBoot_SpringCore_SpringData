package spring.framework.pojo;

import spring.framework.interfaces.IInterprete;

public class InterpreteEspanol implements IInterprete {

	@Override
	public void saludar() {
		System.out.print("Hola, mi nombre es ");
	}

	@Override
	public void despedirse() {
		System.out.println("Hasta pronto!");
	}

}