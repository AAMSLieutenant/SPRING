package ru.javabegin.training.spring.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring.impls.robot.ModelT1000;


public class RobotConstructor {
	
	public static void main(String[] args){

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		t1000.fire();
		((ConfigurableApplicationContext)context).close();// закрытие контекста вручную
		
	}
    C:\Users\Rost\Desktop\SPRING\3\lesson_3\RobotImpl2
}
