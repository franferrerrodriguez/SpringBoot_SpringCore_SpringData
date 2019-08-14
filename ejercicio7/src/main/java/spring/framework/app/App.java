package spring.framework.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.framework.interfaces.ITraductor;

@Configuration
@ComponentScan(basePackages = { "spring.framework.beans" })
public class App {

	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		try {
			ctx.register(App.class);
			ctx.refresh();

			// Bean traductorEspanol
			System.out.println("¿Contains bean traductorEspanol? " + ctx.containsBean("traductorEspanol"));
			ITraductor traductorEspanol = ctx.getBean("traductorEspanol", ITraductor.class);
			traductorEspanol.hablar();

			// Bean traductorIngles
			System.out.println("¿Contains bean traductorIngles? " + ctx.containsBean("traductorIngles"));
			ITraductor traductorIngles = ctx.getBean("traductorIngles", ITraductor.class);
			traductorIngles.hablar();

		} finally {
			ctx.close();
		}
	}
}