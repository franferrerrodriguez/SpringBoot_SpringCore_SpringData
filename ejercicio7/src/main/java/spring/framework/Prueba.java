package spring.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.framework.interfaces.ITraductor;

@Component
class Prueba {

	@Autowired
	ITraductor te;

	public void prueba() {
		te.getNombre();
	}

}