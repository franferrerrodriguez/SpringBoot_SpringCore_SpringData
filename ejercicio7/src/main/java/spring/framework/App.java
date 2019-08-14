package spring.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.framework.interfaces.ITraductor;

public class App {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application-context.xml" });
		ITraductor cust = (ITraductor) context.getBean("aaaa");
		System.out.println(cust.getNombre());
	}
}