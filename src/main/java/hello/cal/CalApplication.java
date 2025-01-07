package hello.cal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class CalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalApplication.class, args);

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		CalAssembler calAssembler = ctx.getBean("calAssembler", CalAssembler.class);

		calAssembler.assemble();

		ctx.close();
	}

}
