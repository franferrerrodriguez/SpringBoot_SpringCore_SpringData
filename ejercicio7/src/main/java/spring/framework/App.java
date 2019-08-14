package spring.framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "spring.framework" })
public class App {

	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		try {
			ctx.register(App.class);
			ctx.refresh();
			System.out.println("Contains aaaa?: " + ctx.containsBean("aaaa"));
		} finally {
			ctx.close();
		}
	}
}