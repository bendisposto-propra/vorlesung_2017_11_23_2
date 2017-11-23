package de.hhu.stups.springhello.pojos;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RandomNumberGenerator implements NumberGenerator {

	@Autowired
	private Random random;

	public void setRandom(Random random) {
		this.random = random;
	}

	@Override
	public int nextNumber() {
		return random.nextInt();
	}

}
