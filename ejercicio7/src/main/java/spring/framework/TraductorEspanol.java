package spring.framework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import spring.framework.interfaces.ITraductor;

@Component("aaaa")
public class TraductorEspanol implements ITraductor {

	@Value("Fran")
	private String nombre;

//	@Autowired
//	@Qualifier("a")
//	private IInterprete interprete;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//	public IInterprete getInterprete() {
//		return interprete;
//	}
//	
//	public void setInterprete(IInterprete interprete) {
//		this.interprete = interprete;
//	}
//	
//	public void hablar() {
//		interprete.saludar();
//		System.out.println(this.nombre + "\n");
//		interprete.despedirse();
//		System.out.println("\n");
//	}

}