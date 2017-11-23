package de.hhu.stups.springhello.pojos;

// @Component
public class SequenceNumberGenerator implements NumberGenerator {

	private volatile int c = 0;

	@Override
	public int nextNumber() {
		return c++;
	}

}
