package spring.framework.beans;

import spring.framework.interfaces.IInterprete;

public class Traductor {

	private String nombre;
	private IInterprete interprete;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public IInterprete getInterprete() {
		return interprete;
	}
	
	public void setInterprete(IInterprete interprete) {
		this.interprete = interprete;
	}
	
	public void hablar() {
		interprete.saludar();
		System.out.println(this.nombre + "\n");
		interprete.despedirse();
		System.out.println("\n");
	}
	
}