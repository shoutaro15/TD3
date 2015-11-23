package fr.uvsq.coo.exo3_9.fr;

public class Calculatrice extends Interpreteur{
	
	public Calculatrice( ) {
		set.put("quit" , new Quit ( ) ) ;
		set.put("undo" , new Undo(history) ) ;
		set.put( "+" , new Plus(history) ) ;
		set.put( "-" , new Moins(history) ) ;
		set.put( "*" , new Multiplication(history) ) ;
		set.put( "/" , new Division(history) ) ;
		//set.put("accept" ,new Accept(history) ) ;
		}
	
}
