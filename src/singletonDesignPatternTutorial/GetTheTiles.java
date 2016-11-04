/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonDesignPatternTutorial;
import java.util.LinkedList;
/**
 *
 * @author rtafuni
 */


public class GetTheTiles implements Runnable {
	
	public void run(){

			// How you create a new instance of Singleton
			
			Singleton newInstance = Singleton.getInstance();
			
			// Get unique id for instance object
			
			System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));
			
			// Get all of the letters stored in the List
			
			System.out.println(newInstance.getLetterList());
			
			LinkedList<String> playerOneTiles = newInstance.getTiles(7);
			
			System.out.println("Player 1: " + playerOneTiles);
		
		System.out.println("Got Tiles");
	}
	
}