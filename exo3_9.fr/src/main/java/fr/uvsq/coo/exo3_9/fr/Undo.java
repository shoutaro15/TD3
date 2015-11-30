package fr.uvsq.coo.exo3_9.fr;

import java.util.Stack;

public class Undo  extends Commande{
	protected Stack<String> history;
	
	public Undo(Stack<char[]> h)
	{
		history = h;
		
	}

	@Override
	public Stack<String> execute() {
		history.pop();
		return history;
	}

}
