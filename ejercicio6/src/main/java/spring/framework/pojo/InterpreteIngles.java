package spring.framework.pojo;

import spring.framework.interfaces.IInterprete;

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