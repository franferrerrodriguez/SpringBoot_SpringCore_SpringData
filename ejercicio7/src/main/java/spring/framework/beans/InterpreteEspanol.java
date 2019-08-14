package spring.framework.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.framework.interfaces.IInterprete;

@Component
@Qualifier("IE")
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