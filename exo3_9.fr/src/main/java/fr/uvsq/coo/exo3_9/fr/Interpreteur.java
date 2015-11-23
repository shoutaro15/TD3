package fr.uvsq.coo.exo3_9.fr;

import java.util.Hashtable;
import java.util.Stack;

public class Interpreteur  {
	protected Stack<String> history = new Stack<String>();
	protected Hashtable<String,Commande> set = new Hashtable<String,Commande>();
	
	
	public void session ()
	{
		while(true)
		{
			Commande commande = getNewCommande();
			if (commande instanceof Quit) {
				return ;
				} 
			else {
				commande.execute ( ) ;
				}
		}
	}
	
	protected Commande getNewCommande ( ) 
	{
	  String s = System.in.toString() ;
	  while ( ! set.containsKey(s) ) 
	   {
		System.out.println("Not a valid command; try again!") ;
		 s = System.in.toString() ;
	   }
	  return ((Commande) set.get(s)) ;
	 }
		

	
	
}
	

	

