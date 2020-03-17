package com.kk.springdiexc;

import com.kk.springdiexc.controllers.ConstructorInjectedController;
import com.kk.springdiexc.controllers.MyController;
import com.kk.springdiexc.controllers.PropertyInjectedController;
import com.kk.springdiexc.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiExcApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDiExcApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("-----Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println("---------Setter");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------------Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
