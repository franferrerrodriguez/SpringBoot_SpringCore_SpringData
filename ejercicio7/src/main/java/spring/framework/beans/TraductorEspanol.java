package spring.framework.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import spring.framework.interfaces.IInterprete;
import spring.framework.interfaces.ITraductor;

@Component
public class TraductorEspanol implements ITraductor {

	@Value("Fran")
	private String nombre;

	@Autowired
	@Qualifier("IE")
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