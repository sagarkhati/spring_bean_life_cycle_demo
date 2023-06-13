package com.ssk.child.sblc_with_xml_config_demo;

import java.util.stream.Stream;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SblcWithXmlConfigDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println("Start - Listing available bean ===================");
		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("End - Listing available bean ===================");

		((AbstractApplicationContext) context).close();
	}

}
