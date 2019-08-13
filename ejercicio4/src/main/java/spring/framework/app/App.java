package spring.framework.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.framework.beans.BeanSpring;

// beans + config.properties
public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		try {
			BeanSpring bean1 = context.getBean("bean1", BeanSpring.class);
			System.out.println(bean1.getNombre());

			BeanSpring bean2 = context.getBean("bean2", BeanSpring.class);
			System.out.println(bean2.getNombre());
		} finally {
			context.close();
		}

	}
}