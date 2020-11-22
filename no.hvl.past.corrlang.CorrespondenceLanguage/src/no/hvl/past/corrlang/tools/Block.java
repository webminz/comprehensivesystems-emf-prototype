package no.hvl.past.corrlang.tools;

public abstract class Block<M> {

	public <I> void sendTo(Block<I> target, I input) {
		
	}
	
	public abstract void receive(M message);
	
}
