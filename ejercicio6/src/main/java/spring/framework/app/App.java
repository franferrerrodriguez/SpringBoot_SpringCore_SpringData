package spring.framework.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.framework.beans.Traductor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		try {
			Traductor traductorEspanol = context.getBean("TraductorEspanol", Traductor.class);
			traductorEspanol.hablar();

			Traductor traductorIngles = context.getBean("TraductorIngles", Traductor.class);
			traductorIngles.hablar();
		} finally {
			context.close();
		}
    }
}
