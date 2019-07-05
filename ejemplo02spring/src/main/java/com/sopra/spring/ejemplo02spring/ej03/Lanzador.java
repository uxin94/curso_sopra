package com.sopra.spring.ejemplo02spring.ej03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lanzador {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ej03.xml");
		Cubata cerveza = context.getBean("cubataDeCerveza", Cubata.class);
		System.out.println(cerveza);
		Cubata vinate = context.getBean("copaDeVino", Cubata.class);
		System.out.println(vinate);
		Cubata miCaña = context.getBean("cañaDeAndrea", Cubata.class);
		System.out.println(miCaña);
		Licor licor = context.getBean("vinate", Licor.class);
		miCaña.setLicor(licor);
		
		Cubata miCañaSingleton = context.getBean("cañaDeAndrea", Cubata.class);
		System.out.println(miCañaSingleton);

	}

}
