package de.hhu.stups.springhello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import de.hhu.stups.springhello.pojos.SequenceGenerator;

@Component
public class Hello2 {

	@Autowired
	private SequenceGenerator gen;

	public void run() {
		int[] sequence = gen.getSequence(10);
		for (int element : sequence) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		// try with resource (Java 7): Automatsches Schliessen der Resource

		try (AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
			Hello2 gen = context.getBean(Hello2.class);
			gen.run();
		}
	}
}
