package spring.framework.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.framework.interfaces.IInterprete;

@Component
@Qualifier("II")
public class InterpreteIngles implements IInterprete {

	@Override
	public void saludar() {
		System.out.print("Hello, my name is ");
	}

	@Override
	public void despedirse() {
		System.out.println("Good bye!");
	}

}